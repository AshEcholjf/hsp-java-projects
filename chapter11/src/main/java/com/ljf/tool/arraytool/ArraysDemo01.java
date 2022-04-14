package com.ljf.tool.arraytool;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo01 {
    public static void main(String[] args) {
        Integer[] arr ={11,56,-89};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
