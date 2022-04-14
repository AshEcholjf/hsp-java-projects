package com.ljf.tool.enum_;

//添加知识点：如果想在每次生成文件的时候增减一些信息（比如版权），可以在设置的编辑里的文件和代码模板的包含中添加并应用

//枚举类引入
public class Enumeration01 {
    public static void main(String[] args) {
        Season season = new Season("春天", "温暖");
        Season summer = new Season("夏天", "炎热");
        Season autumn = new Season("秋天", "凉爽");
        Season winter = new Season("冬天", "寒冷");
        //季节只有四个但是我们这样创建类的话可以生成其它不符合要求的类
        Season season1 = new Season("other", "what");

        //因此这样的设计不好==> 枚举类[枚：一个一个   举：列举    即把 具体的对象一个一个列举出来的类]
        //就成为枚举类


    }
}

class Season {
    private String name;
    private String desc;//描述

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
