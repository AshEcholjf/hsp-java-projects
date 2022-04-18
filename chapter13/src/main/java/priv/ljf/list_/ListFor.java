package priv.ljf.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//演示List接口的三类遍历方式
public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("ljf");
        list.add("zy");
        list.add("zm");
        list.add("mq");
        //第一种：普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------");
        //第二种:迭代器，继承Iterable实现可迭代
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }
        System.out.println("----------");

        //第三种：增强for循环，底层仍是迭代器
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
