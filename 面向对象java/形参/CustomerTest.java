/**  类中方法的声明和使用：
方法：描述类的功能。
比如：Math类：sqrt()\Random()\...   
    Scanner类：nextXxx()...
    Arrays类：sort()\binarySearch()\toString()\equals()\...
1.举例：
public void eat(){} (void即没有返回值)；
public void sleep(int hour){
public String getName(){
public String getNation(String nation){(String即返回string类型的字符串)；
 2. 方法的声明：权限修饰符 返回值类型 方法名字（形参列表){
        方法体；
     }
     注意：static、final、abstract来修饰的方法，后面再讲。
 3. 说明：
        3.1 关于权限修饰符：默认方法的都是使用：public
        Java规定的4种...：private、public、缺省、protected
        3.2 返回值类型：有返回值 vs 没有返回值
            3.2.1如果方法有返回值，则必须在方法声明时，指定返回值的类型。同时，方法中，需要用return关键字来返回指定类型的变量或常量：“return 数据”
            elif方法没有返回值，则方法声明时，用void来表示，没有返回值的方法中就不用return。但是，如果使用的话，只能“return”，表示结束此方法的意思。
            3.2.2我们定义的方法该不该有返回值？
                1.题目要求
                2.凭经验
        3.3 方法名：属于标识符，遵循表示符的规则和规范，“见名知意”
        3.4 形参列表：方法可以声明0个，1个或多个形参。
            3.4.1 格式：数据类型1 形参1，数据类型2 形参2，...
            3.4.2 我们定义形参时 ，该不该定义形参？
                1.题目要求
                2.凭经验，具体问题具体分析  
        3.5 方法体：方法功能的体现。
 4. return关键字使用：
            1.使用范围：使用在方法中
            2.作用： i. 结束方法
                    ii. 针对有返回值类型的方法，’return 数据‘ 方法返回所要的数据。
                    iii. 注意：return关键字后面不可以声明执行语句。
 5. 方法的使用中，可以调用当前类的属性或方法（别人/自己(递归)）
        特殊的：方法A中又调用了方法A：递归方法
        方法中，不可以定义方法。
注：
1. 面向对象思想编程内容的三条主线：
    1. 类及成员：属性、方法、构造器；代码块，内部类
    2. 面向对象3大特征：封装、继承、多态
    3. 
*/
public class CustomerTest {
    public static void main(String[] args){
        //声明Customer类型的数组
        Customer cust1 = new Customer();
        cust1.eat();

        cust1.sleep(8);
    }
}
//客户类
class Customer { 
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭");
        return;  
    }

    public void sleep(int hour){
        System.out.println("休息了" + hour + "个小时"); 
        eat();
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        String info = "我的国籍是"+ nation;
        return info;
    }
}
