/**
 * Object类中toString()的使用
 * 1. 当我们要输出一个对象的引用时，实际上就是调用当前对象的toString()
 * 2. Object类中toString()定义：
 *    public String toString(){
 *       return getClass().getName()+"@" + Integer.toHexString(hashCode());
 *    }
 *  3.  想String、Date、File、包装类都重写了Object类中的toString()方法。
 *    使得在调用对象的toString()时，返回”实体内容“
 * 
 *  4. 自定义类也可以重写toString()方法，当调用对象此方法时候，调用对象的”实体内容“。 
 */


public class ToStringTest {
     public static void main(String[] args) {
        Customer cust1 = new Customer("Tom", 21);
        System.out.println(cust1.toString());//Customer@5451c3a8
        System.out.println(cust1);//Customer@5451c3a8 --> Customer[name = Tom ,age = 21]

        String str = new String("MM");
        System.out.println(str);  //MM  
      }
}
