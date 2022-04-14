package com.ljf.tool.wapper;

public class StringMethodDemo01 {
    public static void main(String[] args) {
        System.out.println("String的compareTo方法演示");
        int abd = "abc".compareTo("abd");
        System.out.println(abd);
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer append = stringBuffer.append("");
    }
}
