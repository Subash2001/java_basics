package com.subash.recursion.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subSetDuplicate(arr);
        for (List<Integer> list : ans){
            System.out.println(list);
        }
    }

    // time : O(N * 2 ^N)
    // space : O(2^N * N)
    static List<List<Integer>> subSet(int[]arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr){
            int n = outer.size(); // size
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subSetDuplicate(int[] arr){
        // inbuilt sorting
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i =0; i < arr.length; i++){
            start = 0;
            // if my current and previous element is same, start = end + 1;

            if (i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
