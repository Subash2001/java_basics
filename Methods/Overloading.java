package com.subash;
public class Overloading {
    public static void main(String[] args) {
        // two are more function having a same name but different parameter called overloading.
        // same type of data types with variables also work
        fun(33);
        fun("subash");
        int ans =  sum(33,21, 39);
        System.out.println(ans);
    }
    static void fun(int a ){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    // return type
    static int sum(int a , int b){
        return a + b;

    }
    static int sum (int a, int b, int c){
        return a+b+c;
    }

}
