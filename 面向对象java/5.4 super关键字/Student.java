//父类中的属性和方法都能继承到子类中，并不用重复声明

public class Student extends Person {
    // String name;
    // int age;
    // char gender;
    String major;
    int id = 1002;

    public Student(){

    }
    public Student(String major){
        this.major = major;
    }

    public Student(String name, int age, String major){
        // this.name = name;
        // this.age = age;
        super.name = name;
        super.age = age;
        this.major = major;
    }

    @Override
    public void eat(){
        System.out.println("吃饭");
    }

    public void study(){
        System.out.println("学习");
        this.eat();
        super.eat();
    }

    public void work(){
        System.out.println("name" + this.name + ", age" + super.age);
        System.out.println("id = " + this.id );
        System.out.println("id = " + super.id );
    }

}
