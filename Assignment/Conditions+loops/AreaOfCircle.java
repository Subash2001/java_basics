package com.subash;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        //Q : Find Area Of Circle .
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input for radius : ");
        double radius = input.nextDouble();

        // constant value for pi;
        double pi = 3.14159;

        // formula for calculating area A = pi * r^2
         if (radius<=0){
             System.out.println("Entered invalid input.");
         }else {
             double area = pi * (radius * radius);
             System.out.println("Area of circle = " + area);
         }
    }
}