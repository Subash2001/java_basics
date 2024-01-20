package com.subash;

import java.util.Arrays;

public class Scope {
    public static void main(String[] args) {

        int a = 69;
        int b = 69;
        String name = "subash";
        {
        //  int a = 69; // already initialised outside the block in same method, hence you cannot initialise again.  but you can change the value again.
            a = 89; // reassign the origin ref variable to some other value
            System.out.println(a);

            int c = 69;

            name = "Subash21";
            // values initialised in this block , will remain in block

            /*
                Anything initialised outside the block scope cannot initialise again.
                if Anything initialised inside the block scope you can initialise again outside the block.
             */

        }

        int c = 900;
        System.out.println(a);
        System.out.println(name);

        // scoping in loop
        for (int i = 0; i < 2; i++) {
            System.out.println(i);
            a =9900;
        }
        System.out.println(a);
    }

    static void random (int marks){}
    int num = 67;
}
