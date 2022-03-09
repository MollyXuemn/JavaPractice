/**
 * final : 最终的
 * 
 * 1. final可以用来修饰的结构：类、方法、变量(属性、形参、局部变量)
 * 2. final 用来修饰一个类: 此类不能被其他类所继承。
 *          比如：String类、System类、StringBuffer类
 * 3. final用来修饰方法：表明此方法不可被重写
 *                     比如: Object类中的getClass()
 * 
 * 4. final 用来修饰变量：此时的“变量”就称为一个常量
 *      4.1 final修饰属性：可以考虑赋值的位置有：显示初始化
 *      代码块中初始化、构造器中初始化
 *          int num = 10;
 *          num = num + 5;
 *      4.2 final修饰局部变量：
 *              尤其是使用final修饰形参时，表明形参是一个常量。
 *      当我们调用此方法时，给常量形参一个实参，一旦赋值以后，就只能
 *      在方法体内使用次形参，但不能进行重新赋值。
 * 
 * 
 * static final: 用来修饰属性： 全局常量
 *                  修饰方法：  
 */


public class FinalTest {
    final int WIDTH = 0;
    final int LEFT;
    final int RIGHT;
    // final int DOWN;

    {
        LEFT = 1;
    }

    public FinalTest(){
        RIGHT = 2;    
    }

    public FinalTest(int n){
        RIGHT = n;
    }

    // 构造器中已经定义了加载变量的值了，所以没法再方法中使用
    // public void setDown(int down){
    //     this.DOWN = down;
    // }
    public void doWith(){
        // width = 20;
    }
    public void show() {
        final int num = 10; //常量
        // NUM += 20；
    }

    public void show(final int num) {
        // num = 10; 编译不通过
        //形参是调用的时候才赋值
        System.out.println(num);
        // return ++num;
        return num + 1; //可以，num值没有变
    }
    public static void main(String[] args) {
        FinalTest test = new FinalTest();
        // test.setDown(3);

        test.show(10);
    }
}

final class FinalA{

}

// class B extends FinalA{

// }

class AA{
    public final void show(){
        
    }
}
// class BB {
//     public final void show(){
        
//     }
// }