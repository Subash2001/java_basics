package com.subash;

public class ColNoFixed {
    public static void main(String[] args) {
        int [] [] arr = {
                {1 ,2 ,4 ,7 },
                {3,5},
                {3,5,2}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
