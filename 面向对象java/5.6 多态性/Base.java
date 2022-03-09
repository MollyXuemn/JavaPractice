
//面试题：多态继承和重写

public class Base {
    public static void main(String[] args) {
        Base1 base = new Sub1();//多态继承
        base.add(1,2,4);//调用sub_1

        Sub1 s = (Sub1)base;//向下转型：确定数组优先调用
        s.add(1, 2, 3);
    }
}
class Base1 {
    public void add(int a, int... arr){
        System.out.println("base1");
    }
}
class Sub1 extends Base1{
    public void add(int a, int[] arr){
        System.out.println("sub_1");
    }
    public void add(int a, int b, int c){
        System.out.println("sub_2");
    }
}