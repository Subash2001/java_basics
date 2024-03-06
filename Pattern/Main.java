package com.subash;

public class Main {
    public static void main(String[] args) {
        Pattern1(4);
        Pattern2(4);
        Pattern3(4);
        Pattern4(4);
        Pattern5(4);
        Pattern5Method2(4);
        Pattern28(4);
        pattern30(4);
        Pattern17(4);
        Pattern31(4);
        PatternZoho1(4);
        PatternZoho2(4);
       PatternZoho3(4);
    }

    static void Pattern1(int n) {
        for (int row = 1; row < n; row++) {
            for (int column = 1; column < n; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // For every row, the column
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n - row + 1; column++) { // 1 <= 4-1+1 =4
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    static void Pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row1 = 1; row1 <= n - 1; row1++) {
            for (int column1 = 1; column1 <= n - row1; column1++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // this one
    static void Pattern5Method2(int n) {
        for (int row = 1; row <= n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int column = 1; column < totalColsInRow; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            for (int s = 0; s < n - totalColInRow; s++) {
                System.out.print("  ");
            }
            for (int column = totalColInRow; column >= 1; column--) {
                System.out.print(column + " ");
            }
            for (int column = 2; column <= totalColInRow; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    static void Pattern28(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int column = 1; column < totalColsInRow; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print("  ");
            }
            for (int column = row; column >= 1; column--) {
                System.out.print(column + " ");
            }
            for (int column = 2; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    static void Pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int column = 0; column <= n; column++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, column), Math.min(n - row, n - column));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    // zoho pattern question
    static void PatternZoho1(int n) {
        int num = 1;
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n - row;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            // logic
            int reversNum = num + row - 1;
            for (int column = 1; column <= row; column++) {
                System.out.print(reversNum + " ");
                 reversNum--;
                num++;
            }
            System.out.println();
        }
        for (int row1 = 1; row1 <= n; row1++) {
            for (int s = 1; s < row1 ; s++) {
                System.out.print(" ");
                }
                for (int column = 0; column <= n - row1; column++) {
                    System.out.print(num -1 + " ");
                    num--;
                }
                System.out.println();
            }
        }
    static void PatternZoho2 (int n){
        int num = 6;
        for (int row1 = 1; row1 <= n; row1++) {
            for (int s = 1; s < row1; s++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= n - row1 ; column++) { // 1 <= 4-1+1 =4 n - row1 + 1
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }

    static void PatternZoho3 (int n){
        for (int row = 0; row < n; row++) {
            for (int s = 0; s < n - row-1; s++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int column = 0; column <= row; column++) {
                System.out.print(num + " ");
                num = num * (row - column) / (column + 1);
            }
            System.out.println();
        }
    }
}