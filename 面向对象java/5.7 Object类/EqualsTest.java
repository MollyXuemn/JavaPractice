/**
 * I、回顾 ==
    * ==： 运算符
    * 1. 可以使用在基本数据类型变量和引用数据变量中；
    * 2. 如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等。（不一定类型要相同）
    * 如果比较的是引用数据类型变量：比较两个对象的地址值是否相同，即两个对象是否指向
    * 同一个实体。（每new一个新实体）
    * 3. ==必须保证符号左右两边变量类型一致
 * 
 * 
 * II. equals()方法的使用：
    * 1. 它是一个方法，而非运算符
    * 2. 只适用于引用数据类型
    * 3. Object类中equals（）的定义：
    * public boolean equals(Object obj){
    *      return (this == obj);
    * }
    * 说明：Object类中定义的equals（）和==的作用是相同的：
    * 比较两个对象的地址值是否相同，即两个对象是否指向
    * 同一个实体。（每new一个新实体）
    * 4. 像String, Date, File,包装类等都重写了Object类中的equals()方法。重写后，
    * 比较的不是两个引用的地址是否相同，而是比较两个对象的“实体内容”是否相同。
    * 
    * 5. 通常情况下，如果我们自定义的类如果使用equals（）的话，也通常是比较两个对象的
    * “实体内容”是否相同。那么，我们就要对Object类中的equals()进行重写
    * 
*/


public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j); //true
        System.out.println(i == d); //true
        
        // boolean b = true;//
        // System.out.println(i == b);//==必须保证符号左右两边变量类型一致

        char c = 10;
        System.out.println(i == c);//true

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);//true
        // 引用类型
        Customer cust1 = new Customer();//引用数据类型
        Customer cust2 = new Customer();
        System.out.println(cust1 == cust2);// false
        
        String str1 = new String("a1");
        String str2 = new String("a1");
        System.out.println(str1 == str2);// false == 比较的是地址

        //equals测试
        System.out.println(str1.equals(str2));// true

        // Date date1 = new Date(32234524132L);
        // Date date2 = new Date(32234524132L);
        // System.out.println(date1.equals(date2));// true

    }
}
