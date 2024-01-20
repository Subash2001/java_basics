package com.subash;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  empID = input.nextInt();
        String department = input.next();

        switch (empID){
            case 1:
                System.out.println("Subash");
                break;
            case 2:
                System.out.println("Simba");
                break;
            case 3:
                System.out.println("Emp Number 3" );
                switch (department){
                    case "Mechanical":
                        System.out.println("Mechanical department");
                        break;
                    case "German":
                        System.out.println("German Shepherd");
                        break;
                    default:
                        System.out.println("No department Entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpId ");
        }

        // enhanced switch statement

        switch (empID) {
            case 1 -> System.out.println("Subash");
            case 2 -> System.out.println("Simba");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "Mechanical" -> System.out.println("Mechanical department");
                    case "German" -> System.out.println("German Shepherd");
                    default -> System.out.println("No department Entered");
                }
            }
            default -> System.out.println("Enter correct EmpId ");
        }

    }

}
