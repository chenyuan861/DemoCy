package face;

import java.util.ArrayList;

class Wo{
    private  int id;
    private  String  name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Woto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class WoBox{
     private  ArrayList<Wo> list = new ArrayList<Wo>( 10);

     public synchronized void  add(Wo wo){
         while(list.size() == 5 ){
             try {
                 System.out.println("10个数字已满，进入等待期");
                 this.wait();
                 System.out.println("10个数字已x消费，远离等待期");
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }

     }



}
class Producer {


        }

public class cyTest {
    public  synchronized void say() throws InterruptedException {
        System.out.println("hello ketty start!");
        notify();
        System.out.println("hello ketty end !");
    }

    public static void main(String[] args) throws InterruptedException {
         int a=10;
        cyTest test = new cyTest();
        System.out.println(a);
        test.say();

    }
}
