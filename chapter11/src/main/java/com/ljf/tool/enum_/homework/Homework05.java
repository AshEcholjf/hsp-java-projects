package com.ljf.tool.enum_.homework;

public class Homework05 {
    public static void main(String[] args) {
new A().f1();
    }
}

class A {
private final String NAME = "HELLO";
    public void f1() {
        class B {
            //局部内部类
            private final String NAME = "jack";

            public void show() {
                System.out.println("NAME:" + NAME + "\tA.name:" +A.this.NAME );
            }

        }
        B b = new B();
        b.show();

    }


}
