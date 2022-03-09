// 面向对象的特征之二：继承 (inheritance)

// 1、继承性的好处：
//  a.减少了代码的雍余，提高代码复用性
//  b.便于功能的扩展
//  c.为了之后多态性的使用提供前提

// 2、继承性的格式： class A extends B {}
// A: 子类、派生类、subclass
// B：父类、超类、基类、superclass

// 2.1 体现：一旦子类A继承父类B以后，子类A就获取了B中声明的所有属性、方法
// 特别的，父类中声明为private的属性和方法，子类继承父类后，仍然获取
// 父类中私有的结构。
// 只有因为封装性的影响，使得子类不能直接调用父类的结构而已；
// 2.2 子类继承父类后，还可以声明定义自己的属性方法：实现功能的扩展；
// 子类和父类的关系，不同于子集和集合的关系。

// 3、Java中关于继承的规定：
//     3.1 一个类可以被多个子类继承；
//     3.2 Java中类的单继承性：一个类只能有一个父类；
//     3.3 多层继承：子父类是相对的概念。
//     3.4 子类直接继承的父类，称为：直接父类。间接继承的父类称为：间接父类
//     3.5 子类继承父类后，就获取了直接父类以及所有间接父类中声明的属性和方法

// 4、4.1 如果我们没有显式声明一个类的父类的话，则此类继承于java.lang.Object类
//    4.2 所有的java类（除了java.lang.Object类之外）都直接或间接继承于java.lang.Object类
//    4.3 意味着，所有的java类具有java.lang.Object类声明的功能
public class ExtendTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.eat();
        System.out.println("吃饭");

        Student s1 = new Student();
        s1.name = "Tom";
        s1.eat();
        s1.setAge(10);
        // s1.sleep();
        System.out.println(s1.getAge());
        
        s1.breath();

        Creature c = new Creature();

    }
}
