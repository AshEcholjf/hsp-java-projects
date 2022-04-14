package com.hapedu.houserent.servies;

import com.hapedu.houserent.domain.House;

/**
 * HouseService.java<=>业务层
 * //定义House[],保存house对象
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作（crud）
 */
public class HouseService {
    private House[] houses;//保存House对象
    private int houseNums = 1;//记录当前房屋的个数，判断是否可以继续添加
    private  int idCounter = 1;

    public HouseService(int size) {//创建对象时创建数组
        houses = new House[size];
        houses[0] = new House(1,"刘建丰","12345678910","上海",2,"未出租");
    }

    //返回对象信息给界面输出
    public House[] list(){
        return houses;
    }

    //添加房屋信息，返回是否添加成功
    public boolean add(House house){
        //判断是否可以继续添加,如果已满则扩+10
        if (houseNums == houses.length){
            //实现数组扩容
            int addLength = 10 + houses.length;
            House[] houses1 = new House[addLength];
            //新数组赋值
            for (int i = 0; i < houses.length; i++) {
                houses1[i] = houses[i];
            }
            //赋值结束将旧数组指向新数组
            houses = houses1;
        }
        //将house对象添加到数组中,并计数
        houses[houseNums++] = house;
        //房屋的编号由程序员设计，我们需要设计一个id自增长机制,所以我们每次给对象的id赋值
//        idCounter++；
        house.setId(++idCounter);
        return true;
    }

    //del方法，删除房屋信息
    public boolean del(int sid){
        //找到要删除的房屋信息的编号（编号比下标多一）
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (sid == houses[i].getId()){//不是直接对下标或者sid加减1，因为过程中可能添加删除改变，所以使用记录
                index = i;
            }
        }
        if (index == -1){
            return false;//说明没找到
        }

        //接下来说明找到了，进行删除操作
        //将需要删除的对象所在的位置由它后面的对象替代，并将多出来的最后一个位置置空
        for (int i = index; i<houseNums - 1;i++){
            houses[i] = houses[i+1];
        }
        /*houses[houseNums-1] = null;
        houseNums--;*/
        //简化
        houses[--houseNums] = null;
        return true;
    }


    //find方法，返回house或者null
    public House find(int id){
        for (int i = 0;i < houseNums;i++){
            if (id == houses[i].getId()){
            return houses[i];
            }
        }

        return null;
    }

}
