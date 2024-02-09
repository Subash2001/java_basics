package com.subash;

import java.util.Scanner;

public class CGPACalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the total number of courses: ");
            int totalCourses = scanner.nextInt();

            double totalGradePoints = 0.0;
            int totalCreditHours = 0;

            for (int i = 1; i <= totalCourses; i++) {
                System.out.println("Course " + i + ":");
                System.out.print("Enter the grade (O , A+ , A, B+, B, RA): ");
                String grade = scanner.next();

                System.out.print("Enter the credit hours for the course: ");
                int creditHours = scanner.nextInt();

                double gradePoints = calculateGradePoints(grade);
                totalGradePoints += gradePoints * creditHours;
                totalCreditHours += creditHours;
            }

            double cgpa = totalGradePoints / totalCreditHours;
            System.out.println("Your CGPA is: " + cgpa);
        }

        public static double calculateGradePoints(String grade) {
            return switch (grade.toUpperCase()) {
                case "O" -> 9.0;
                case "A+" -> 8.0;
                case "A" -> 7.0;
                case "B+" -> 6.0;
                case "B" -> 5.0;
                default -> 40; // Assuming invalid grades are treated as F (0.0)
            };
        }
    }

