package com.subash;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        //Q : Find Area Of Triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for base : ");
        float base = input.nextFloat();
        System.out.print("Enter the value for height : ");
        float height = input.nextFloat();

        if (base <=0 || height <= 0){ // 0/anything 0
            System.out.print("Entered invalid input ");
        }else {
            float area = (1/2f) * base * height;
            System.out.println("The Area Of triangle is = " + area);
        }




    }
}
