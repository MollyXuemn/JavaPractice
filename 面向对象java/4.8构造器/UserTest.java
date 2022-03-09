// 总结：属性赋值的先后顺序
// 1. 默认初始化值
// 2. 显示初始化
// 3. 构造器中初始化（赋值）

// 4. 通过“对象.方法” 或 “对象.属性” 赋值；

// 以上操作的先后顺序：
// 1 - 2 - 3 - 4


public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.age);

        User u1 = new User();//3
        u1.setAge(3);// 4
        System.out.print(u1.age);
    }
}

class User{
    String name;
    int age = 1;

    public User(){
        age = a;
    }
    public void setAge(int a){
        age = a;
    }
}
