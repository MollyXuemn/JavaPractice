import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * jdk8之前的日期时间的API测试
 * 1. System类中currentTimeMillis()
 * 2. java.util.Date和子类java.sql.Date
 * 3. SimpleDateFormat
 * 4. Calendar
 * 
 * 注意：获取月份时：一月是0， 二月是1.... 十二月是11
 *      获取星期时：周日是1, 周二是2 .... 周六是7
 * 
 */
public class DateTimeTest2 {
   /**
    * SimpleDateFormat的使用：对日期Date类的格式化和解析：
    *   1. 两个操作：
        1.1 格式化： 日期 ---> 字符串
        1.2 解析：格式化的逆过程：字符串 ---> 日期

    2. SimpleDateFormat的实例化
    *
     */ 
    public static void main(String[] args) throws ParseException {
        //实例化SimpleDateFormat：使用默认的构造器

        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化
        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);
        //解析：字符串 --> 日期：
        // String str = "2019-08-09 11:50:29";
        // Date date1 = sdf.parse(str);
        // System.out.println(date1);

        SimpleDateFormat sdf1 = new SimpleDateFormat();
        //解析：要求字符串必须是符合SimpleDateFormat识别的格式
        Date date2 = sdf1.parse("8/13/21, 10:57 AM");
        System.out.println(date2);   
        
    }
    /**
     * 练习：字符串”2020-09-08“ 转换为 Java.sql.Date
     * @throws ParseException
     */
    
    public void tesSimpleDateFormat2() throws ParseException{
        String birth = "2020-09-09";
        
        //实例化SimpleDateFormat：使用默认的构造器

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

        //解析：字符串 --> 日期：
        Date date2 = sdf2.parse(birth);
        // System.out.println(date2);
        java.sql.Date birhtDate = new java.sql.Date(date2.getTime());
        System.out.println(birhtDate);

    }

    /**
     * 练习：三天打鱼两天晒网
     * @throws ParseException
     */
    
//  ----------------------------------------------------------------------
 /**
  * 日历类的使用


  */

    public void testCalendar() {
        //1.实例化
        //方式一：创建其子类(GregorianCalendar)的对象
        //方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());

        //2.常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(Calendar.DAY_OF_YEAR);
        //set()
        calendar.set(Calendar.DAY_OF_MONTH, 22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        //add()

        //getTime():日历类 --> Date


        //setTime() : Date --> 日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
            
    }

}
