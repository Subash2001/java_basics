package com.subash;

import java.util.Scanner;

public class ReturnString {
    public static void main(String[] args) {

        //assigns the result of the greet() method.
        String message = greet();
        System.out.println(message);


        /* with parameters */
        String personalised = myGreet("Subash");
        System.out.println(personalised);

        // using Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name L : ");
        String names = input.next();
        String tag = tagging(names);
        System.out.println(tag);
    }



    static String greet () {
        String greeting = "hello bros";
        return greeting;
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

     static String tagging(String names) {
        String messages = "hey how are you ? " + names;
        return messages;
    }
}
