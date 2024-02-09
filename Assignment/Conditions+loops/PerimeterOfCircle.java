package com.subash;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        /*
         Q: to find Perimeter Of Circle.
         P is the perimeter (circumference) of the circle,
         π is a mathematical constant approximately equal to 3.14159,
         r is the radius of the circle.
        */
        Scanner input = new Scanner(System.in);
        double pi = 3.1;
        double p, r;
        while (true) {
            System.out.print("Enter the value for radius : ");
            r = input.nextDouble();
            if (r > 0) {
                break;
            }else {
                System.out.println("Entered invalid operation.");
            }
        }
        p = 2 * pi * r;
        System.out.println("The value of PerimeterOfCircle : " + p);
    }
}
