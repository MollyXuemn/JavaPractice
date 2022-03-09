public class Person {
    String name;
    int age;
    char gender;

    public Person(){

    }
    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        sleep();
        System.out.println("吃饭");
    }
    private void sleep(){
        System.out.println("睡觉");
    }
    public void work(){
        System.out.println("工作");
    }
}
