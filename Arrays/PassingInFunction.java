package com.subash;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int [] num = {44,4,5,6,54};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    /*
        Strings are immutable. u can't change the object.
        Arrays are mutable ; u can change the object
     */

    static void change (int []arr){
     arr[0] = 33;
    }
}
