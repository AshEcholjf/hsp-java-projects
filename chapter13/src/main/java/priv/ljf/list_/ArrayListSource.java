package priv.ljf.list_;

import java.util.ArrayList;
import java.util.Arrays;

//ArrayList底层扩容机制源码分析
@SuppressWarnings({"all"})
public class ArrayListSource {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
/**1.
 * public ArrayList() {
 *         this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
 *     }
 *   1.调用无参构造器创建Object[] elementData数组，数组大小默认是0
 *    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
 */

/**2.
 * public static Integer valueOf(int i) {
 *         if (i >= IntegerCache.low && i <= IntegerCache.high)
 *             return IntegerCache.cache[i + (-IntegerCache.low)];
 *         return new Integer(i);
 *     }
 *    自动装箱
 */

/**3.
 *  public boolean add(E e) {
 *         modCount++;
 *         add(e, elementData, size);
 *         return true;
 *进入add方法，modCount表示修改的次数，每次修改都会+1，默认是0(protected transient int modCount = 0;)
 * 然后调用 add(e, elementData, size);
 */

/**4.
 * private void add(E e, Object[] elementData, int s) {
 *         if (s == elementData.length)
 *             elementData = grow();
 *         elementData[s] = e;
 *         size = s + 1;
 *     }
 *   e表示需要添加的元素，elementData表示数组，s是又size传入的，size表示当前数组所包含的元素个数
 *
 *  如果当前元素的个数和数组长度相同，就需要先扩容再添加
 *   进入grow方法进行扩容
 */

/**5.
 * private Object[] grow() {
 *         return grow(size + 1);
 *     }
 *     调用grow(size + 1)，最小容量minCapacity，在原先数组长度上+1
 */

/**6.
 * private Object[] grow(int minCapacity) {
 *         int oldCapacity = elementData.length;
 *         if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
 *             int newCapacity = ArraysSupport.newLength(oldCapacity, minCapacity - oldCapacity,oldCapacity >> 1)
 *                      return elementData = Arrays.copyOf(elementData, newCapacity);
 *              } else{
 *                      return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
 *              }
 *}
 *
 * 先将扩容前的数组长度保存到oldCapacity
 * 如果扩容前的数组是非空的或者有效元素个数不是0，那么将数组扩容致原先的1.5倍，并将原先的元素复制给新的数组:Arrays.copyOf(elementData, newCapacity);
 *
 * 如果需要扩容的数组是null的，或者长度是0，那么创建一个新的数组赋给elementData，大小为Math.max(DEFAULT_CAPACITY, minCapacity)，DEFAULT_CAPACITY默认是10
 */


        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);

        for (Object o : list) {
            System.out.print(o + " ");
        }

        //如果是带参构造器，则初始化数组的长度是给定的，扩容也是以给定的参数为基础进行1.5倍扩容

    }
}
