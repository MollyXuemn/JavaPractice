/**
 * String 特殊的引用变量
 * String的不可变性：
 */
public class Person {
    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't'}; 

    //这里str是一个新的变量
    //ch数组可以变
    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        Person ex = new Person();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);//good，String不可变
        System.out.println(ex.ch);//best
    }
}

