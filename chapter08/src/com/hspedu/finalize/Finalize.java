package com.hspedu.finalize;

public class Finalize {
    public static void main(String[] args) {
        Car bnw = new Car("宝马");
        bnw = null;
        //这时Car对象就是一个垃圾，垃圾回收器就会回收（销毁）对象，在销毁对象前，会调用该对象的finalize方法
        //程序员就可以在finalize中，写自己的业务逻辑代码（比如释放资源：数据库连接或者打开文件...）
        //如果程序员不重写，那么会调用Object类的finalize，默认处理，如果重写，就可以实现自己的业务逻辑

        System.gc();//主动调用finalize

        System.out.println("123456");
        /*  结果：123456
            销毁Car对象*/
    }
}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {//JDK版本淘汰
        System.out.println("销毁Car对象");
    }
}
