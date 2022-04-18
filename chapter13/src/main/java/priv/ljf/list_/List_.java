package priv.ljf.list_;

import java.util.ArrayList;
import java.util.List;

//List接口介绍
public class List_ {
    public static void main(String[] args) {
        @SuppressWarnings({"all"})
        //1.List集合类中元素是有序的(即添加顺序和取出顺序是一致的),且可以重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");
        list.add("tom");
        System.out.println("list = " + list);
        //2.List集合中的每个元素都有其对应的索引顺序，类似于数组，从0开始
        System.out.println(list.get(0));//jack

    }
}
