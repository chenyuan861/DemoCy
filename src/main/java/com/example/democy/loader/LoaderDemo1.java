package com.example.democy.loader;

class Person{

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class LoaderDemo1 {
    public static void main(String[] args) {
        ClassLoader classLoader = String.class.getClassLoader();
        ClassLoader classLoader1 = Person.class.getClassLoader();
        ClassLoader classLoader2 = Thread.currentThread().getContextClassLoader();
        ClassLoader classLoader3 = ClassLoader.getSystemClassLoader();

        System.out.println("Java的 String类加载器:"+classLoader);
        System.out.println("Java 关键的类加载:"+classLoader1);
        System.out.println("Java 线程的类加载器:"+classLoader2);
        System.out.println("Java 线程的类加载器:"+classLoader3);
    }
}
