//1.问题的引入：
//     当我们创建一个类的对象以后，我们可以通过”对象.属性“ 的方式对对象的属性进行赋值。
//     这里对象的属性要受到属性的数据类型和储存范围的制约。除此之外，没有其他制约条件。
//     但是，在实际问题中，我们往往需要给属性赋值添加额外的限制条件。这个条件就不能再
//     属性声明时体现，我们只能通过方法进行限制条件的添加。（比如setLegs())
//     同时，我们需要避免用户再时候用”对象.属性“的方式对属性进行赋值。则需要将属性声明
//     为私有的（private) --> 此时针对属性就体现了封装性

// 二、封装性的体现：
// 我们将类的属性XXX私有化（private），同时，提供公共的（public）方法来获取（getXxx)和设置（setXxx）.
    // 拓展：封装性体现：1. 如上
                 //   2. 不对外暴露的私有的方法
                 //   3. 单例模式... 
// 三、封装性的体现，需要权限修饰符来配合。
    // 1. Java规定的4种权限（从小到大排列）: public, protected, 缺省，private
    // 2. 4种权限可以用来修饰类的内部结构：属性、方法、构造器、内部类
    // 3. 具体的，4中权限都可以用来修饰的内部结构：属性、方法、构造器、内部类
    //           修饰类的话，只能用：缺省，public
// 总结封装性：Java提供了4种权限修饰符来修饰类及类的内部结构，体现了类及
// 类内部结构在被调用时的可见性的大小。

public class AnimalTest {
    public static void main(String[] args){
        Animal a = new Animal();
        a.name = "大黄";
        a.age = 2;
        // a.legs = 4;
        a.show();
        
        // a.legs = -6;
        a.setLegs(6);
        a.show();
        System.out.println(x);

    }
}

class Animal {
    String name;
    int age;
    private int legs;
    //对属性的设置
    public void setLegs(int l){
        if(l >= 0 && l % 2 == 0){
            legs = 1;
        }else{
            legs = 0;
        }
    }
    //对属性的获取
    public int getLegs(){
        return legs;
    }

    public void eat(){
        System.out.println("eat something");
    }
    public void show(){
        System.out.println("name = "+name +",age = "+age + ",show the legs " +legs);
    }
}