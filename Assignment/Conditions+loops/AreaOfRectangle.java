package com.subash;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        // Q: To find Area Of Rectangle.

        Scanner input = new Scanner(System.in);
        double length , width;
        while (true){
            System.out.print("Enter the value for length : ");
            length = input.nextDouble();
            System.out.print("Enter rhe value for width : ");
            width = input.nextDouble();
            if (length > 0 || width > 0 ){
                break;
            }else {
                System.out.println("Entered the invalid input ");
            }
        }
        double area = length * width;
        System.out.print("The area of the Rectangle " + area);
    }
}
