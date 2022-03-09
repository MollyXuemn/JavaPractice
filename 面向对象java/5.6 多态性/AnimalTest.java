public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
    }

    public void func(Animal animal){//Animal animal = new Dog();
        animal.eat();
        animal.shout();
    }
}
class Animal{
    public void eat(){
        System.out.println("动物，进食：");
    }

    public void shout(){
        System.out.println("动物，叫");
        
    }
    
}

class Dog extends Animal{

    int id = 1001;
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void shout(){
        System.out.println("汪汪汪！");
        
    }
    
}
class Cat extends Animal{

    int id = 1002;
    public void eat(){
        System.out.println("猫吃鱼儿");
    }

    public void shout(){
        System.out.println("喵喵喵！");
        
    }
    
}

//ex. 与数据库的连接
class Driver{
    public void doData(Connection conn){
        conn = new MySQLConnection();
        //在 MySQLConnection数据库中调用方法 
        conn.method1();
        conn.method2();
        conn.method3();

    }
}