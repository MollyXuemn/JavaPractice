import java.util.TreeSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * 创建该类的5个对象，并把这些对象放入TreeSet集合中
 * 1)使Employee实现Comparable接口，并按name排序
 * 2）创建TreeSet时传入Comparator对象，按生日日期的先后排序
 * 
*/


public class EmployeeTest {
    //问题二：按生日日期的先后排序
    public void test2(){
        TreeSet set = new  TreeSet<>(new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();

                    //方式一：
                    //比较年
            //         int minusYear = b1.getYear() - b2.getYear();
            //         if(minusYear != 0){
            //             return minusYear;
            //         }
            //         int minusMonth = b1.getMonth() - b2.getMonth();
            //         if(minusMonth != 0){
            //             return minusMonth;
            //         }
            //         return b1.getDay() - b2.getDay();
                        
                    //方式二：
                    return b1.compareTo(b2);
                }
                throw new RuntimeException("传入的数据类型不一致");
            }
        });
        //如果有相同的数据，则只输出大的那个一个
        Employee e1 = new Employee("Lida", 52, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("Cathy",43 , new MyDate(1986, 2, 4));
        Employee e3 = new Employee("Ming", 44, new MyDate(1965, 5, 9));
        Employee e4 = new Employee("Jessie", 30, new MyDate(1974, 4, 12));
        Employee e5 = new Employee("BerminHan", 25, new MyDate(1989, 6, 4));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
   
    //问题一：自然排序
   public static void main(String[] args) {
        TreeSet set = new  TreeSet<>();
        Employee e1 = new Employee("Lida", 52, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("Cathy",43 , new MyDate(1986, 2, 4));
        Employee e3 = new Employee("Ming", 44, new MyDate(1965, 5, 9));
        Employee e4 = new Employee("Jessie", 30, new MyDate(1974, 4, 12));
        Employee e5 = new Employee("BerminHan", 25, new MyDate(1989, 6, 4));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
   

}
