import java.util.Arrays;
import java.util.Comparator;

/**
 * 一、说明：Java中的对象，z正常情况下，只能进行比较： == 或 !=,
 *    但是在开发场景中，我们需要对多个对象进行排序，言外之意，就需要
 *    比较对象的大小。如何实现？使用两个接口中的任何一个：Comparable
 *    或Comparator
 * 
 * 二、Comparable接口与Comparator的使用的对比：
 *  COmparable接口的方式一旦一定，保证Comparable接口实现的的对象在任何位置都可以比较大小
 *  Comparator接口属于临时性的比较
 * 
 * 三、
 * BigInteger类、BigDecimal类
 * 
 * 
 */

public class CompareTest {

    /**
     * Comparable接口的使用举例： 自然排序
     * 1. 像String、包装类等实现了Comparable接口，重写了CompareTo()方法，
     * 给出了比较两个对象大小的方式
     * 2. 像String、包装类重写了compareTo()方法以后，进行了从小到大的排列
     * 3. 重写compareTo(obj)的规则：
     * 如果当前对象this大于形参对象obj，则返回正整数
     * 如果当前对象this小于形参对象obj，则返回负整数
     * 如果当前对象this等于形参对象obj，则返回零
     * 
     * 
     * 4. 对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，
     * 重写CompareTo()方法；在CompareTo(obj)方法中指明如何排序
     */
    public static void main(String[] args) {
        String[] arr0 = new String[]{"AA","BB","TT", "CC", "DD"};

        Arrays.sort(arr0);

        System.out.println(Arrays.toString(arr0));


        Goods[] arr = new Goods[5];
        arr[0] = new Goods("lenovoMouse", 34);
        arr[1] = new Goods("dellMouse", 45);
        arr[2] = new Goods("xiaomiMouse", 55);
        arr[3] = new Goods("HuaWeiMouse", 49);
        arr[4] = new Goods("AppleMouse", 49);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        String[] arr2 = new String[]{"AA","MM","TT", "CC", "TT"};
        Arrays.sort(arr2, new Comparator(){

            //按照字符串从大到小的顺序排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                
                //return 0;
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr2));
    }

    public void test2() {
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("lenovoMouse", 34);
        arr[1] = new Goods("dellMouse", 45);
        arr[2] = new Goods("xiaomiMouse", 55);
        arr[3] = new Goods("HuaWeiMouse", 49);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }


    /**
     * 二、Comparable接口的使用：定制排序
     * 1. 背景：
     * 当元素的类型没有实现java.lang.Comaprabel接口而又不方便修改代码
     * 或者实现了java.lang.Comaprabel接口的排序规则不适合当前的操作，
     * 那么可以考虑使用Comparator的对象来排序
     * 
     * 2. 重写compare(Object o1, Object o2)方法，比较o1和o2的大小：
     * 如果方法返回正整数，则表示o1 > o2；
     * 如果返回0，则表示相等；
     * 返回负整数，表示o1 < o2;
     */
    // @Test
    public void test3() {
        String[] arr0 = new String[]{"AA","MM","TT", "CC", "TT"};
        Arrays.sort(arr0, new Comparator(){

            //按照字符串从大到小的顺序排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                
                //return 0;
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr0));
    }

    public void test4() {
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("lenovoMouse", 34);
        arr[1] = new Goods("dellMouse", 45);
        arr[2] = new Goods("xiaomiMouse", 55);
        arr[3] = new Goods("HuaWeiMouse", 49);

        //指明商品比较大小的方式: 按照按照产品名称从低到高排序，再按价格从高到低排序
        Arrays.sort(arr, new Comparator(){

            //按照字符串从大到小的顺序排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    Goods g1 = (Goods) o1;
                    Goods g2 = (Goods) o2;
                    //先比较名称字母大小，若相等
                    if(g1.getName().equals(g2.getName())){
                        //再比较价格
                        return -Double.compare(g1.getPrice(), g2.getPrice());
                    }else{
                        return g1.getName().compareTo(g2.getName());
                    }
                    
                }
                //return 0;
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));

    }

    
}
