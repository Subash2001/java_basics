package com.subash;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        /*
            Syntax
            ArrayList<data type> variableName = new ArrayList<>();
            here data type is a wrapper class Integer

         */
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
        // here adding value
        list.add(23);
        list.add(46);
        list.add(3);
        list.add(6);

        // its checkout it has this item.
        System.out.println(list.contains(48)); // have print true . otherwise false

        System.out.println(list);

        // here it set 0th index element is 55.
        list.set(0,55);

        // here remove this index line
        list.remove(3);

        System.out.print(list);

        // using for loop.
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(); // pass index here, list[index] syntax will not work  here
        }

        System.out.print(list);

    }
}