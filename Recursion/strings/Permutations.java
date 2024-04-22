package com.subash.recursion.strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutations("", "abc");

        ArrayList<String> ans = permutationArrayList("", "abc");
        System.out.println(ans);

        System.out.println(permutationCount("", "abc"));
    }
    
    static void permutations(String process, String unProcess){
        if (unProcess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch = unProcess.charAt(0);

        for (int i = 0; i <= process.length(); i++) {
            String first = process.substring(0,i);
            String second = process.substring(i, process.length());
            permutations(first + ch + second, unProcess.substring(1));
        }
    }

    static ArrayList<String> permutationArrayList(String process, String unProcess){
        if (unProcess.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }

        char ch = unProcess.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= process.length(); i++) {
            String first =  process.substring(0,i);
            String second = process.substring(i, process.length());
            ans.addAll(permutationArrayList(first + ch + second, unProcess.substring(1)));
        }
        return ans;
    }

    static int permutationCount(String process, String unProcess){
        if (unProcess.isEmpty()){
            return 1;
        }

        int count = 0;
        char ch = unProcess.charAt(0);
        for (int i = 0; i <= process.length() ; i++) {
            String first = process.substring(0,i);
            String second = process.substring(i, process.length());

            count = count + permutationCount(first + ch + second , unProcess.substring(1));
        }
        return count;
    }
}
