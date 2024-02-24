package com.subash;

import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int [] [] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,38,48,58},
                {29,39,49,89}
        };

        System.out.println(Arrays.toString(search(arr , 89)));
    }
    static int [] search (int[][] matrix, int target){
        int row = 0;
        int column = matrix.length -1;
        while (row < matrix.length  && column >= 0){
            if (matrix[row] [column] == target){
                return new int[] {row , column};
            }
            // ignoring the rows
            if (matrix[row][column] < target){
                row ++;
                // ignoring column
            } else {
                column --;
            }
        }
        return new int[]{-1,-1};
    }
}
