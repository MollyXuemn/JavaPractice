/**
 * 接口的使用：
 * 1. 接口使用Interface来定义
 * 2. 在Java中，接口和类是并列的两个结构
 * 3. 如何定义接口：定义接口中的成员
 *      3.1 JDK7及以前：只能定义全局常量和抽象方法：
 *          >全局常量：public static final的
 *          >抽象方法：public abstract的
 *      
 *      3.2 JDK8:除了定义全局常量和抽象方法外，还可以定义
 *          静态方法、默认方法
 * 
 * 4. 接口中不能定义构造器：意味着接口不可以实例化
 * 
 * 5. Java开发中，接口都通过让类去实现（implement）的方式来使用
 *      如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 *      如果实现类没有覆盖接口中的所有抽象方法，则此实现类仍为一个抽象类
 *
 * 6. Java类可以实现多个接口 ---> 弥补了Java单继承性的局限性
 *  格式：class AA extends BB implements CC,DD,EE{}   
 * 7. 接口和接口之间可以继承，而且可以多继承 
 *   
 * 8. 接口的具体使用，体现多态性

 * 9. 接口，实际上可以看做是一种规范

 * 面试题：抽象类与接口有哪些异同？
   
        
 */

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        // Flyable.MIN_SPEED = 2;接口不可以实例化

        Plane plane = new Plane();
        plane.fly();
    }
}

interface Flyable{

    //全局常量
    public static final int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;//省略了public static final 

    //抽象方法
    public abstract void fly();
    //省略了public abstract
    void stop();
        
}

interface Attactable{
    void attack();//抽象方法
}


class Plane implements Flyable{
    public void fly() {
        System.out.println("通过引擎起飞");       
    }
    public void  stop() {
        System.out.println("驾驶员减速停止");
    }
}

abstract class Kite implements Flyable{
    public void fly() {
        
    }
}

class Bullet extends Objects implements Flyable, Attactable,CC{
    public void attack() {
        
    }

    public void fly() {
        
    }

    public void stop() {
        
    }

    public void method1() {
        
    }
    public void method2() {
        
    }
}
//************************* */

interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{

}