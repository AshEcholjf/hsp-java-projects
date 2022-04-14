package com.ljf.tool.wapper;

public class StringHomeWork01 {
    String str = new String("ljf");
    final char[] ch= {'j','a','v','a'};
    public void change(String str,char[] ch){
        str = "java";
        ch[0] = 'h';
    }
    public static void main(String[] args) {
        StringHomeWork01 sh = new StringHomeWork01();
        sh.change(sh.str,sh.ch);
        System.out.println(sh.str  + "and");
        System.out.println(sh.ch);
    }
//    ljfand
//    hava


    //分析：
    //1.首先创建对象，
    // 在栈中创建一个sh对象引用，在堆中开辟对应的空间，空间中创建str指向对应value属性，value指向常量池中的”ljf“字符串，
    //然后空间中创建一个char数组的引用ch指向一个空间，里面存放四个字符：'j','a','v','a'。
    //然后调用change方法，在main栈上方中创建一个change栈，参数为String和char[]两个引用类型，由sh的变量赋地址给他们
    //该方法str赋值的地址指向是堆中value空间，但是str由被赋值指向”Java“，所以指向改变，指向了常量池中创建的新字符串，
    // 这不会影响原本堆中str的指向
    //之后修改ch[0]的值，由于ch赋值后ch指向的地址就是堆中字符串数组的地址，所以会修改堆中字符串数组的数据
    //
    // 所以change之后sh.str = "ljf"不变，sh.ch = “hava”
}
