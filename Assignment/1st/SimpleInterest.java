import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Q : Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount P : ");
        double P = input.nextInt();
        System.out.print("Enter the Time t : ");
        double T = input.nextInt();
        System.out.print("Enter the Rate of Interest amount R : ");
        double R = input.nextInt();

        double SimpleInterest = (P * T * R )/100;

        System.out.print("SimpleInterest : " + SimpleInterest);


    }
}
