package com.example.democy;

import java.util.ArrayList;
import java.util.List;

public class JvmGc {

    private String gc;

    public static void main(String [] args){
       List list = new ArrayList<byte[]>();
       int i =0;
    boolean flag =true;
           try {
               while(flag){
               i++;
               ((ArrayList) list).add(new byte[1024*1024]);
               Thread.sleep(40);
                }
           } catch (InterruptedException e) {
               e.printStackTrace();
             //  flag =false;
               System.out.println(i);
           }

    }
}
