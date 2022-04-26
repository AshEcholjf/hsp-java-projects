package priv.ljf.set_;

import java.util.HashSet;
import java.util.Set;
@SuppressWarnings({"all"})
public class HashSet_ {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        /**1.构造器的源码
         *public HashSet() {
         *         map = new HashMap<>();
         *     }
         *     所以HashSet实际上是HashMap
         * 2.HashSet不保证元素是有序的
         * 3.可以存放null值，但是只能存放一个
         *4.不能有重复的对象
         */
    }
}
