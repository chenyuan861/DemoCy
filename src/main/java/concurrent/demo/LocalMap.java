package concurrent.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class LocalMap {
    public static ThreadLocal<String> local= new ThreadLocal<String>();

    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        ConcurrentHashMap cmap =new ConcurrentHashMap();
        List list = new ArrayList<>();
         local.set(Thread.currentThread().getName());
         new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            local.set(Thread.currentThread().getName());
            System.out.println(local.get());
        }).start();
        new Thread(()->{
            local.set(Thread.currentThread().getName());
            System.out.println(local.get());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(local.get());

    }
}
