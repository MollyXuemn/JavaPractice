/**
 * abstract 关键字使用
 * 1. abstract: 抽象的
 * 2. abstract可以用来修饰的结构：类、方法 
 * 
 * 3. abstract 修饰类，抽象类
 *      > 此类不能实例化
 *      > 抽象类中一定有构造器, 便于子类实例化时调用（涉及：子类对象
 * 实例化的全过程 ）
 *      > 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关操作
 * 
 * 4. abstract修饰方法：抽象方法
 *      > 抽象方法只有方法的声明，没有方法体
 *      > 包含抽象方法的类，一定是个抽象类。反之，抽象类中可以没有抽象方法
 *      > 若子类重写了父类中的所有抽象方法后，此子类方可实例化
 *        若子类没有重写父类中的所有抽象方法，则此子类也是个抽象类，需要使用abstract修饰；
 * 
 * abstract使用上的注意点：
 * 1. abstract不能用来修饰：属性、构造器
 * 2. abstract不能用来修饰私有方法、静态方法、final的方法、
 * final的类
 * 3.接口是否能继承接口？能
 *   抽象类是否能实现（implements)接口？能
 *   抽象类是否能继承非抽象的类？能
 * 4.  抽象类和接口共同点：
 *      -不能实例化、都可以被继承
 *     不同点：
 *      -抽象类：有构造器；
 *      -接口：不能声明构造器
 *      多继承 vs. 单继承
 * 
 * 5.如何创建静态成员内部类和非静态成员内部类的对象？
 *     Person static Dog Bird
 *     Person.Dog dog = new Person.Dog();
 *     Person p = new Person();
 *     Person.Bird bird = p.new Bird();
 * 
 * 
 */


public class AbstractTest {
    public static void main(String[] args) {
        
        //一旦Person类抽象了，就不可以实例化
        // Person p1 = new Person();
        // p1.eat();
    }
}
abstract class Creature{
    public abstract void breath();
}

abstract class Person extends Creature {
    String name;
    int age;

    public Person(){
        
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //抽象方法
    public abstract void eat();
    // public void eat() {
    //     System.out.println("人吃饭");   
    // }
    public void walk() {
        System.out.println("人走路");
    }    

}

class Student extends Person{
    public Student(String name, int age){
        super(name, age);
    }

    //重写
    public void eat(){
        System.out.println("chi fan");
    }

    public void breath() {
        System.out.println("也需要重写父类的父类的abstract方法");
    }
}