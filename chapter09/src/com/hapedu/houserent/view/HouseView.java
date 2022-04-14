package com.hapedu.houserent.view;

import com.hapedu.houserent.domain.House;
import com.hapedu.houserent.servies.HouseService;
import com.hapedu.houserent.utility.Utility;

/**
 * 1.显示界面
 * 2.接收用户的输入
 * 3.调用HouseService类完成功能实现
 */
public class HouseView {

    private boolean loop = true;//显示控制菜单
    private char key = ' ';//接收用户输入
    //为了获取房屋信息，需要获取房屋对象所在类的对象
    private HouseService houseService = new HouseService(5);

    //修改房屋信息
    public void update(){
        System.out.println("``````修改房屋信息```````");
        System.out.print("请输入需要修改的房屋信息的编号：");
        int id = Utility.readInt();
        House hu = houseService.find(id);
        if (hu == null){
            System.out.println("你需要修改的信息不存在");
            return;
        }
        //接下来修改房屋信息，修改时需要展示原先的信息
        System.out.print("姓名(" + hu.getName() +")：");
        String name= Utility.readString(8, "");//如果输入回车，默认是输入""空字符
        //如果name是空字符""，则不做修改，如果不是修改hu.name的值
        if (!"".equals(name)){
            hu.setName(name);
        }

        System.out.print("电话(" + hu.getPhone() +")：");
        String phone= Utility.readString(12, "");
        if (!"".equals(phone)){
            hu.setPhone(phone);
        }

        System.out.print("地址(" + hu.getAddress() +")：");
        String address= Utility.readString(8, "");
        if (!"".equals(address)){
            hu.setAddress(address);
        }

        System.out.print("租金(" + hu.getRent() +")：");
       int rent =Utility.readInt(-1);
        if (rent != -1 ){
            hu.setRent(rent);
        }

        System.out.print("状态(" + hu.getState() +")：");
        String sate= Utility.readString(8, "");
        if (!"".equals(sate)){
            hu.setState(sate);
        }

    }

    //根据id查找房屋信息
    public void findHouse(){
        System.out.println("^^^^^^^查找房屋信息^^^^^^");
        System.out.print("请输入你要查找的id:");
        int fid = Utility.readInt();
        //调用方法，传入fid，根据返回的对象输出对应信息
        House hu = houseService.find(fid);
        if (hu != null){
            System.out.println(hu);
        }else {
            System.out.println("你查找的信息不存在");
        }
    }


    //编写房屋显示列表
    public void listHouse(){

        System.out.println("-----------------------------房租列表------------------------------");
        System.out.println("编号\t\t房主\t\t电话\t\t\t\t地址\t\t月租\t\t状态(未出租，已出租)");
        House[] list = houseService.list();
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null){
                break;
            }
            System.out.println(list[i]);
        }
        System.out.println();
    }



    //编写addHouse接收输入，创建House对象，调用add方法
    public void addHouse(){
        System.out.println("\t\t\t\t添加房屋");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        //创建一个新的House对象，注意id是系统分配的
        House house = new House(0, name, phone, address, rent, state);
        //将该对象添加到对象数组中，根据返回值判断是否添加成功
        if (houseService.add(house)){
            System.out.println("*********添加成功************");
        }else {
            System.out.println("添加失败........");
        }
    }



    //编写deleteHouse接收用户输入的id调用service的del方法
    public void deleteHouse(){
        System.out.println("!!!!!!!删除房屋信息!!!!!!!");
        System.out.print("请输入你要删除的房屋编号(输入-1退出):");
        int sid = Utility.readInt();
        if (sid == -1){
            System.out.println("已退出删除信息操作");
            return;
        }
        //注意该方法本身就有循环判断逻辑，必须输入Y/N
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            if (houseService.del(sid)){
                System.out.println("删除成功");
            }else {
                System.out.println("房屋编号不存在,删除失败");
            }
        }else {
            System.out.println("已退出删除信息操作");
        }


    }



    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("---------房租出租系统----------");
            System.out.println("\t\t1 新增房源");
            System.out.println("\t\t2 查找房屋");
            System.out.println("\t\t3 删除房屋");
            System.out.println("\t\t4 修改房屋信息");
            System.out.println("\t\t5 房屋列表");
            System.out.println("\t\t6 退出");
            System.out.println("请输入你的选择(1-6)");
            key = Utility.readChar();
            switch (key) {
                case '1' :
                    addHouse();
                    break;
                case '2' :
                    findHouse();
                    break;
                case '3' :
                    deleteHouse();
                    break;
                case '4' :
                   update();
                    break;
                case '5' :
                   listHouse();
                    break;
                case '6' :
                   exit();
                    break;
                default:
                    System.out.println("你的选择无对应操作，请重新输入~~~~");
            }
        } while (loop);
    }


    //退出方法(修改loop)
    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
            return;
        }
        System.out.println("系统继续执行。。。");
    }

}
