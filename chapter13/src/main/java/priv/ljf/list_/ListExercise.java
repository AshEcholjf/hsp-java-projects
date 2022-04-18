package priv.ljf.list_;

import java.util.List;
import java.util.Vector;

//练习
public class ListExercise {
    public static void main(String[] args) {
        List list = new Vector();
        list.add(new Book("红楼梦", "曹雪芹", 100));
        list.add(new Book("西游记", "吴承恩", 10));
        list.add(new Book("水浒传", "施耐庵", 9));
        list.add(new Book("三国演义", "罗贯中", 80));
        list.add(new Book("西游记", "吴承恩", 10));
        for (Object o : list) {
            System.out.println(o);
        }

//        bubbleSort(list);
        sort(list);
        System.out.println("-------");
        for (Object o : list) {
            System.out.println(o);
        }
    }

    //选择排序
    public static void bubbleSort(List<Book> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getPrice() > list.get(j).getPrice()) {
                    Book book = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, book);
                }
            }
        }
    }

    //冒泡法
    public static void sort(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book b1 = (Book)list.get(j);
                Book b2 = (Book)list.get(j + 1);
                if (b1.getPrice() > b2.getPrice()){
                    list.set(j,b2);
                    list.set(j + 1,b1);
                }
            }
        }
    }
}
