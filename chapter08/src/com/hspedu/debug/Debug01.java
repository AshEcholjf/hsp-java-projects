package com.hspedu.debug;

import java.util.Arrays;

public class Debug01 {
    public static void main(String[] args) {
       int []  arr = {12,-45,78,99,21};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
