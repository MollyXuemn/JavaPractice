/**
 * 内部类：
 * 1. Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B就是外部类
 * 
 * 2. 内部类的分类：成员内部类 vs. 局部内部类（方法内、代码块内
 * 构造器内）
 * 
 * 3. 成员内部类：
 *         一方面：作为外部类的成员：
 *                  >调用外部类的结构
 *                  > 可以被static修饰
 *                  > 可以被4中不同的权限修饰
 *         另一方面：作为一个类：
 *                  >类内部可以定义属性、方法、构造器
 *                  >可以被final修饰，表示此类不能被继承。
 *                  言外之意，不用final就可以被继承
 *                  >可以被abstract修饰
 * 4. 关注如果下的3个问题：
 *      4.1 如何实例化成员内部类
 *      4.2 如何在成员内部类中区分调用外部类的机构
 *      4.3 开发中局部类的使用 (见InnerClassTest1.java)
 * 
 * 
 */


public class InnerClassTest {
    public static void main(String[] args) {
        //创建Dog实例(静态的成员内部类)：
        Person.Dog dog = new Person.Dog();
        dog.show();
        //创建Bird实例（非静态—）：
        // Person.Cat cat = new Person();
        Person p = new Person();
        Person.Cat cat = p.new Cat();
        cat.shout();
        System.out.println("*****");
        cat.display("Kitty");

    }
}

class Person{
    String name = "美国鸟";
    public void eat() {
        System.out.println("吃饭");
    }
    //成员内部类
    static class Dog{
        String name;
        public void show(){
            System.out.println("狗狗");
            //eat();
        }
    }
    //非静态成员内部类
    class Cat{
        String name = "中国鸟";
        public Cat(){

        }
        public void shout() {
            System.out.println("喵喵喵喵~");
            //调用外部类的属性：
            Person.this.eat();
        }
        public void display(String name) {
            System.out.println(name);//方法的形参
            System.out.println(this.name);//内部类的形参
            System.out.println(Person.this.name);//外部类的形参
        }
    }

    // public void method() {
    //     //局部类
    //     class AA「

    // }

    // {
    //     class BB{

    //     }
    // }
    // public Person(){
    //     //局部内部类
    //     class CC{

    //     }
    // }
}
