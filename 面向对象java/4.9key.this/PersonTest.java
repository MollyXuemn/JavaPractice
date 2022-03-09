// this关键字的使用：
// 1. this可以用来修饰、调用：属性、方法、构造器

// 2.  this修饰属性和方法：
//     this理解为：当前对象或当期正在创建的对象
    
//     2.1 在类的方法中，我们可以使用“this.属性”或“this.方法”的方式，调用当前对象属性或是方法。
//     但是，一般我们选择省略“this.”。特殊情况下，如果构造器\方法的形参和类的属性同名时，我们必须
//     显示的使用“this.变量”的方式，表明此变量是属性，而非形参。

// 3. this修饰、调用构造器：
//     1. 我们在类的构造器中，可以显式的使用“this（形参列表）”方式，调用本类中
//     指定的其他构造器；
//     2. 构造器中不能通过“this(形参列表)”方式调用自己
//     3. 如果一个类中有n个构造器，则最多有n-1构造其中使用了"this(形参列表)"
//     4. 规定：“this（形参列表）”必须在当前构造器的首行
//     5. 构造器内部，最多只能声明一个“this（形参列表）”，用来调用其他构造器

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setAge(1);
        System.out.println(p1.getAge());
    }
}

class Person{
    private String name;
    private int age;
    //构造器1
    public Person(){
        this.eat();
        //Person初始化时，需要考虑如下的1，2，3，4...
    }
    //构造器2
    public Person(String name){
        this();//调用上面的构造器
        this.name = name;
    }

    public void setName(String name){
        
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void eat(){
        System.out.println("人吃饭");
        this.study();
    }
    public void study(){
        System.out.println("人学习");
    }
}
