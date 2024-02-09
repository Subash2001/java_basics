package com.subash;

import java.util.Arrays;

public class SearchInString{
    public static void main(String[] args) {
        String str = "subash";
        char target = 'u';
        System.out.println(searchString(str, target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean searchString(String str , char target){
        if (str.length() == 0){ // str.length is a variable.
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)){
                return true;
            }
        }
        return false;
    }

    // for each loop
    static boolean searchString1 (String str , char target){
        if (str.length()==0){
            return false;
        }
        // for each loop
        for (char ch : str.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }

}