// import jdk.jfr.Timestamp;
//String类型 ---> 基本数据类型：包装类: 调用包装类的parseXxx()
public class WrapperTest {
    public void test5(){
        String str1 = "123";
        //错误情况: 两个完全不相干的数据类型不能互相转换
        // int num1 = (int)str1;
        // Integer in1 = (Integer)str1;
        //可能会报numberformatexception
        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);
        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
        
    }
    //基本数据类型：包装类 ---> String类型：调用String重载的
    // ValueOf(Xxx xxx)
    @Test
    public void test4(){
        int num1 = 10;
        //方式1：连接运算
        String str1 = num1 + "";
        //方式2：
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);//"12.3"
        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);//12.4
        
    }

    public void method(Object obj){
        int num1 = 10;
        //基本数据类型 --> 包装类的对象
        method(num1);//Object obj = num1;
        //自动装箱：基本数据类型 ---> 包装类
        int num2 = 10;
        Integer in1 = num2;

        boolean b1 = true;
        Boolean b2 = b1; //自动装箱

        //自动拆箱： 包装类---> 基本数据类型
        System.out.println(in1.toString());
        int num3 = in1; //自动拆箱
        System.out.println(num3);
    }
    //包装类 ---> 基本数据类型: 调用包装类的xxxValue()
    @Test 
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);
        Float f1 = new FLoat(12.3);
        float f2 = new floatValue();
        System.out.println(f2 + 1);
    }
}
    //基本数据类型 ---> 包装类：调用包装类的构造器
//     @Test
//     public void test1(){
//         int num1 = 10;
//         Integer in1 = new Integer(num1);
//         System.out.println(in1.toString());
//         Integer in2 = new Integer("123");
//         System.out.println(in2.toString());
//         //报异常
//         Integer in3 = new Integer("123abc");
//         System.out.println(in3.toString());

//         Float f1 = new Float(12.3f);
//         Float f2 = new Float("12.3");
//         System.out.println(f1);
//         System.out.println(f2);

//         Boolean b1 = new Boolean("true");
//         Boolean b2 = new Boolean("TrUe");//boolean忽略大小写
//         System.out.println(b2);
//         Boolean b3 = new Boolean("true123");// false，有数字不行

//         Order order = new Order();
//         System.out.println(order.isMale);//false
//         System.out.println(order.isFemale);//null

//     }
// }
// class Order{
//     boolean isMale;
//     Boolean isFemale;
// }