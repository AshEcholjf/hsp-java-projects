package com.ljf.tool.arraytool;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("Java入门", 300);
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() - o2.getPrice() > 0){
                    return 1;
                }else if (o1.getPrice() - o2.getPrice()<0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });

        System.out.println("按照价格定制递增排序" + Arrays.toString(books));
        System.out.println("-------------");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o2.getPrice() - o1.getPrice() > 0){
                    return 1;
                }else if (o2.getPrice() - o1.getPrice()<0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });

        System.out.println("按照价格定制递减排序" + Arrays.toString(books));
        System.out.println("------------");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNameLength() - o2.getNameLength();
            }
        });

        System.out.println("按照书名长度定制递增排序" + Arrays.toString(books));
    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNameLength(){
        return name.length();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
