package com.subash.maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors1(20);
        factors2(20);
        factors3(20);
    }
    // O(n)
    static void factors1(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                System.out.print(STR."\{i} "); // i + " "
            }
        }
    }
    // O(sqrt(n))
    static void factors2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if (n/i == i){
                    System.out.println(STR."\{i} ");
                } else {
                    System.out.print(STR."\{i} \{n / i} ") ;
                }
            }
        }
    }
    // both time & space O(sqrt(n)
    static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if (n/i == i){
                    System.out.println(STR."\{i} ");
                } else {
                    System.out.print(STR."\{i} ") ;
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() -1; i >=0 ; i--) {
            System.out.print(STR."\{list.get(i)} ");
        }
    }
}
