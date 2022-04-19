package priv.ljf.collection_;

import java.util.ArrayList;

//ArrayList的注意事项
@SuppressWarnings({"all"})
public class ArrayListDetails {
    public static void main(String[] args) {
        //1.ArrayList可以存放null,可重复
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        System.out.println(arrayList);
        //2.ArrayList底层是用数组来实现的
        //3.ArrayList基本等同于Vector，但是线程不安全，所以效率也高一些
        //例：add方法,没有synchronized
//        public boolean add(E e) {
//        modCount++;
//        add(e, elementData, size);
//        return true;
//    }
    }
}
