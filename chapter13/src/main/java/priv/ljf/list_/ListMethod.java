package priv.ljf.list_;

import java.util.ArrayList;
import java.util.List;

//List方法演示
public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        System.out.println("list =" + list);
        //List接口在实现继承Collection接口的基础上，还将Colletiocn的一些方法进行了重载
        //void add(int index,Object ele):在索引为index的位置上添加ele元素，原先的元素后移
        list.add(2,"我是老六");
        //如果这里的索引越界，会报索引越界的异常，但是如果我们添加到最后一个元素的后面，不会造成越界的结果
        System.out.println("list =" + list);
        //提示：Idea快速复制当前行快捷键是：ctr + c
        //boolean addAll(int index, Collection eles)：从index的位置开始插入eles的所有元素，同样也是方法的重载
        list.addAll(list);
        System.out.println("list =" + list);

        //Object get(int index)获取指定索引处的元素
        Object o = list.get(5);//List的get方法只有这一个，没有实现其它的重载,也会存在重载的时候
        System.out.println(o);

        //Object set(int index, Object o)修改index处的元素,返回修改后的元素
        Object w = list.set(0, "老大");
        System.out.println(w);
        //lastIndexOf(Object o)返回元素最后一次出现的索引
        int i = list.lastIndexOf("我是老六");
        System.out.println(i);
//        返回元第一次出现的索引
        int i1 = list.indexOf("我是老六");
        System.out.println(i1);
        System.out.println(list.indexOf("0"));//-1如果没找到，返回-1

        //remove删除有多个是实现
        //Object remove(int index)删除指定索引处的元素,返回删除的元素
        Object remove = list.remove(0);
        System.out.println(remove);
        System.out.println("list =" + list);
        //boolean remove(Object obj)：删除第一次出现Obj的元素,返回是否删除成功
        boolean b = list.remove("我是老六");
        System.out.println(b);
        System.out.println("list =" + list);
        //removeAll(Collection eles)删除指定的集合,判断是否删除成功
//        boolean b1 = list.removeAll(list);
//        System.out.println(b1);

        //截取集合中的子集合,和字符串一样，区间都是前闭后开
        List list1 = list.subList(0, 2);
        System.out.println(list1);
        System.out.println(list);

    }
}
