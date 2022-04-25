package priv.ljf.list_;

import java.util.Iterator;
import java.util.LinkedList;

//LinkedList源码解读
public class LinkedListCrud {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        System.out.println(linkedList);
        System.out.println("-----------");
        //演示删除一个节点
        linkedList.remove();//默认删除第一个
//        linkedList.remove(0);remove()方法存在很多重载，只取一个进行分析
        System.out.println(linkedList);
        /**
         *  1.调用构造函数初始化
         *    public LinkedList() {}
         *    size = 0,first = null;last = null;modCount = 0;
         *
         *   2.进入add方法，执行linkedLast(e)方法
         *    public boolean add(E e) {
         *                 linkLast(e);
         *                 return true;
         *             }
         *
         *
         *   3.
         *    void linkLast(E e) {
         *      final Node<E> l = last;
         *      final Node<E> newNode = new Node<>(l, e, null);
         *      last = newNode;
         *      if (l == null)
         *          first = newNode;
         *      else
         *          l.next = newNode;
         *      size++;
         *      modCount++;
         *      }
         *      添加元素：
         *      NOde的构造函数
         *      Node(Node<E> prev, E element, Node<E> next) {
         *             this.item = element;
         *             this.next = next;
         *             this.prev = prev;
         *         }
         *         分类两种情况讨论
         *      .1:如果是第一次添加元素，first和last都是null
         *          那么此时l变量指向的也是null
         *          创建一个新的节点node，node的pre指向l的是null，next指向null(一直都是null)
         *          修改last指针指向新节点node，此时last已经指向链表的最后
         *          然后根据l的情况对新节点进行操作
         *          如果l是null，那么说明是第一次添加元素，需要将first指向指向node节点，形成一个完整的链表
         *          最后将会size和modCount变量+1
         *       .2如果链表已经存在节点，需要将新的节点添加到链表的尾部
         *          此时l指针指向last，即最后一个节点
         *          创建新的节点，node，pre是l，指向链表最后一个元素，next是null
         *          将last指针指向node，变成新的链表尾部
         *          进入if判断，此时不是第一次添加元素，所以l不会是null
         *           l.next = newNode;实现链表原先尾部节点指向新节点，实现双向闭合
         *           最后size和modCount+1
         *
         *
         */


        //删除节点分析
        /**
         * 1.调用remove()方法，进入removeFirst()方法
         *      public E remove() {
         *         return removeFirst();
         *     }
         *
         *  2.如果链表为空链表，就抛出异常，否则调用unlinkFirst()方法
         *      public E removeFirst() {
         *         final Node<E> f = first;
         *         if (f == null)
         *             throw new NoSuchElementException();
         *         return unlinkFirst(f);
         *     }
         *
         *     3.
         *      private E unlinkFirst(Node<E> f) {
         *         // assert f == first && f != null;
         *         final E element = f.item;
         *         final Node<E> next = f.next;
         *         f.item = null;
         *         f.next = null; // help GC
         *         first = next;
         *         if (next == null)
         *             last = null;
         *         else
         *             next.prev = null;
         *         size--;
         *         modCount++;
         *         return element;
         *     }
         *     先执行 final E element = f.item;保存此时first指向的数据，用来返回删除的数据
         *     标记一个first下一个节点，next，防止此时first已经是最后一个元素
         *     修改first的next指针指向null
         *     将first移动到下一位
         *     判断此时first的指针也就是next指针的位置，如果这个位置是null，那么说明之前last指向的也是刚刚被删除的节点，将last置空
         *     如果删除的不是最后一个元素，只需要将需要删除的节点与first切断next指针的联系，将next.pre = null
         *     此时被删除的节点与链表不存在联系了，有gc处理
         *     最后修改size和modCount
         *     返回删除的元素
         *
         */


        //LinkedList的遍历
        //1.增强for
        for (Object o : linkedList) {
            System.out.println(o);
        }
        System.out.println("--------");
        //2.迭代器
        Iterator iterator = linkedList.iterator();
        //获取链表对应的迭代器对象
        while (iterator.hasNext()){//判断当前的游标是否指向有效元素
            Object next = iterator.next();//获取当前的游标指向的元素，并且下移
            System.out.println(next);
        }
        //3.普通for循环
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

    }
}
