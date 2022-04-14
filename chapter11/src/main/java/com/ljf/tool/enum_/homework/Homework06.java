package com.ljf.tool.enum_.homework;

public class Homework06 {
    public static void main(String[] args) {
        Person ts = new Person("唐僧", new Horse());
        ts.common();
        ts.passRiver();
    }
}

interface Vehicles {
    void work();
}

class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("骑马走路");
    }
}

class Boat implements Vehicles {

    @Override
    public void work() {
        System.out.println("坐船过河");
    }
}

class Transport {
//   public Horse getHouse(){
//       return new Horse();
//   }
//
//   public Boat getBoat(){
//       return  new Boat();
//   }

    //优化，由于这是工厂类，不需要直接创建对象，只需要使用提供的方法即可,使用static修饰
//    public static Horse getHorse() {
//        return new Horse();
//    }


    //根据实际优化，由于每次使用的马不变，船可以变
    private  static Horse horse = new Horse();//这里为了防止建造新的horse对象，使用饿汉式,将构造器私有化
    public static Horse getHorse(){
        return horse;
    }

    private Transport() {
    }

    public static Boat getBoat() {
        return new Boat();
    }
}

class Person {
    private String name;
    private Vehicles vehicle;

    //在创建对象时，事先给他分配一个交通工具
    public Person(String name, Vehicles vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }


    //这里需要利用构造方法中的交通工具，否则每次都需要获取一个新对象进行操作
    //唐僧需要过河和骑马的操作，我们应该将它封装成两个方法
    public void passRiver() {
        if (!(vehicle instanceof Boat)) {
            //如果交通工具不是船，就获取一个船并赋给vehicle
            vehicle = Transport.getBoat();//这里将Boat对象给Vehicle，使用的向上转型
        }
        vehicle.work();
    }

    public void common() {
//        Transport.getHorse().work();
        if (!(vehicle instanceof Horse)) {
            vehicle = Transport.getHorse();
        }
        vehicle.work();
    }
}