package com.subash.recursion.strings;

public class Stream {
    public static void main(String[] args) {
        skip("", "baccdah");
        System.out.println(skip("baccdah"));
        System.out.println(skipApple("asdapplei"));
        System.out.println(skipAppNotApple("keepappappleok"));
    }

    static void skip(String process, String unProcess) {
        if (unProcess.isEmpty()) {
            System.out.println(process);
            return;
        }

        char ch = unProcess.charAt(0);

        if (ch == 'a') {
            skip(process, unProcess.substring(1));
        } else {
            skip(process + ch, unProcess.substring(1));
        }
    }

    static String skip(String unProcess) {
        if (unProcess.isEmpty()) {
            return "";
        }
        char ch = unProcess.charAt(0);
        if (ch == 'a') {
            return skip(unProcess.substring(1));
        } else {
            return ch + skip(unProcess.substring(1));
        }
    }

    // remove string
    static String skipApple(String unProcess){
        if (unProcess.isEmpty()){
            return "";
        }
        char ch = unProcess.charAt(0);
        if (unProcess.startsWith("apple")){
            return skipApple(unProcess.substring(5));
        } else {
            return unProcess.charAt(0) + skipApple(unProcess.substring(1));
        }
    }

    static String skipAppNotApple(String unProcess){
        if (unProcess.isEmpty()){
            return "";
        }
        char ch = unProcess.charAt(0);
        if (unProcess.startsWith("app") && !unProcess.startsWith("apple")){
            return skipAppNotApple(unProcess.substring(3));
        } else {
            return unProcess.charAt(0) + skipAppNotApple(unProcess.substring(1));
        }
    }
}