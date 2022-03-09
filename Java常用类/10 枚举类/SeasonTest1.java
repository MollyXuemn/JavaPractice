/***
 * 
 * 使用enum关键字定义枚举类
 * 说明：定义的枚举类默认继承于java.lang.Enum类
 * 
 */

public class SeasonTest1 {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        System.out.println(summer);

        // System.out.println(Season.class.getSuperclass());
        
        //values():
        Season[] values = Season.values();
        for(int i =0; i< values.length; i++){
            System.out.println(values[i]);
        }
        Thread.State[] values1 = Thread.State.values();
        for(int i =0; i< values1.length; i++){
            System.out.println(values1[i]);
        }

        //valueOf(String objName): 返回枚举类中对象名是objName的对象。
        //若没有objName枚举的对象，则抛出异常：IllegalArgumentException
        //Season1 winter = Season1.valueOf("Winter");
        Season winter = Season.valueOf("WINTER");
        System.out.println(winter);

        winter.show();
        
    }
}
//使用enum关键字定义的枚举类实现接口
interface Info{
    void show();
}

//自定义枚举类
enum Season implements Info{
    //3. 提供当前枚举类的多个对象,多个对象间用“，”隔开，末尾对象“；”结束
    SPRING("春天", "春暖花开"){
        @Override
        public void show() {
            //情况二：让枚举类的对象分别实现接口中的抽象方法
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("夏天留下小秘密");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天的宁夏");
        }
    },
    WINTER("冬天", "冰天雪地"){
        @Override
        public void show() {
            System.out.println("冬天雪花飘飘");
        }
    };
    
    
    //1. 声明Season对象的属性: private final 修饰
    private final String seasonName;
    private final String seasonDesc;
    
    //2. 私有化类的构造器
    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }


    //4. 其他诉求：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDesc() {
        return seasonDesc;
    }
    //4. 其他诉求：提供toString()
    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return "Season{" +
    //             "seasonName='" + seasonName + '\'' +
    //             ", seasonDesc='" + seasonDesc + '\'' +
    //             '}';
    // }

    //情况一：实现接口，在enum类中实现抽象方法
    // @Override
    // public void show() {
    //     System.out.println("这是一个季节");
    // }
}