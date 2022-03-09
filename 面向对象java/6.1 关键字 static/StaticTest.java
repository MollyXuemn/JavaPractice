/**
 * static 关键字的使用
 * 
 * 1. static：静态的
 * 2. static：可以用来修饰：属性、方法、代码块、内部类
 * 
 * 3. 使用static修饰属性：静态变量（或类变量）
 *      3.1 属性：按是否使用static修饰，分为：静态属性 vs 非静态属性（实例变量）
 *       实例变量：我们创建了类的多个对象，每个对象都对独立的拥有一套类中的非静态属性。
 *                当修改其中的一个对象的非静态属性时，不会导致其他对象中同样的属性值修改。
 *       静态变量：我们创建了类的多个对象，多个对象共享一个静态变量。当通过某个对象修改静态
 *               变量时，会导致其他对象调用此静态变量时，是修改过的
 *      3.2 static修饰属性的其他说明：
 *          1. 静态变量随着类的加载而加载.可以通过“类、静态变量”的方式进行调用
 *          2. 静态变量的加载要早于对象的创建    
 *          3. 由于类只会加载一次，则静态变量在内存中也只会存在一份：存在方法区的静态域中。
 *          4.  类变量 实例变量
 *          类   Yes     no     //Chinese.name = "张吉利";不行
 *          对象  Yes    Yes
 *      3.3 静态属性举例：System.out.println("");Math.PI;
 * 
 * 4. 使用static修饰方法：
 *      1. 随着类的加载而加载，可以通过"类.静态方法"的方式进行调用
 *      2.   静态方法 非静态方法
*          类   Yes     no     //Chinese.name = "张吉利";不行
*         对象  Yes    Yes
        3. 在静态的方法中，只能调用静态的方法或属性
        非静态方法中，即可调用非静态的方法或属性，也可以调用静态的方法或属性
    5. statics
        5.1 在静态方法内，不能使用this、super关键字
        5.2 关于静态属性和静态方法的使用，大家都从生命周期的角度去理解
    
    6.  开发中，如何确定一个属性是否要声明为static？
        > 多个对象都共享的属性，不会随着对象的不同而改变
        > 类中的常量也常常声明为static：PI
        开发中，如何确定一个方法是否要声明为static？
        > 操作静态属性的方法，通常设置为static
        > 工具类中的方法，习惯上声明为static的。比如：Math, Array,Collections
        */


public class StaticTest {
    public static void main(String[] args) {
        Chinese.nation = "中国";
        
        Chinese c1 = new Chinese();
        c1.name = "Molly";
        c1.age = 26;

        // c1.nation = "CHN";

        Chinese c2 = new Chinese();
        c2.name = "英子";
        c2.age = 30;
        
        // c2.nation = "Japan";

        // System.out.println(c1.nation);
        c1.eat();
        Chinese.show();
    }
}

//中国人
class Chinese{
    String name;
    int age;
    static String nation;

    public void eat(){
        System.out.println("apple");
        walk();
        System.out.println(nation + "fr");
    }
    public static void show(){
        System.out.println("we can eat together");
        //不能调用非静态结构
        // eat(); 
        //可以调用静态结构
        System.out.println(nation);
        walk();
    }

    public static void walk() {
        System.out.println("走路咯");
    }
}