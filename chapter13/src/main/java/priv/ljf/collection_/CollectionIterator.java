package priv.ljf.collection_;

import java.util.ArrayList;
import java.util.Iterator;

//迭代器使用演示
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Book("三国演义", "罗贯中", 10.1));
        list.add(new Book("小李飞刀", "古龙", 56.1));
        list.add(new Book("水浒传", "吴承恩", 66.1));
//        System.out.println("list " + list);
        //如果需要一个个遍历
        //list是ArrayList类的对象，该类继承了List，List继承了Collection，Collection继承了Iterale，Iterable声明了iterator()方法，该方法返回一个迭代器类Iterator
        //最后该方法由ArrayList类实现，返回了Itr类（该类是ArrayList的内部类，实现了Iterator接口），最后返回了一个list对应的迭代器
        Iterator it = list.iterator();
        //使用while实现循环
        while (it.hasNext()) {
            Object next = it.next();//存的是Book类，编译类型是Object，获取的编译类型是Object，运行类型还是Book类
            System.out.println(next);
        }
//当退出while循环时，迭代器的游标已经指向底部，如果再次调用next方法会出现异常NoSuchElementException
//        it.next();
//如果我们要重置迭代器的游标
        it = list.iterator();
        it.next();

        //提示1.：迭代器快速遍历快捷键，模块：itit
        //提示2.：显示所有快捷键的快捷键ctr + j
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
