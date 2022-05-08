package com.example.democy;

public class TestMain {
    private int age ;

    public int add(){
        int a =1;
        int b = 3;
        int c = b *(a+b);
        return c ;
    }
    public static void main(String[] args){
        TestMain demo = new TestMain();
         int result = demo.add();
        System.out.println(result);

    }
}
