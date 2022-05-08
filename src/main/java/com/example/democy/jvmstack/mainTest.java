package com.example.democy.jvmstack;

/**
 *  设置虚拟机栈 -Xss  11415
 *  -Xss  虚拟机栈   2461
 */
public class mainTest {
    private static int count =1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
