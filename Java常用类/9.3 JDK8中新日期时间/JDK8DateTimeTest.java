import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * JDK8引入了java.time.API
 * 
 * 本地日期（LocalDate）、本地时间()....
 * Localime
 * 
 * Instant: 时间线上的一个瞬时点。
 * 
 * 第二代：jdk8 用Calendar类代替一些Date类
 * 
 */

public class JDK8DateTimeTest {
    public static void main(String[] args) {
        //偏移量
        Date date1 = new Date(2020, 9, 10);
        System.out.println(date1);  
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(localDate);
        System.out.println(localTime);

        LocalDateTime ldt1 = LocalDateTime.of(2020, 12, 25, 23, 59, 59);
        System.out.println(ldt1);
        Instant instant = Instant.now();
        System.out.println(instant); 


        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4);
    }
   
    public void test1() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(localDate);
        System.out.println(localTime);

        LocalDateTime ldt1 = LocalDateTime.of(2020, 8, 25, 23, 59, 59);
        System.out.println(ldt1);

        //体现不可变性
        //withXxx():设置相关的属性
        LocalDate lD1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);//不变
        System.out.println(lD1);

        localDateTime.plusMonths(3);
        localDateTime lD2 = localDateTime.plusMonths(3);
        System.out.println(lD2);
    }

    public void test2() {
        //now():获取本初子午线对应的标准版时间
        Instant instant = Instant.now();
        System.out.println(instant); //2021-08-13T06:40:43.771227Z

        //添加时间的偏移量
        OffsetDateTime offsetDateTime= instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        //获取自1970年1月1日0时0分0秒(UTC)对应的毫秒数
        instant.toEpochMilli();

    }

    /**
     * DateTimeFormatter:格式化与解析日期、时间
     * 类似于SimpleDateFormat
     */

     public void test3() {
         //方式一：预定义的标准格式：
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化：日期 --> 字符串

        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(str1);

        //方式二：
        //本地化相关的格式. 如：ofLocalizedDateTime()
        //FormatStyle.LONG / FormatStyle.MEDIUM/ FormatStyle.SHORT:适用于LocalDateTime


        //方式三：自定义的格式。如：ofPattern("yyyy-MM-dd hh:mm:ss")

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4);
     }
}
