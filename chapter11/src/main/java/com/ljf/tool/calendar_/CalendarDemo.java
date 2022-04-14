package com.ljf.tool.calendar_;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //1.Calendar是一个抽象类，所以我们没办法直接创造它的对象，而且它的构造器是public修饰，（非子类的外部包类）无法访问
        //2.Calendar提供一个static修饰的方法getInstance(),我们可以通过该方法获取对象使用类的方法
        //3.Calendar类提供了大量的字段和方法，属性都是static修饰的，方法有static也有非静态的
        //4.该类没有提供对应的日期格式化的类，所以我们可以根据自己需要来组合

        //获得Calendar类对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        //java.util.GregorianCalendar[time=1648697696388,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=14,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=90,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=34,SECOND=56,MILLISECOND=388,ZONE_OFFSET=28800000,DST_OFFSET=0]
        //cal输出了调用toString输出一系列字段信息和自己拼接的信息

        //我们可以根据自身来获取
        System.out.println("年：" + cal.get(Calendar.YEAR));//年：2022
        //当前月份为3，但是月份从0开始计数，所以通常我们需要+1
        System.out.println("月：" + cal.get(Calendar.MONTH));//月：2
        System.out.println("日：" + cal.get(Calendar.DATE));//日：31
        System.out.println( cal.get(Calendar.HOUR) + "时");//11时
        //如果我们需要获取的24小时的小时数
        System.out.println("24小时格式："+ cal.get( Calendar.HOUR_OF_DAY) + "时");

        System.out.println( cal.get(Calendar.MINUTE)+ "分");//40分
        System.out.println( cal.get(Calendar.SECOND)+ "秒");//12秒

        System.out.println(cal.get(Calendar.YEAR) + "-" + cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DATE) + " "
        + cal.get(Calendar.HOUR) +"时" + cal.get(Calendar.MINUTE) + "分" + cal.get(Calendar.SECOND) + "秒");
        //2022-2-31 11时42分33秒
//        Calendar instance = Calendar.getInstance(cal);参数不对应

    }
}
