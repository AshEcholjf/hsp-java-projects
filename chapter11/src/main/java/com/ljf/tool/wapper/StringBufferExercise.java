package com.ljf.tool.wapper;

import java.util.Scanner;

public class StringBufferExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入商品名称");
        StringBuffer stringBuffer = new StringBuffer(sc.nextLine());
        System.out.println("输入商品价格");
        StringBuffer stringBuffer1 = new StringBuffer(sc.nextLine());
        //进行价格进行格式处理

        //自己写的
//        int i = stringBuffer1.indexOf(".");
        //防止前面出现小数点，这里改用lastIndexOf
//        int i = stringBuffer1.lastIndexOf(".");
//        int num = stringBuffer1.length();
//        while (i >= 0) {
//            i -= 3;
//            if (i > 0) {
//                stringBuffer1.insert(i, ",");
//            }
//        }

        //根据老韩改的
//        for (int i = stringBuffer1.lastIndexOf(".");i>0;i-=3){
//            stringBuffer1.insert(i-3,",");
//        }
        //会出现第0个索引处加,
        //改善
        for (int i = stringBuffer1.lastIndexOf(".") - 3; i > 0 ; i -= 3) {
            stringBuffer1.insert(i,",");
        }
        String res = stringBuffer.append("\t\t").append(stringBuffer1).toString();
        System.out.println(res);
    }
}
