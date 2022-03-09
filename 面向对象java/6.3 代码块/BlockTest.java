import java.util.jar.Attributes.Name;

/**
 * 类成员四：代码块（初始化块）
 * 
 * 1. 代码块的作用，用来初始化类、对象
 * 2. 代码块若果有修饰的话，只能使用static
 * 3. 分类：静态代码块 vs 非静态代码块
 * 
 *  a. 静态代码块：
 *      >可以有输出语句
 *      >随着类的加载而执行，而且只执行一次
 *      >作用：初始化类的信息
 *      >如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 *      >静态代码块先与非静态代码块执行
 *      >静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构
 *      
 *      
 *  
 *  b. 非静态代码块：
 *      >可以有输出语句
 *      >随着对象的创建而执行
 *      >每创建一个对象就，就执行一次  
 *      >作用：可以在创建对象时，对对象的属性等进行初始化
 *      >如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 *      >非静态代码块内可以调用静态的属性、静态的方法，或非静态的属性、非静态的方法
 * 
 * 对属性可以赋值的位置：
 * 1. 默认初始化
 * 2. 显示初始化
 * 3. 构造器中初始化
 * 4. 有了对象以后，可以通过“对象.属性”或“对象.方法”的方式，进行赋值
 * 5. 在代码块中赋值
 * 
 */


public class BlockTest {
    //静态的main方法也需要有调用的对象才能执行
    public static void main(String[] args) {
        String desc = Person.desc;
        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println(p1.age);

        Person.info();
    }
}

class Person{
    String name;
    int age;
    static String desc = "I am a Person";

    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //代码块
    static{
        System.out.println("static block");
        desc = "我是一个不爱学习的人";

        info();
        // eat();
        // name = "TOm";
    }
    static{
        System.out.println("static block -2 ");
    }

    {
        System.out.println("unstatic block");
        age = 1;
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString(){
        return "Person [name = "+ name +", age"+ age +"]";
    }

    public static void info(){
        System.out.println("我是一个快乐的人");
    }
}