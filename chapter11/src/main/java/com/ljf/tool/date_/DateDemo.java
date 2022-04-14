package com.ljf.tool.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);//输出的是当前时间:Tue Mar 29 15:12:12 CST 2022
        System.out.println(date.getTime());//输出的是date对象距离1970 00：00：00的毫秒时间:1648537932141
        Date date1 = new Date(123456789);
        System.out.println(date1);//输出的是给的long类型数据距离1970 00：00：00对应的时间:Fri Jan 02 18:17:36 CST 1970
        System.out.println(date1.getTime());//输出的就是给定的long数据:123456789

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  hh:mm:ss  E");
        System.out.println(sdf.format(date));//2022年03月29日  03:12:12  周二
//        String s = "1949年10月1日  13:00:00";
//        Date parse = sdf.parse(s);
//        System.out.println(parse);//Sat Oct 01 13:00:00 CST 1949
//        System.out.println(sdf.format(parse));//1949年10月01日  01:00:00
        String s = "2022年03月29日  03:12:12  周二";
        System.out.println(sdf.parse(s));//Tue Mar 29 03:12:12 CST 2022
        System.out.println(sdf.format(sdf.parse(s)));//2022年03月29日  03:12:12  周二
    }
}
