package com.ljf.tool.enum_;

public class Enumeration03 {
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

    }
}

//enum枚举类
enum Season02 {
//    public final static Season01  SPRING = new Season01("春天", "温暖");
//    public final static Season01 SUMMER = new Season01("夏天", "炎热");
//    public final static Season01 AUTUMN = new Season01("秋天", "凉爽");
//    public final static  Season01 WINTER = new Season01("冬天", "寒冷");

    //如果使用enum类实现枚举类
    //1。使用关键字enum来代替class
    //2.public final static Season01  SPRING = new Season01("春天", "温暖");直接使用
    //SPRING(“春天”，“温暖”)解读：常量名（参数列表）
    //3.如果有多个常量，中间需要用逗号隔开，不能使用分号
    //如果使用enum来实现枚举，要求定义常量对象写在最前面
    SPRING("春天","温暖"),SUMMER("夏天","炎热");
    private String name;
    private String desc;
    private Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    static {
        System.out.println("静态代码块被执行");
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }


    @Override
    public String toString() {
        return "Season01{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
