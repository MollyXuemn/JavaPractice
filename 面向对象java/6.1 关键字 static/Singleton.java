/**
 * 单例模式：
 * 1. 采取一定的方法保证在整个软件体系中，对某个类只能存在一个对象实例；
 * 2. 如何实现？
 *  饿汉式 vs 懒汉式
 * 3. 区分饿汉式 和 懒汉式
 *      饿汉式：好处：饿汉式是线程安全的；
 *             坏处：对象加载时间过长；
 *      懒汉式：好处，延迟对象的创建；
 *             坏处：线程不安全 --> 到多线程内容时，再修改
 * 
 * 4. 应用场景：
 *  - 网站计数器
 *  - 应用程序的日志应用
 *  - 数据库连接池
 *  - 读取配置文件的类
 *  - Application也是单例的典型应用
 *  - Task Manager
 *  
 */
public class Singleton {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);//true
    }
}
//饿汉式
class Bank{
    private Bank(){
    
    }
    //2. 内部创建类的对象
    //4. 要求此对象也必须声明为静态
    private static Bank instance = new Bank();
    //3.提供静态方法，返回类的对象
    public static Bank getInstance() {
        return instance;
    } 

}