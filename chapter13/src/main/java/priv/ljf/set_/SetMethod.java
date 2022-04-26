package priv.ljf.set_;

import java.util.HashSet;
import java.util.Iterator;

//Set接口的常用方法
@SuppressWarnings({"all"})
public class SetMethod {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        //1.以Set接口的实现累HashSet类来讲解Set接口的常用方法
        //2.Set接口的实现类对象(Set接口对象)，不能存放重复的元素，可以添加一个null
        //3.Set接口对象存放数据是无序的(即添加数据和取出数据的顺序不一样)
        //4.注意：取出元素的顺序虽然不是添加的顺序，但他是固定的，根据底层的哈希算法获取到对应的hashcode进行排序
        hashSet.add("jack");
        hashSet.add("tom");
        hashSet.add("what");
        hashSet.add("why");
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);

        //遍历方式
        //1.迭代器
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }

        //2.增强for
        System.out.println("----------------------------");
        for (Object o : hashSet) {
            System.out.println(o);
        }

        //3.由于Set接口没办法根据索引获取对应的元素，所以不提供get方法
//        hashSet.get();


        //删除元素
        //由于set接口的集合中不存在相同的元素，所以可以直接传入需要删除的元素进行删除
        boolean aNull = hashSet.remove("null");
        System.out.println(hashSet);
    }
}
