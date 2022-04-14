package com.hspedu.abstract01;

public class test {
    public static void main(String[] args) {
        //测试AA和BB类job方法执行时间
        AA aa = new AA();
        aa.cal();

        BB bb = new BB();
        bb.cal();

        //对代码执行顺序分析
        //父类加载，子类加载，父类对象初始化，子类初始化
        //aa在调用cal方法时会找到父类AB的方法，然后执行到job方法，由于存在动态绑定机制，所以job对应的调用地址是aa对象的地址
        //调用的job方法也就是被AA类实现的job方法

    }
}
