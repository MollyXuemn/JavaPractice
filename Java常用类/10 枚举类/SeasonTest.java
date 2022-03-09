/**
 * 一、枚举类的使用
 * 1、枚举类的理解：类的对象只有有限个，确定的
 * 2、当需要定义一组常量时候，强烈建议使用枚举类
 * 3、如果枚举类中只有一个对象，则可以作为单例模式的实现方式
 * 
 * 二、如何定义枚举类
 * 方式一：jdk5.0之前，自定义枚举类
 * 方式二：jdk5.0时，使用enum关键字定义
 * 
 * 
 * 三、Enum中的常用方法：
 * 
 * values():
 * valueOf(String str):
 * toString(): 返回当前枚举对象常量的名称
 * 
 * 四、使用enum关键字定义的枚举类实现接口的情况
 *  情况一：实现接口，在enum类中实现抽象方法
 *  情况二：让枚举类的对象分别实现接口中的抽象方法
 */




public class SeasonTest {
   
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }
}


//自定义枚举类
class Season{
    //1. 声明Season对象的属性: private final 修饰
    private final String seasonName;
    private final String seasonDesc;
    
    //2. 私有化类的构造器
    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //3. 提供当前枚举类的多个对象：public static final的
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "冰天雪地");


    //4. 其他诉求：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDesc() {
        return seasonDesc;
    }
    //4. 其他诉求：提供toString()
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}