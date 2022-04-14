package com.hspedu.static_;

public class Static {
    public static void main(String[] args) {
        A a = new A();
        a.addFee(100);
        A a1 = new A();
        a1.addFee(100);

        a.showFee();
    }
}

class A{
    public static double fee = 0;
    private int a = 100;

    public  static void addFee(double money){
        fee += money;
    }

    public void showFee(){
        System.out.println(fee);
    }
}
