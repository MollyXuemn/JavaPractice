import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * jdk 5.0 新增了foreach循环，用于遍历集合、数组
 * 
 * 
 * 
 */

public class forTest {
   public static void main(String[] args) {
        Collection coll = new ArrayList<>();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom")); //自动装箱
        coll.add(false);


        //for(集合中元素的类型 局部变量： 集合对象)
        //内部任然掉用了迭代器
        for(Object obj : coll){
            System.out.println(obj);
        }

        int[] arr = new int[]{1,2,3,4,5,6};
        //for(数组元素的类型 局部变量： 集合对象)
        for(int i: arr){
            System.out.println(i);
        }

        //练习题
        String[] arr1 = new String[]{"MM", "AA", "MM"};
        //普通for赋值
        // for(int i = 0; i < arr.length; i++){
        //     arr1[i] = "GG";
        // }
        //方式二：增强for循环
        for(String s: arr1){
            s = "GG"; //arr1[i]赋值给s
        }

        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
   } 
}
