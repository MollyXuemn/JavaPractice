import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Or;

/**
 * java.lang.Object类
 * 1. Object类是所有Java类的根父类
 * 2. 如果在类的声明中未使用extends关键字指明其父类，
 * 则默认父亲为java.lang.Object类
 * 3. Object类中的功能(属性、方法)就具有通用性
 * 4. Object类中只声明了一个空参构造器
 * 方法：
 * equal(Object obj)/ toString()/getClass()/ hashCode()/ Object()
 * 
 * 面试题目：
 * final、finally、finalize区别
 */
public class Object {
   public static void main(String[] args) {
       Order o1 = new Order();
       System.out.println(o1.getClass().getSuperclass();
    //    Object中方法：clone();
    //                 equals();
    //                 finalize();


   } 
}
class Order{
    int number = 1;
}
