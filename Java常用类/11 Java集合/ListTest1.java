import java.unit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/**
 * 
 * 
 * 
 */

public class ListTest1 {
    /**
     * void add(int index, Object ele): 在index位置插入ele元素
     * boolean addAll(int index, Collection eles): 从index位置开始将eles中的
     * 所有元素添加进来
     * Object.get(int index):获取指定index位置的元素
     * int indexOf(Object obj): 返回obj在集合中首次出现的位置
     * int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
     * Object remove(int index): 移除指定index位置的元素，并返回此元素
     * Object set(int index, Object ele):设定指定index位置的元素为ele
     * List sublist(int from Index, int toIndex):返回fromIndex到toIndex位置的子集和
    
     总结：常用方法
     增：add(Object obj)
     删：remove(int index) /remove(Object obj)
     改：set(int index, Object ele)
     查：get(int index)
     插：add(int index, Object ele)
     长度：size()
     遍历：Iterator
          增强for循环
          普通的循环  
     
     */

     public void test1() {
         ArrayList list = new ArrayList<>();
         list.add(123);
         list.add(456);
         list.add(new Person("Tom", 12));
         list.add(456);

         int index = list.indexOf(456); //如果不存在返回-1
         
         //remove(int index): 移除指定index位置的元素，并返回此元素
         Object obj = list.remove(0);
         System.out.println(list);

         //void add(int index, Object ele): 在index位置插入ele元素
         list.add(1, "BB");
         System.out.println(list);

        //boolean addAll(int index, Collection eles): 从index位置开始将eles中的
        //所有元素添加进来
         List list1 = Arrays.asList(1,2,3);
         list.addAll(list1);
         System.out.println(list.size()); //9

         //Object.get(int index):获取指定index位置的元素

        //方式一：Iterator迭代器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("******************");

        //方式二：
        for(Object obj2 :list){
            System.out.println(obj2);
        }

        //方式三：普通for循环
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }


        public void test2() {
            ArrayList list2 = new ArrayList<>();
            list2.add(123);
            list2.add(456);
            list2.add(9);
            updateList(list2);
            System.out.println(list2);//
        }

        //面试题目：区分list中remove(int index)和remove(new Integer(ele));
        private static void updateList(List list2) {
            // list.remove(2);//Index
            list2.remove(new Integer(9));
        }



     }
}
