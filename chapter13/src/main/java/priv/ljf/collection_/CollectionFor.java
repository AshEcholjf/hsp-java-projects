package priv.ljf.collection_;

import java.util.ArrayList;

public class CollectionFor {
    @SuppressWarnings({"All"})
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Book("三国演义", "罗贯中", 10.1));
        list.add(new Book("小李飞刀", "古龙", 56.1));
        list.add(new Book("水浒传", "吴承恩", 66.1));
        // 1.使用增强for循环进行集合遍历
        // 2.增强for,底层仍是迭代器,可以将它理解为简化版的迭代器
//        for (Object o :list) {
//            System.out.println(o);
//        }
        //快捷方式：I
        for (Object o : list) {
            System.out.println(o);
        }
        //增强for也可以直接在数组使用
        int[] num = {1,22,33,44,77};
        for (int i :num) {
            System.out.println(i);
        }

    }
}
