package com.subash;

public class Swap {
    public static void main(String[] args) {
        int a  = 10;
        int b = 20;

        // swap two numbers
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

        // swap using Method
        swap (30,20);
        //System.out.println(a + " " + b);

        // swap using String: its also not change
        String name = "Subash";
        ChangeName(name);
        System.out.println(name);


    }
    // it is not swap the variables
    // it is pass by value
    static void swap( int a , int b ){
        int temp = a;
        a = b;
        b = temp;

    }

    // here creating the new object : String name : name = "Hmm Subash21 ?"; so won't be change
    // also string are final class so won't be modified
    static void ChangeName(String name){
        name = "Hmm Subash21 ?";
    }
}