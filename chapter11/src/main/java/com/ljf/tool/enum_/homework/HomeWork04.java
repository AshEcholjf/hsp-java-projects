package com.ljf.tool.enum_.homework;

public class HomeWork04 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new Cal() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 10, 20);
        cellPhone.testWork(new Cal() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        }, 10, 20);
    }
    }

    /*匿名内部类，动态绑定
    编译类型Cal，运行类型：匿名内部类
    调用CellPhone类里的 testWork方法时创建一个匿名内部类，同时接收两个参数
     testWork方法调用work方法（动态绑定到匿名内部类），实现计算

    new Cal() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }
    */


interface Cal{
    //没有具体要求，自己设计
    //该方法实现什么样的计算由匿名内部类实现
    double work(double n1,double n2);
}

class CellPhone{
    public void testWork(Cal work,double n1,double n2){
        //这里需要传入两个值，因为我们的接口work方法需要两个参数，如果这里没有double参数，方法体里的work方法没有数据可用
        System.out.println("CellPhone类调用计算机接口的work方法");
        double work1 = work.work(n1, n2);
        System.out.println("运算结果：" + work1);
    }
}
