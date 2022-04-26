package priv.ljf.set_;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        //HashSet不能添加相同的元素
        Set hashSet = new HashSet();
        hashSet.add(new Dog("tom"));
        hashSet.add(new Dog("tom"));
        System.out.println("hashSet = " + hashSet);
        //由于这两个对象只是名字相同，但是底层的地址不同，根据哈希算法得到的数据不同，所以可以添加成功

        //经典面试题
        //需要根据源码探索
        hashSet.add(new String("hsp"));//添加成功
        hashSet.add(new String("hsp"));//添加失败
        System.out.println("hashSet = " + hashSet);
    }
}

class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
