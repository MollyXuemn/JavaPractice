import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * //iterator(): 返回Iterator接口的实例，用于遍历集合元素
 * 使用迭代器Iterator接口。
 * 1. 内部方法：hasNext()
 * 2. 集合对象每次调用Iterator()方法都能得到一个全新的迭代器对象，
    默认游标都在集合的第一个元素之前。
 * 3. 内部定义了remove(),可以在遍历的时候，删除集合中的元素。
 * 此方法不用于集合中直接调用remove()
 * 4. 如果还未调用next()或在上一次调用next()方法之后已经调用了remove方法，
 * 再调用remove()都会报IllegalStateException
 * 
 * - COF给迭代器模式的定义为：提供一种方法访问一个容器(container)
 * 对象中各个元素，而又不需要暴露该对象的内部细节。
 * 迭代器模式，就是为容器而生。 类似“火车上的乘务员”、“空姐”
 * 
 * - Collection接口继承了java.lang.Iterable接口，该接口有一个
 * Iterator()方法，那么所有实现了Collection接口的集合类都有一个Iterator()方法，
 * 用以返回一个实现了Iterator接口的对象
 * 
 * 
 * 
 */

public class IteratorTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList<>();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom")); //自动装箱
        coll.add(false);

        Iterator iterator = coll.iterator();
        //方式一：
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        //报异常：NoSuchElementException
        System.out.println(iterator.next());
        //方式二：
        for(int i = 0; i < coll.size();i++){
            System.out.println(iterator.next());
        }
        //方式三：推荐
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //错误方式一：
        // Iterator iterator = coll.iterator();
        while((iterator.next()) != null ){
            System.out.println(iterator.next());
        }
        //错误方式二：
        //集合对象每次调用Iterator()方法都能得到一个全新的迭代器对象，
        //默认游标都在集合的第一个元素之前。
        while(coll.iterator().hasNext()){
            System.out.println(coll.iterator().next());
        }

        //测试Iterator中的remove()
        //删除集合中"Tom"
        while(iterator.hasNext()){
            /**指针还未移到下一个元素，
            *如果还未调用next()或在上一次调用next()方法之后已经调用了remove方法，
            * 再调用remove()都会报IllegalStateException
            iterator.remove();
            */ 
            Object obj = iterator.next();
            if("Tom".equals(obj)){
                iterator.remove();
                //iterator.remove();
            }
        }

        //遍历集合
        iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
