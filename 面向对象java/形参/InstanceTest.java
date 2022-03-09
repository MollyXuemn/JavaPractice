/**
 * I.万事万物接对象
 *  1.在Java语言中，我们都将功能、结构等封装到类中，通过类的实例化，来调用具体的功能结构
 *      >Scanner, String等
 *      >文件：File
 *  2. 涉及到Java语言与前端Html、后端数据库交互时，前后端的结构在Java层面交互时，都体现为类、对象
    II. 内存解析的说明：
        引用类型的变量：只可能存储两类值：null 或地址值（含变量的类型）
    III.匿名对象的使用
        1. 理解：我们创建对象，没有显式的赋给一个变量名。即为匿名对象
        2. 特征：匿名对象只能调用一次
        3，使用：如下

 */

public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);
        p.sendEmail();
        p.playGames();

        // //匿名对象
        // new Phone().sendEmail();
        // new Phone().playGames();
        new Phone().price  = 1999;//赋值与下面的showprice无关
        new Phone().showPrice();//0.0
    }     
}
class Phone{
    int number;
    double price;
    
    public void sendEmail(){
        System.out.println("send Emails");
    }
    public void playGames(){
        System.out.println("PLAY Games");
    }
    public void showPrice(){
        System.out.println("price" + price);
    }
}
