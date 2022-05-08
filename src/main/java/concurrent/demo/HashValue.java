package concurrent.demo;

import java.util.*;

public class HashValue {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("Aa","BB","C#");
        Map map = new HashMap<>();
        for (String s:list){
            System.out.println(s.hashCode());
            map.put(s,s);
        }
        System.out.println(3^1);

    }
}
