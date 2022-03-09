//父类中的属性和方法都能继承到子类中，并不用重复声明

public class Student extends Person {
    // String name;
    // int age;
    // char gender;
    String major;

    public Student(){

    }
    public Student(String major){
        this.major = major;
    }

    public void study(){
        System.out.println("学习,专业是：" + major);
    }
    //对父类中的方法进行重写
    public void eat(){
        System.out.println("学生在学习应该多吃有营养的食物");
    }
    //不是重写
    public void work(){
        System.out.println("i am a student");
    }

    
}
