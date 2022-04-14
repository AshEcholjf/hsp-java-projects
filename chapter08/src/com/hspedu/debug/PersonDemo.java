package com.hspedu.debug;

public class PersonDemo {
    public static void main(String[] args) {
        Person jak = new Person("jak", 20);
/*1.加载类信息
* 2.初始化：1：默认初始化 2：显式初始化 3：构造器初始化
* 3.返回对象的地址*/
        //执行println，在里面执行tostring
        System.out.println(jak);
    }
    //执行exit
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
