public class Person {
    String name;
    int age;
    int id = 1009;//身份证号

    public Person(){

    }
    public Person(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
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
