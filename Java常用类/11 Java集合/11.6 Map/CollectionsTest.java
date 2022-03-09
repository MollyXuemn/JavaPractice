import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections: 操作Set、List和Map等集合的工具类
 * Collections中提供了一系列静态的方法对集合元素进行排序、查询和修改等操作，
 * 还提供了对集合对象设置不可变、对集合对象实现同步控制等方法
 * 
 * 面试题：Collection 和 Collections的区别？
 * 
 * 排序操作：（均为static方法）
 * - reverse(List):反转List中元素的顺序
 * - shuffle(List): 对List集合元素进行随机排序
 * - sort(List)：根据元素的自然顺序对指定list集合元素按升序排序
 * - sort(List, Comparator):根据指定的Comparator产生的顺序对List集合元素进行排序
 * - swap(List, int, int): 将指定list集合中的i处元素进行交换
 * 
 * Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
 * 
 * 
 */


public class CollectionsTest {
    List list = new ArrayList<>();
    list.add(123);
    list.add(489);
    list.add(0);
    list.add(-99);


    System.out.println(list);


    //Collections.reverse(list);
    Collections.shuffle(list);
    System.out.println(list);

    //Collections类中提供了多个synchronizedXxx()方法，
    //该方法将指定集合包装成线程同步的集合，从而可以解决多线程并发访问集合时的线程安全问题
    
    //返回的list1即为线程安全的List
    List list1 = Collections.synchronizedList(list);
    
    


}
