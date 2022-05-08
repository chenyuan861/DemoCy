package com.example.democy.queque;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlock {


    public static void main(String[] args) throws  Exception{
        ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
        ArrayList list   = new ArrayList(3);
        for(int i=1;i<=10;i++){
            queue.put(Integer.valueOf(i));
         //   list.add(i);
            System.out.println("放入第"+i);
        }

    }
}
