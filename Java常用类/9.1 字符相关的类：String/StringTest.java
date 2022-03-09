/**
 * String的使用：
 *  1. 代表字符串 用”“
 *   2. String 是一个final类，代表不可变的字符序列
 *   3. String实现了Serializable接口：表示字符创是支持序列化的
 *            实现了Comparable接口：表示String可以比较大小
 *   4. String内部定义了final char[] value用于存储字符创数据
 *   5. String代表不可变的字符序列。简称：不可变性 
 *            体现：1. 当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有value进行赋值
 *                 2. 当对现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有value进行赋值
 *                 3. 当调用String的replace方法修改指定的字符或字符串时，也需要重新指定内存区域赋值，不能使用原有value进行赋值
 *   6. 通过字面量的方式（区别于new)给一个字符创赋值，此时的字符串值声明在
 *      字符串常量池中。
 *   7. 字符串常量池是不会存储相同内容的字符串的
 *   
 *    面试题：1. String s = new String("abc");方式创建对象，在内存中创建了几个对象？
 *           两个：一个是堆空间中new的结构，另一个是char[]对应的常量池中的数据：“abc”
 *           2. String的不可变性：见（Person.java）
 */
import org.junit.Test;

public class StringTest {
    /**
     * test3 结论：
     * 常量与常量的拼接结果在常量池。且常量池中不会存在相同内容的常量。
     * 只要其中有一个是变量，结果就在堆中；
     * 如果拼接结果调用intern()方法，返回值就在常量池中
     * 
     *  */ 
    public void test3() {
        String s1 = "JavaEE";
        String s2 = "HelloMolly";

        String s3 = "JavaEEHelloMolly";
        String s4 = "JavaEE" + "HelloMolly";
        String s5 = s1 + "HelloMolly"; //有变量
        String s6 = "JavaEE" + s2;
        String s7 = s1 + s2;
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false


        String s8 = s5.intern();//返回值得到的s8使用的常量值中已经存在的“JavaEEHelloMolly”
        System.out.println(s3 == s8);//true

        final String s9 = "HelloMolly"; //加了final为常量
        String s10 = s1 + s9;
        System.out.println(s3 == s10);//true

    }

    @Test
    public void test2() {
        //通过字面量定义的方式：此时的s1和s2的数据javaEE声明在方法区中的字符串常量池中
        String s1 = "JavaEE";
        String s2 = "JavaEE";
        //通过new + 构造器的方式：此时的s3和s4保存的地址值，是数据在对空间中开辟空间以后对应的地址值
        String s3 = new String("JavaEE");
        String S4 = new String("JavaEE");
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false
        
        Person p1 = new Person(name: "Tom", age:12);
        Person p2 = new Person(name: "Tom", age:12);
        
        System.out.println(s1 equals(s2)); //true
        System.out.println(s1 == s2); //true

        p1.name = "Jerry";
        System.out.println(s1.name); //Jerry
        System.out.println(s2.name); //Tom 不可变性
    }

    public void test1() {
        String s1 = "abc";//字面量
        String s2 = "abc";
        s1 = "Hello";
        
        System.out.println(s1 == s2);//比较s1和s2地址值

        System.out.println(s1);//hello
        System.out.println(s2);//abc
        
        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);//abcdef

        System.out.println("*************");//
        String s4 = "abc";
        String s5 = s4.replace('a', 'm');
        System.out.println(s4);//
        System.out.println(s5);//mbc
    }
}
