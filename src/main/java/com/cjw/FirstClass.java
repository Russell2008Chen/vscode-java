package com.cjw;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello FirstClass");
        
        SecondClassV2 secondClass = new SecondClassV2();
        String result = secondClass.getSecondString("From First Class");
        System.out.println("这是我的第一个Java程序！-003: " + result);
        System.out.println("这是我的第一个Java程序！-002");

        System.out.println("Hello End! V2");
    }
}
