package com.subash;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        // Q: to find Area Of Isosceles Triangle
        // formula A=1/4 (sqr of b2−a2) * h

        Scanner input = new Scanner(System.in);
        /*
            b is the length of one of the equal sides (base),
            A is the length of the unequal side,
            h is the height of the triangle, which is the perpendicular distance from the base to the apex.
         */


double b, a, h;
        while (true) {
            System.out.print("Enter the value for base : ");
            b = input.nextDouble();
            System.out.print("Enter the value for length : ");
            a = input.nextDouble();
            System.out.print("Enter the value for height : ");
            h = input.nextDouble();
            if (b >0 && a > 0 && h > 0) {
                break;
            }else{
                System.out.println("Entered invalid or zero");
            }
        }double area = 0.25 * Math.sqrt(4 * b * b - a * a) * h;
        System.out.println("The Area Of Isosceles Triangle is : " + area );
    }
}
