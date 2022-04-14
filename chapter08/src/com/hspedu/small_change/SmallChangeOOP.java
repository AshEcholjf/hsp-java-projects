package com.hspedu.small_change;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {
    //该类用来实现零钱通的各个功能
    private String detail ="";//用来展示零钱通明细的变量，使用拼接(给空字符，否则显示null)
    private double money;//总金额
    Scanner sc =new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm ");
    Date date =new Date();


    //显示菜单功能
    public void showMenu(){
            System.out.println("-----------零钱通菜单------");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退出 ");
            System.out.println("请选择：(1-4)");
    }

    //实现功能选择
    public void menuUse(){
        boolean loop = true;//控制退出菜单循环的变量
        while (loop){
            String key;//用来接受键盘输入的选择
            showMenu();
           key =  sc.next();
           switch (key){
               case "1":
                   showSmallChange();
                   break;
               case "2":
                   addMoney();
                   break;
               case "3":
                  subMoney();
                  break;
               case "4":
                   loop = exitChange();
                   break;
               default:
                   System.out.println("你的输入有误，请重新选择");
           }
        }

    }

    //实现显示零钱通明细
    public void showSmallChange(){
        System.out.println("-------零钱通明细-------");
        System.out.println(detail);
    }

    //实现收益入账
    public void addMoney(){
        System.out.println("请输入收益金额");
        double moneyOne = sc.nextDouble();
        //判断金额是否符合实际
        if (moneyOne < 0) {
            System.out.println("你输入的金额有误");
            return;
        }
        //修改余额
        money += moneyOne;
        //明细拼接
        detail += "\n收益入账\t+" + money + "\t" + sdf.format(date)+"\t余额："+ money;
    }

    //实现消费功能
    public void subMoney(){
        double moneyTwo ;
        String wayMoney = "";//记录消费方式
        System.out.println("请输入消费金额");
        moneyTwo = sc.nextDouble();
        if (moneyTwo > money){
            System.out.println("你输入的金额有误，应在0.0-"+ money +"之间");
            return;
        }
        System.out.println("请输入消费途径");
        wayMoney = sc.next();
            //修改余额
        money -= moneyTwo;
            //信息拼接
        detail += "\n"+ wayMoney +"\t-"+ moneyTwo + "\t" + sdf.format(date) + "\t余额：" + money;

    }

    //实现退出功能
    public boolean exitChange(){
        String flag;
        while (true){
        System.out.println("你确定要退出程序吗？y/n");
        flag = sc.next();
        if (flag.equals("y")){
            System.out.println("程序已退出----");
            return false;
            }
        if (flag.equals("n")){
            return true;
            }
        }
    }

}
