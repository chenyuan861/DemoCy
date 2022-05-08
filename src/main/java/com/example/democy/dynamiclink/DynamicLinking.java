package com.example.democy.dynamiclink;

/**
 * 指向运行时候的方法引用
 */
public class DynamicLinking {
    int num =10;
    public void methodA(){
        System.out.println("methodA..");
    }

    public void methodB(){
        System.out.println("methodB...");
        methodA();
        num++;
    }
}
