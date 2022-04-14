package com.hspedu.ploy;


public class Detail {
    public static void main(String[] args) {
        Base sub = new Sub();//向上转型
        System.out.println(sub.count);//20，看编译类型
        Sub sub1 = new Sub();
        System.out.println(sub1.count);//10，看编译类型
    }
}

class Base{//父类
    int count = 20;//属性
}

class Sub extends Base{//子类
    int count = 10;//属性
}
