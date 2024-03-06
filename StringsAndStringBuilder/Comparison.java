package com.subash;

import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {
        String a = "Subash";
        String b = "Subash";
        // ==
        //System.out.println(a==b);
        // its also heap
        String c = new String ("subash");
        String d = new String("subash");
        //System.out.println(c == d);
        System.out.println(c.equals(d));
        // index value
        System.out.println(c.charAt(0));

        System.out.println(new int[] {2,3,4,5});
        System.out.println(Arrays.toString(new int[]{3,5,6,7}));


        String n = null;
        System.out.println(n);

    }
}
