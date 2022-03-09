import java.util.TreeSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class TreeSetTest {

    /**
     * 1. 向TreeSet中添加的数据，要求是相同类的对象。
     * 2. 两种排序方式：自然排序(实现Comparable接口)和定制排序(Comparator)
     *  
     * 3. 自然排序中，比较两个对象是否相同的标准为：compareTo()返回0，
     * 不再是equals()
     * 
     * 4. 定制排序中，比较两个对象是否相同的标准为：compare()返回0，
     * 不再是equals()
     * @param args
     */
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        //失败：不能添加不同类的对象
        // set.add(456);
        // set.add(123);
        // set.add("AA");
        // set.add("CC");
        // set.add(new User("Tom", 12));
        
        //举例一：
        // set.add(34);
        // set.add(-34);
        // set.add(43);
        // set.add(11);
        // set.add(0);


        //举例二：
        set.add(new User("Tom", 12));
        set.add(new User("Jerry", 32));
        set.add(new User("Mike", 2));
        set.add(new User("Jim", 52));
        set.add(new User("Jack", 42));
        set.add(new User("Jack", 84));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    //定制排序
    public void test2() {
        Comparator com = new Comparator(){
            //按照年龄从小到大排列，
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                }else{
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        }; 

        TreeSet set = new TreeSet(com);//按照如上指定的方式去排

        set.add(new User("Tom", 12));
        set.add(new User("Jerry", 32));
        set.add(new User("Mike", 2));
        set.add(new User("Jim", 52));
        set.add(new User("Jack", 42));
        set.add(new User("Jack", 84));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
