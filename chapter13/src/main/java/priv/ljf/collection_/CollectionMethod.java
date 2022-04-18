package priv.ljf.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //接口Collection的方法
        //增删查，判断
        List list = new ArrayList();//这里使用面向对象的多态特性
        //add：添加单个元素
        //由于创建集合对象的时候没有给定泛型，所以存放的是Object类
        list.add("Jack");
        list.add(10);//这里10是基本数据类型，自动进行了装箱
        list.add(true);//同上
        System.out.println("list = " + list);
        //remove：删除元素
//        list.remove(0);//删除指定索引处的元素（0开始）
//        list.remove("Jack");//返回是是T/F是否删除成功
        //如果存在多个删除的元素，只会删除第一个
        System.out.println("list = " + list);
        //contains:查找元素是否存在
        System.out.println(list.contains("Jack"));//true
        System.out.println(list.contains("Jack!"));//false
        //size:获取集合的元素个数，这里是size多少个，数组使用的是length
        System.out.println(list.size());//3
        //clear：清空
//        list.clear();
        System.out.println("list = " + list);

        //addAll:添加多个元素,返回值是boolean，参数是Collection集合
        ArrayList list2 = new ArrayList();
        list2.add("1");
        list2.add("3");
        list2.add("2");
        list.addAll(list2);
        System.out.println("list = " + list);
        //containsAll:查找多个元素（可以理解为某个集合）是否都存在
        System.out.println(list.containsAll(list2));

        //removeAll:删除多个元素（某个集合）
        list.removeAll(list2);
        System.out.println("list = " + list);
    }
}
