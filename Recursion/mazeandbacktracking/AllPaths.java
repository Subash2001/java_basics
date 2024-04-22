package com.subash.recursion.mazeandbacktracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allDirection("", board, 0,0);

        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0 ,path, 1);

    }

    static void allDirection(String process, boolean[][] maze, int row , int column){
        if (row == maze.length -1 && column == maze[0].length -1){
            System.out.println(process);
            return;
        }
        if (!maze[row][column]){
            return;
        }

        // iam considering this block in my path
        maze[row][column] = false;

        if (row < maze.length-1){
            allDirection(process + 'D', maze, row+1, column);
        }
        if (column < maze[0].length-1){
            allDirection(process + 'R', maze, row, column+1);
        }
        if (row > 0){
            allDirection(process + 'U', maze, row-1, column);
        }
        if (column > 0){
            allDirection(process + 'L', maze, row, column-1);
        }

        // this line where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[row][column] = true;

    }

    static void allPathPrint(String process,boolean[][] maze, int row, int column, int[][] path, int step) {
        if (row == maze.length - 1 && column == maze[0].length -1) {
            for (int[] arr : path){
                path[row][column] = step;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(process);
            System.out.println();
            return;
        }
        if (!maze[row][column]){
            return;
        }
        maze[row][column] = false;
        path[row][column] = step;

        if (row < maze.length - 1) {
            allPathPrint(process + 'D', maze, row + 1, column,  path, step + 1);
        }
        if (column < maze[0].length - 1) {
            allPathPrint(process + 'R', maze, row, column + 1, path, step + 1);
        }
        if (row > 0) {
            allPathPrint(process + 'U', maze, row - 1, column, path, step + 1);
        }
        if (column > 0) {
            allPathPrint(process + 'L', maze, row, column - 1, path, step + 1);
        }
        maze[row][column] = true;
        path[row][column] = 0;
    }
}
