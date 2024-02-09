package com.subash;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        // Q : To find Area Of Parallelogram
        Scanner input = new Scanner(System.in);

        // formula A=base×height
        double base , height;
        while (true){
            System.out.print("Enter the value for base : ");
            base = input.nextDouble();
            System.out.print("Enter the value for height : ");
            height = input.nextDouble();
            if (base > 0 && height >0){
                break;
            }else {
                System.out.println("Entered invalid input.");
            }
        }
        double area = base * height;
        System.out.println("The area of Parallelogram is = " + area);
    }
}
