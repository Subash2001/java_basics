package com.subash;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        // Q : To find Perimeter of Equilateral Triangle .
        // formula : P=3×side.
        Scanner input = new Scanner(System.in);

        double p , side;
        while (true){
            System.out.print("Enter the length of a side of the equilateral triangle : ");
            side = input.nextDouble();
            if (side > 0){
                break;
            }else {
                System.out.println("Invalid input. Please enter a positive value for the side length.");
            }
        }
        p = 3 * side;
        System.out.println("The perimeter of the equilateral triangle is: " + p );
    }
}
/*
    same for this problem.
    Perimeter Of Parallelogram : formula : P = 2 * (length of base + length of adjacent side).
    Perimeter Of Rectangle : formula : P = 2 * (length+width).
    Perimeter Of Square : formula : P = 4 * side.
    Perimeter Of Rhombus : formula : P = 4 * side.
 */
