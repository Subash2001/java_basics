package com.subash;

import java.util.Scanner;

public class VolumeOfCone {
    // Q : to find Volume Of Cone.
    // formula : V= (1/3) π * r^2 *h
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        double radius , height;

        while (true){
            System.out.print("Enter the value for radius : ");
            radius = input.nextDouble();
            System.out.print("Enter the value for height : ");
            height = input.nextDouble();
            if (radius > 0 && height > 0){
                break;
            }else{
                System.out.println("Entered Invalid operation or zero .");
            }
        }
        double Volume = (1.0/3.0) * pi * height ;
        System.out.println("The Volume Of Cone is " + Volume);
    }
}
/*
    DifferenceProductSum is same for this problem.
    Volume Of Prism : formula : V = BaseArea * Height
    Volume Of Cylinder : formula : V = π * r^2 * h.
    Volume Of Sphere : formula : V = 4/3 π r^3.
    Volume Of Pyramid : formula : V = 1/3 * BaseArea * Height.
    Curved Surface Area Of Cylinder : formula : A(cylinder) = 2πrh.
    Total Surface Area Of Cube : formula : A (cube) = 6 * s^2.
 */