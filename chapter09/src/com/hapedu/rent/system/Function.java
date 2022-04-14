package com.hapedu.rent.system;

import java.util.Scanner;

public class Function {
    //房租出租系统的对象类

    //属性

    Scanner sc = new Scanner(System.in);

    //方法
    //menu方法：展示菜单
    public void showMenus(){
        System.out.println("----------房租出租系统----------");
        System.out.println("\t\t1 新增房源");
        System.out.println("\t\t2 查找房屋");
        System.out.println("\t\t3 删除房屋");
        System.out.println("\t\t4 修改房屋信息");
        System.out.println("\t\t5 房屋列表");
        System.out.println("\t\t6 退出");
    }

    //useMenu方法：实现菜单的各个功能
    public void useMenus(){
        boolean flag = true;
        char key;
        while (flag){
            showMenus();
            System.out.println("请选择你需要的操作");
            key = sc.next().charAt(0);
            switch (key){
                case '1':
                    System.out.println("1");
                    break;
                case '2':
                    System.out.println("2");
                    break;
                case '3':
                    System.out.println("3");
                    break;
                case '4':
                    System.out.println("4");
                    break;
                case '5':
                    System.out.println("5");
                    break;
                case '6':
                    System.out.println("6");
                    break;
                default:
                    System.out.println("你的选择无对应操作，请重新输入~~~~");
            }
        }
    }

    //addHouse方法：添加房屋
    public void addHouse(){

    }



}
