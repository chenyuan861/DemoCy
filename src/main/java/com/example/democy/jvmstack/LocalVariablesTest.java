package com.example.democy.jvmstack;

import java.util.Date;

public class LocalVariablesTest {
    private int count =0;

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();
    }
    public void test1(){
       Date date = new Date();
       String name1 ="atguigu.com";
       String info = test2(date,name1);
       System.out.println(date+name1);
    }
    public String test2(Date dateP,String name2){
        dateP = null;
        name2 ="songhongkang";
        double weight = 130.5 ;
        char gender ='男';
        return dateP+name2 ;
    }
    public void test3(){
        count ++;
    }
    public void test4(){
      int a =0 ;
        {
             int b =0;
             b = a+1;
        }
        int c = a +1 ;
    }
}
