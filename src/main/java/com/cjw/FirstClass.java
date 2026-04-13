package com.cjw;

public class FirstClass {
    public static void main(String[] args) {
        SecondClassV2 secondClass = new SecondClassV2();
        String result = secondClass.getSecondString("From First Class");
        System.out.println("这是我的第一个Java程序！-003: " + result);
    }
}
