package com.subash;

public class Message {
    public static void main(String[] args) {
        method1();
    }

    static void method1 (){
        System.out.println("hello world");
        method2();
    }
    static void method2 (){
        System.out.println("hello world");
        method3();
    }
    static void method3 (){
        System.out.println("hello world ");
        method4();
    }
    static void method4 (){
        System.out.println("hello world");
        method();
    }
    static void method (){
        System.out.println("hello world");
    }
}