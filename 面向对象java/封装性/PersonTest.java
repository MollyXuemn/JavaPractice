public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        // p1.age = 1; 编译不通过
        p1.setAge(20);
        System.out.println("年龄为：" + p1.getAge());

        Person p2 = new Person("Tom", 22);
        System.out.println("名字为：" + p2.getName()+ ",age " + p2.getAge());


    }
}
