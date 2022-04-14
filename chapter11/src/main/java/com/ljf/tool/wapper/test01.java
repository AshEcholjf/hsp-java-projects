package com.ljf.tool.wapper;

public class test01 {
    public static void main(String[] args) {
        //三元运算符测试
     //   Object obj1 = true ? new Integer(1) : new Double(2.0);
       // System.out.println(obj1);//1.0
        /*
        三目运算符比较基本数据类型，所以在编译阶段自动拆箱为 int 和 double 类型，
        由于三目运算符要求 表达式2 和 表达式3 类型一致，所以在编译阶段自动类型提升（即 int 自动类型转换为 double 类型），
        再自动装箱为Object，输出时使用多态调用重写的toString();即Double包装类的toString();
        * */

//      int b = true ? 1:2.0;
//      System.out.println(b);
        //直接报错
        // 需要的类型:
        //int
        //提供的类型:
        //double

//上面的测试题相当于
//        double b = true ? 1 : 2.0;
//        System.out.println(b);//1.0
//        int maxValue = Integer.MIN_VALUE;
//        System.out.println(maxValue);
        System.out.println(1 == 1.0);//true
        String intern = "a".intern();
    }
}
