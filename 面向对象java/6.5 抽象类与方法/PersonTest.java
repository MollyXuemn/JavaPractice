import java.lang.reflect.Method;

/**
 * 创建抽象类的匿名子类对象
 * 
 * 
 */


public class PersonTest {
 
    public static void main(String[] args) {
        method(new Student); //匿名对象
        Worker w1 = new Worker();
        method1(new Worker());//非匿名的类匿名的对象

        method1(new Worker());//非匿名的类匿名的对象
        //创建了一个匿名子类的对象：p
        Person p = new Person(){

            @Override
            public void eat() {
                System.out.println("吃饭");
            }

        };

        method1(p);
    }
    

    public static void method(Person p) {
        p.eat();
        p.work();
        
    }
    
    public static void method(Student s) {
        
    }

}


class Worker extends Person{
    public void eat(){

    }   
    public void work() {
        
    }
}