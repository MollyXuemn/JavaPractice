//父类中的属性和方法都能继承到子类中，并不用重复声明

public class Student extends Person {
    // String name;
    // int age;
    // char gender;
    String major;

    public Person(){

    }
    public Person(String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void study(){
        System.out.println("学习");
    }
}
