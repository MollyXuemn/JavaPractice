import java.io.FileInputStream;
import java.util.Properties;


public class PropertiesTest {
    //该对象用于处理属性文件，key、value都是字符串类型
    public static void main(String[] args) throws Exception {
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");
        pros.load(fis); //加载流对应的文件

        String name = pros.getProperty("name");
        String password = pros.getProperty("password");//不可以写错，否则就是null

        System.out.println("name = " + name + ", password = " + password);

        fis.close();
    }
}
