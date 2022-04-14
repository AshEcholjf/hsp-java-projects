package com.ljf.tool.localdatetime_;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTImeDemo {
    public static void main(String[] args) {
        //使用now返回表示当前日期时间的对象
        LocalDateTime now = LocalDateTime.now();//获取的是包含年月日和时分秒的对象
        System.out.println(now);//2022-03-31T13:21:18.428316500

        //使用DateTimeFormatter对象来格式化,不仅可以接收 LocalDateTime类，也可以接收 LocalTime和 LocalDate类
        //创建DateTimeFormatter对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //调用格式化对象的方法获取LocalDateTime对象的格式化字符串
        String format = dtf.format(now);
        System.out.println(format);//2022-03-31 13:44:17


        LocalTime now1 = LocalTime.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String format1 = dtf2.format(now1);
        System.out.println(format1);//13:44:17


        //时间戳和Date的转换
        //1.通过now方法获取当前时间的时间戳
        Instant now2 = Instant.now();
        System.out.println(now2);//2022-03-31T05:46:25.818121800Z和 LocalDateTime的结果相同，多一个Z
        //2.通过Date类的from方法转换成Date对象
        Date from = Date.from(now2);
        System.out.println(from);//Thu Mar 31 13:51:50 CST 2022
        //3.通过Date对象的toInstant方法转成时间戳
        Instant instant = from.toInstant();
        System.out.println(instant);//2022-03-31T05:51:50.028Z比直接获得的时间戳简洁一点点


        //提供plus和minus方法对时间进行加或减
        //查看900天后的日期
        LocalDateTime localDateTime = now.plusDays(900);
        System.out.println("900天后是：" + dtf.format(localDateTime));//900天后是：2024-09-16 13:54:45

        //查看9000分钟前是什么时候
        LocalDateTime localDateTime1 = now.minusMinutes(9000);
        System.out.println(" 9000min前是："+ dtf.format(localDateTime1));// 9000min前是：2022-03-25 07:55:54







//        System.out.println(now.getYear());//2022
//
//        System.out.println(now.getMonth());//MARCH英文形式
//        System.out.println(now.getMonthValue());//数字形式
//
//        System.out.println(now.getDayOfYear());//90一年中的第多少天
//        System.out.println(now.getDayOfMonth());//31这个月的第多少天
//        System.out.println(now.getDayOfWeek());//这周的星期几THURSDAY
//        System.out.println(now.getDayOfWeek().getValue());//4这周的周几转数字形式
//
//        System.out.println(now.getHour());//二十四小时形式的小时
//        System.out.println(now.getMinute());//分钟：
//        System.out.println(now.getSecond());//秒48
//        System.out.println(now.getNano());//纳秒225305600
    }
}
