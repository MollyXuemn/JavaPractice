import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.List;


/**
 * Collection接口中声明的方法的测试
 * 
 * 向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals().
 * 
 * 差集概念
 * 
 * 
 */

public class CollectionTest1 {
    public static void main(String[] args) {
        Collection coll = new ArrayList<>();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom")); //自动装箱
        coll.add(false);

        //1. contains(Object obj):判断当前集合中是否包含obj
        //我们在判断时会调用obj对象所在类的equals()
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom"))); //判断的equals方法：true
        System.out.println(coll.contains(new Person("Jerry", 20)));//false

        //2. containsAll(Collection coll1):判断形参coll1的所有元素是否都存在于当前的集合中
        Collection coll1 = Arrays.asList(123, 456);
        System.out.println(coll.containsAll(coll1));

        coll.remove(1237);
        coll.remove(new Person("Jerry", 20));
        System.out.println(coll);

        //4. removeAll(Collection coll1): 从当前集合中移除coll1中所有的元素
        // Collection coll2 = Arrays.asList(123, 456);
        // coll.removeAll(coll2);
        // System.out.println(coll);

        //8. 集合 ---> 数组：toArray()
        Object[] arr = coll.toArray();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
        List arr1 = Arrays.asList(123, 456);
        System.out.println(arr1);
    }

    @Test
    public void test2() {
        //3. remove(Object obj)
        Collection coll = new ArrayList<>();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom")); //自动装箱
        coll.add(false);

        coll.remove(1237);
        coll.remove(new Person("Jerry", 20));
        System.out.println(coll);

        //4. removeAll(Collection coll1): 差集： 从当前集合中移除coll1中所有的元素
        Collection coll1 = Arrays.asList(123, 456);
        coll.removeAll(coll1);
        System.out.println(coll);


        //5. retainAll(Collection coll1)交集：获取当前集合和coll1集合的交集，
        //并返回当前集合
        Collection coll3 = Arrays.asList(123, 456, 789);
        coll.retainAll(coll);
        System.out.println(coll);


        //6. equals(Object obj): 判断当前集合和形参集合的元素都相同
        Collection coll4 = new ArrayList<>();//有序的
        System.out.println(coll.equals(coll4));//true

        //7. hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());


        //8. 集合 ---> 数组：toArray()
        Object[] arr = coll.toArray();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        //9.数组 ---> 集合：asList()
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);

        List arr1 = Arrays.asList(new int[]{123, 456});
        System.out.println(arr1.size());//1
        List arr2 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(arr2.size());//2


        //iterator(): 返回Iterator接口的实例，用于遍历集合元素。放在IteratorTest.java中使用
    }


    
}
