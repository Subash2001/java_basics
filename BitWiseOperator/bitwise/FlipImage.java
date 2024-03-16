package com.subash.bitwise;

import java.util.Arrays;

public class FlipImage {
    // Q: https://leetcode.com/problems/flipping-an-image/
    public static void main(String[] args) {
        int [][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}};
        int [][] ans = flipAndInvertImage(arr);
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image){
            // reverse this array
            for (int column = 0; column < (image[0].length +1)/2; column++) {
                // swap
                int temp  = row[column] ^ 1;
                row [column] = row [image[0].length - column - 1] ^1;
                row [image[0].length - column - 1] = temp;
            }
        }
        return image;
    }
}
