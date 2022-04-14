package com.ljf.tool.localdatetime_;


import java.time.LocalDate;

public class DateLocalTimeDemo01 {
    public static void main(String[] args) {
        //需求计算1949年10月1日到2025年1月1日有多少天
        LocalDate start = LocalDate.of(1949,10,1);
        System.out.println(start);
        LocalDate end = LocalDate.of(2025,1,1);
        System.out.println(end);

        //两天之间的差距是:比较两天差距即可,但是该方法是从大到小比较的，只会比较第一个不同的字段
//        int i = end.compareTo(start);
//        System.out.println(i);
//        LocalDate minus = end.minusDays(27486);
//        System.out.println(minus);//所以差27486天，一个一个逼近

//         new LocalDate()无法访问LocalDate的构造方法\
        //toEpochDay获取该日期距离1970-1-1的天数
        long l = start.toEpochDay();
        System.out.println(l);//-7397
        long l1 = end.toEpochDay();
        System.out.println(l1);//20089
        System.out.println(l1 - l);//27486和之前凑出来的相同



    }
}
