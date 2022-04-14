package com.hspedu.dynamic;



public class test {
    public static void main(String[] args) {
        A a = new B();
      //  System.out.println(a.sum());//40
        /*方法按运行类型查找，在B类中找到sum()方法，返回 i + 20，i 在类中是20，返回40 （如果直接查找i这个属性，则为10）       * */
       // System.out.println(a.sum1());//30//同上

        //注释掉B类中的sum和sum1()方法后
        System.out.println(a.sum());
        //先在B类中查找，无sum方法，再到A类中，得到getI()+10,按照Java动态绑定机制，方法调用是绑定运行类型地址的，则调用B类中的getI()方法
        //getI()返回20，所以结果：20+10 = 30
       // System.out.println(a.sum1());
        //在B类中查找，没有sum1()方法，在A类中从存在，返回i + 10，属性没有动态绑定特性，i = 10，所以结果：10  10 = 20

    }
}

class A{
    public int i =10;

    public int sum(){
        return getI() + 10;
    }
    public int sum1(){
        return i + 10;
    }
    public int getI(){
        return i;
    }
}

class B extends A{
    public int i = 20;

    /*public int sum(){
        return i + 20;
    }*/
    public int getI(){
        return i;
    }
   /* public int sum1(){
        return i + 10;
    }*/
}
