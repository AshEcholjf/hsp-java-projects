package com.hapedu.houserent;


import com.hapedu.houserent.view.HouseView;


public class HouseRentApp {
    public static void main(String[] args) {
        //程序入口，会调用houseView类对象
        new HouseView().mainMenu();
        System.out.println("你退出了房屋出租系统~~~");
    }
}
