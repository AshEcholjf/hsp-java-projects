package com.ljf.tool.arraytool;


import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,45,2,-55,-15};
//        bubbleSort01(arr);
        System.out.println("传统冒泡排序：" + Arrays.toString(arr));

        System.out.println("-------------");

        bubbleSort01(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;
            return i2 - i1;
            }
        });

        System.out.println("定制排序后：" + Arrays.toString(arr));
    }

    //传统的冒泡排序，递增
    public static void bubbleSort01(int  [] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }

        }
    }

    //使用冒泡来定制排序
    public static void bubbleSort01(int [] arr, Comparator c){
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (c.compare(arr[j] , arr[j+1]) > 0){
                    //数组的排序由c.compare(arr[j] , arr[j+1])于0比较决定
                    //如果返回结果>0,进入交换，如果<0，继续查找下一个数据与0判断
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
