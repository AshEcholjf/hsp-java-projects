package com.ljf.tool.arraytool;

import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        //对大数据处理
        BigInteger bigInteger = new BigInteger("999888777666555444333222111");
        //不可以传入int和long类型，存在long；类型的构造器，但是，是private修饰无法调用
        //可以传入字符串(需要是数字，否则抛出异常.NumberFormatException)和数组等
        System.out.println(bigInteger);
        BigInteger bigInteger1 = new BigInteger("111222333444555666777888999");
        //在对BigInteger进行加减乘除的时候，需要使用对应的方法，而不是+-*/
        //加
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);
        System.out.println("-------------");
        //减
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);
        System.out.println("----------------");
        //乘
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);
        System.out.println("---------");
        //除
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);
    }
}
