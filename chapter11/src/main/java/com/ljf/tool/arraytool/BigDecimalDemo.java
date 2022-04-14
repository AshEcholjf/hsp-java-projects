package com.ljf.tool.arraytool;

import java.math.BigDecimal;

public class BigDecimalDemo {
    @Deprecated
    public static void main(String[] args) {
        double small = 10.123465789789456123321;
       // System.out.println(small);//10.123465789789456十五位小数

        BigDecimal decimal = new BigDecimal("5.123456789123465789789456123321");
        System.out.println(decimal);
        System.out.println("---------");

        //高精度的加减乘除
        BigDecimal decimal1 = new BigDecimal("1.1");

        System.out.println("加法");
        System.out.println(decimal.add(decimal1));
        System.out.println("减法");
        System.out.println(decimal.subtract(decimal1));
        System.out.println("乘");
        System.out.println(decimal.multiply(decimal1));
        System.out.println("除");
//        System.out.println(decimal.divide(decimal1));
        //除法可能会出现异常情况：ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
        //即结果是无限小数，不会中值
        //这是需要稍加处理
        System.out.println(decimal.divide(decimal1,BigDecimal.ROUND_CEILING));
        //将小数的范围精确到和分子一样
        System.out.println("分子");
        System.out.println(decimal);
    }
}
