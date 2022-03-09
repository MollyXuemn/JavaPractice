// import org.junit.Test;

import java.util.Date;

public class DateTimeTest {

    /*
    java.util.Date类
        |---java.sql.Date类
    1. 两个构造器的使用：
        >构造器一：Date()：创建了一个对应当前时间的Date对象
        >构造器二：创建指定毫秒数的Date对象
    2. 两个方法的使用:
        >toString: 显示当前的年、月、日、时、分、秒
        >getTime():获取当前Date对象对应的毫秒数。（时间戳）

    3. java.sql.Date对应着数据库中的日期类型的变量
        >如何实例化
        >如何将java.util.Date对象转换为java.sql.Date对象
    */
    public static void main(String[] args) {
        //构造器一：Date()：创建了一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());
        
        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1627996598187L);
        System.out.println(date2.toString());

        //创建java.sql.Date对象
        java.sql.Date date3 = new java.sql.Date(2371203122083L);
        System.out.println(date3);// 2045-02-20

        //如何将java.util.Date对象转换为java.sql.Date对象
        //情况一：
        // Date date4 = new java.sql.Date(2371203122083L);
        // java.sql.Date date5 = (java.sql.Date) date4;
        //情况二：
        Date date6 = new Date();
        // java.sql.Date date7 = (java.sql.Date) date6;
        java.sql.Date date7 = new java.sql.Date(date6.getTime());

    }
    public void test2() {
        //构造器一：Date()
        Date date1 = new Date();
        System.out.println(date1.toString());
    }

    // @Test
    public void test1() {
        long time = System.currentTimeMillis();
        //返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
        //成为时间戳：代号，不重复
        System.out.println(time);
    }
}
