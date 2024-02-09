package com.subash;

import java.util.Scanner;

public class AreaOfRhombus {
    // Q : to find Area Of Rhombus
    // formula : 1/2 d1 * d2
    // d1 and d2 are the lengths of the diagonals of the rhombus.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double d1 , d2 ;
        while (true){
            System.out.print("Enter the value for length of the diagonal d1 : ");
            d1 = input.nextDouble();
            System.out.print("Enter the value for length of the diagonal d2 : " );
            d2 = input.nextDouble();
            if (d1 > 0 && d2 > 0){
                break;
            }else {
                System.out.println("Entered invalid input or zero.");
            }
        }
        // .value is prefer inside of float
        double area = (1.0/2.0) * d1 * d2;
        System.out.println("The Area Of Rhombus is = " + area);
    }
}
