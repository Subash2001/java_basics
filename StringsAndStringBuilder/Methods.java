package com.subash;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "hi Subash";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('h'));
        System.out.println("   Subash  ".strip()); // remove space
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
