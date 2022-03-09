public class InterviewTest {
    @Test 
    public void test1(){
        Object o1 = true ? new Integer(1): new Double(2.0);
        System.out.println(o1);
    }
    @Test 
    public void test2(){
        Object o2;
        if(true)
            o2 = new Integer(1);
        else 
            o2 = new Double(2.0);
        System.out.println(o2);//1 
    }
    public void test3(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);// false
        //Integer内部定义了IntegerCache结构，IntegerCache中定义了
        //Integer[],保存了从-128 ~ 127范围的整数，若果我们使用自动装箱的
        //方式，给Integer赋值的范围在-128~ 127范围内时，可以直接使用
        //数组中的元素，不用再去new了。目的：提高效率
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true

        Integer m = 128;//相当于new 了一个Integer对象
        Integer n = 128;//相当于new 了一个Integer对象
        System.out.println(m == n);//false

    }
}
