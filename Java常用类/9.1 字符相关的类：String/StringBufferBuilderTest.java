/***
 * String、StringBuffer、StringBuilder三者的异同：
 * String: 不可变的字符序列; 
 * StringBuffer: 可变的字符序列;线程安全的synchronise，效率低；
 * StringBuilder: 可变的字符序列；jdk5.0新增，线程不安全，效率高；
 * 相同：底层使用char[]存储
 * 
 * 源码分析：
 * String str = new String();
 * String str1 = new String("abc"); //new char[]{'a','b','c'};
 * 
 * StringBuffer stb1 = new StringBuffer();
 * //new char[16];底层创建了一个长度是16的数组
 * System.out.println(sb1.length());//
 * 
 * sb1.append('a');//value[0] = 'a';
 * sb1.append('b');//value[1] = 'b';
 *  
 * StringBuffer sb2 = new StringBuffer("abc");//char[] value = new char["abc".lenght()+ 16];
 * //问题1. System.out.println(sb2.length());// 3; count
 * 
 * //问题2：扩容问题：如果要添加的数据底层盛不下了，那就需要扩容底层的数组
 *         默认情况下，扩容为原来容量的2倍 + 2，同时将原有数组中的元素复制到新的数组中。
 * //与StringBuffer、StringBuilder之间的转换
 * String --> StringBuffer，StringBuilder
 * 
 * 指导意义：建议在开发中时候用 StringBuffer(int capacity)或
  */


public class StringBufferBuilderTest {
    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0, "m");
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.length());//0
    }
}
