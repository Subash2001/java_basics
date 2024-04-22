package com.subash.recursion.strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceReturn("", 4));
    }

    static void dice(String process, int target){
        if (target == 0){
            System.out.println(process);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(process + i, target-i);
        }
    }

    static ArrayList<String> diceReturn(String process , int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceReturn(process + i, target-i));
        }
        return list;
    }
}