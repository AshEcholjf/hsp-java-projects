package priv.ljf.list_;

import java.util.Vector;
//Vector源码解读
public class Vector_ {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>();
        Vector<Object> objects = new Vector<>(8);

        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(11);
        System.out.println(vector);

        /**
         * 源码分析
         * 1.无参构造器 Vector<Object> vector = new Vector<>();
         * 补充：如果是带参构造器        Vector<Object> objects = new Vector<>(8);
         *              直接调用自身的构造器创建指定大小的集合
         *                  public Vector(int initialCapacity) {
         *                          this(initialCapacity, 0);
         *                      }
         *
         *
         *
         *      内部调用参数为10的带参构造器，创建大写为10的vector集合
         *      public Vector() {
         *         this(10);
         *     }
         *     public Vector(int initialCapacity) {
         *         this(initialCapacity, 0);
         *     }
         *
         * 2.vector.add(i);
         *      自动装箱
         *      2.1.进入add方法，调用另一个add方法
         *      public synchronized boolean add(E e) {
         *         modCount++;//集合添加的次数
         *         add(e, elementData, elementCount);
         *         return true;
         *     }
         *
         *     2.2如果当前集合的元素个数s和集合的容量相同，进入if语句进行grow扩容
         *         扩容后(或者没有进行扩容后)进行元素的添加，有效元素个数+1
         *     private void add(E e, Object[] elementData, int s) {
         *         if (s == elementData.length)
         *             elementData = grow();
         *         elementData[s] = e;
         *         elementCount = s + 1;
         *     }
         *
         *     3.如何grow(扩容)
         *     3.1、grow方法调用另一个grow方法，传入的参数是当前的元素个数+1
         *     private Object[] grow() {
         *         return grow(elementCount + 1);
         *     }
         *     3.2、
         *     private Object[] grow(int minCapacity) {
         *         int oldCapacity = elementData.length;保存原先集合的大小
         *         int newCapacity = ArraysSupport.newLength(oldCapacity,  minCapacity - oldCapacity,
         *          capacityIncrement > 0 ? capacityIncrement : oldCapacity);//这一行的三元运算符进行判断，得到的结果为oldCapacity
         *          在1.8版本中与原先的oldCapacity相加进行2倍扩容
         *
         *          return elementData = Arrays.copyOf(elementData, newCapacity);
         *          //最后返回扩容后的数组
         *          }
         */
    }
}
