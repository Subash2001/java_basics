package com.subash.recursion.mazeandbacktracking;

public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
        
    }

    static int queens (boolean[][] board, int row){
        if (row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0; 
        // placing the queen and checking for every row and column 
        for (int column = 0; column < board.length; column++) {
            // place the queen if  it is safe 
            if (isSafe(board, row, column)){
                board[row][column] = true;
                count += queens(board, row + 1);
                board[row][column] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int column) {
        // check vertical row
        for (int i = 0; i < row; i++) {
          if(board[i][column]){
              return false;
          }
        }
        // diagonal left
        int maxLeft = Math.min(row, column);
        for (int i = 0; i <= maxLeft; i++) {
            if (board[row-i][column-i]){
                return false;
            }
        }
        // diagonal right
        int maxRight = Math.min(row, board.length - column -1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[row-i][column+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board){
            for (boolean element : row){
                if (element){
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
