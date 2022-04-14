package com.ljf.tool.enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season01.AUTUMN);
        System.out.println(Season01.SPRING);
        System.out.println(Season01.SUMMER);
        /*
        * 静态代码块被执行
        Season01{name='秋天', desc='凉爽'}
        Season01{name='春天', desc='温暖'}
        Season01{name='夏天', desc='炎热'}
        * */

        System.out.println(Season01.num);//10
    }
}

//自定义枚举类
class Season01{
    private String name;
    private String desc;//描述

    //1.构造器私有化去，防止直接在main里new新对象
    //2.去掉Set方法，防止属性被修改
    //3.在Season内部，直接创建固定的对象
    //4.优化，使用final和static修饰符
    //由于被final和static修饰的基本数据类型和String类型不需要实现类的加载吗，在编译时期已经赋初值，
    //但是这里是new对象，还是会实现类的加载(一次)，这里可以保证对象不指向其它地址，但是对象的属性可以被修改（没有提供修改方法，在这里无法实现）

    public final static Season01  SPRING = new Season01("春天", "温暖");
    public final static Season01 SUMMER = new Season01("夏天", "炎热");
    public final static Season01 AUTUMN = new Season01("秋天", "凉爽");
    public final static  Season01 WINTER = new Season01("冬天", "寒冷");
   private Season01(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public final static int num = 10;
static {
    System.out.println("静态代码块被执行");
}
    public String getName() {
        return name;
    }

//    //public void setName(String name) {
//        this.name = name;
//    }

    public String getDesc() {
        return desc;
    }

//    public void setDesc(String desc) {
//        this.desc = desc;
//    }


    @Override
    public String toString() {
        return "Season01{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
