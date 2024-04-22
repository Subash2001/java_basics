package com.subash.recursion.strings;

import java.util.ArrayList;

public class SubSeq {
    // SubSeq --> for Strings : SubSet --> for Arrays
    public static void main(String[] args) {
        subSeq(" " , "abc");
        System.out.println(subSeqArrayList("", "abc"));
        subSeqAscii("", "abc");
        System.out.println(subSeqArrayListAscii("" , "abc"));

    }

    static void subSeq(String process, String unProcess){
        if (unProcess.isEmpty()){
            System.out.println(process);
            return;
        }

        char ch = unProcess.charAt(0);
        subSeq(process + ch, unProcess.substring(1)); // CREATING A NEW OBJECT NOT MODIFYING
        subSeq(process, unProcess.substring(1));
    }
                
    static ArrayList<String> subSeqArrayList(String process, String unProcess){
        if (unProcess.isEmpty()){
            ArrayList<String> list = new ArrayList<>(); // whenever creating a something inside the body that answer will be for that particular only
            list.add(process);
            return list;
        }

        char ch = unProcess.charAt(0);
        ArrayList<String> left = subSeqArrayList(process + ch, unProcess.substring(1));
        ArrayList<String> right = subSeqArrayList(process, unProcess.substring(1));

        left.addAll(right);
        return left; // any both are same
    }

    static void subSeqAscii(String process, String unProcess){
        if (unProcess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch = unProcess.charAt(0);
        subSeqAscii(process+ch , unProcess.substring(1));
        subSeqAscii(process, unProcess.substring(1));
        subSeqAscii(process+(ch+0), unProcess.substring(1) );
    }

    static ArrayList<String> subSeqArrayListAscii(String process, String unProcess){
        if (unProcess.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(process);
            return list;
        }
        char ch = unProcess.charAt(0);

        ArrayList<String> first = subSeqArrayListAscii(process + ch, unProcess.substring(1));
        ArrayList<String> second = subSeqArrayListAscii(process, unProcess.substring(1));
        ArrayList<String> third = subSeqArrayListAscii(process + (ch+0), unProcess.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
