package com.subash;

public class Main {
    public static void main(String[] args) {
        /*
            Syntax
            datatype[] variable_name = new datatype[size];

            store 5 number;
            int[] num = new int [5];

            or directly
            int[] num = {23,25,18,54,42};

            c++
            array in c++ continuous memory allocation.
            java
            1) array object are stored in heap
            2) in java heap objects are not continuous.
            3) dynamic memory allocation.
            4) array object in java may not be continuous.  that depends on jvm.


            int[] num ; // declaration of  array. num is getting defined in the stack
            num = new int [5]; // actually here object is being created in memory (heap).
            new is used create an object a heap memory a size of array.
         */

        int [] num;
        num = new int[5];
        System.out.println(num[1]);

        String[] Name = new String[4];
        System.out.println(Name[0]);
        // string array -
        for (String  element : Name){
            System.out.println(element);
        }
        /*
            null is a literal u can't assign to primitive datatype. but u can assign non-primitive datatype like Array , String.
            String in have object in heap memory.
            primitives that only save in stack memory . ex int, char , boolean ....

         */

    }
}