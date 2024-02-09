package com.subash;

import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {

        // To find Ncr and Npr

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n value : ");
        int n = input.nextInt();
        
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the r value : ");
        int r = input1.nextInt();

        int factN = 1;
        int factR = 1;
        int factNm = 1;

        // n!
        for (int i = 0; i <=n; i++) {
            factN *= i;
        }
        // r!
        for (int i = 0; i <= r; i++) {
            factR *=i;
        }
        // n-r!
        for (int i = 0; i <= (n - r); i++) {
            factNm *=i;
        }
        // Calculate and print nCr and nPr
        int ncr = factN / (factR * factNm);
        System.out.println("nCr: " + ncr);

        int npr = factN / factNm;
        System.out.println("nPr: " + npr);
    }
}
