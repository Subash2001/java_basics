package com.subash;

import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit){
            case "mango":
                System.out.println("The king of all the fruits");
                break;
            case "Apple":
                System.out.println("A red fruit");
            case "Pomegranate":
                System.out.println("I like Mathulai");
                break;
            default:
                System.out.println("Enter a Valid Fruit");
        }

    }
}
