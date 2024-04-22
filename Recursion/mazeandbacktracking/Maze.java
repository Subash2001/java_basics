package com.subash.recursion.mazeandbacktracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        path("", 3, 3 );
        System.out.println( pathReturn("", 3,3));
        System.out.println(pathDiagonal("", 3,3));

        boolean [][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestriction("", board, 0, 0);
    }

    static int count(int row, int column) {
        // YOU CAN ONLY GO RIGHT SIDE ONLY
        if (row == 1 || column == 1) {
            return 1;
        }
        int left = count(row - 1, column);
        int right = count(row, column - 1);
        return left + right;
    }

    static void path(String process, int row, int column){
        if (row == 1 && column ==1){
            System.out.println(process);
            return;
        }
        if (row > 1){
            path(process + 'D', row - 1, column);
        }
        if (column > 1){
            path(process + 'R', row, column - 1);
        }
    }

    static ArrayList<String> pathReturn(String process, int row, int column){
        if (row == 1 && column == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1){
           list.addAll(pathReturn(process + 'D', row -1,  column));
        }
        if (column > 1){
            list.addAll(pathReturn(process + 'R', row, column - 1));
        }
        return list;
    }

    static ArrayList<String> pathDiagonal(String process, int row, int column){
        if (row == 1 && column ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1 && column > 1){
            list.addAll(pathDiagonal(process + 'D', row - 1, column - 1));
        }
        if (row > 1){
            list.addAll(pathDiagonal(process + 'V', row - 1, column));
        }
        if (column > 1){
            list.addAll(pathDiagonal(process + 'H', row, column - 1));
        }
        return list;
    }

    static void pathRestriction(String process, boolean[][] maze, int row, int column){
        if (row == maze.length - 1 && column == maze[0].length - 1){
            System.out.println(process);
            return;
        }
        if (!maze[row][column]){
            return;
        }
        if (row < maze.length - 1){
            pathRestriction(process + 'D', maze, row + 1, column);
        }
        if (column < maze[0].length - 1){
            pathRestriction(process + 'R', maze, row, column + 1);
        }
    }
}