package com.subash;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,2,2,4,6,7654,3,62,9);
        multiple(21,89, "hey" , "subash"); // "hey" , "subash" this is a multiple length arguments
        demo(74,34,39,64,32,89);
        demo("sus"); // cannot be duplicate in terms of overriding varargs cant be empty


    }

    // variable length arguments
    static void fun (int ...v){ // int...v this internally taking array of on integer or ( collection on integer )
        System.out.println(Arrays.toString(v));

    }

    // multiple
    static void multiple (int a, int b, String ...s){

    }

    static void demo (int ...a){
        System.out.println(Arrays.toString(a));

    }
    static void demo (String ...a ){
        System.out.println(Arrays.toString(a));

    }

}
