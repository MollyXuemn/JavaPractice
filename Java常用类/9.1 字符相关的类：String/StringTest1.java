// import java.util.Arrays;

public class StringTest1 {
    /*
    复习：
    String与基本数据类型、包装类之间的转换；
    String --> 基本数据类型、包装类： parseInt(str1)
     基本数据类型、包装类 --> String：调用String重载的valueOf(xxx)
    */

    public void test1() {
        String str1 = "123";
        //int num = （int）str; 错误
        int num = Integer.parseInt(str1);

        String str2 = String.valueOf(num);//"123"
        String str3 = num + "";

        System.out.println(str1 == str3);//false
    }

    //String与 char[]之间的转换
    //String --> char[]：
    //char[] --> String的构造器
    public void test2() {
        String str1 = "abc123"; //题目反转：内部使其成为：a21cb3
        char [] charArray = str1.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            System.out.println(charArray[i]);
        }     
        char [] arr = new char[] {'h', 'e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);
    }

    /**
     * String 与 byte[]之间的转换
     * 编码：String --> byte[]：调用string的getBytes()
     * 解码：byte[] --> String: 
     * 
     * 编码：字符串 ---> 字节（看的懂 --> 看不懂的二进制数据)
     * 解码：字节 ---> 字符串
     * 
     * 说明：解码时，要求解码使用的字符集与编码时使用的字符集一致，
     * 否则会出现乱码
     */
   
    public void test3() {
        Stirng str1 = "abc123中国";
        byte[] bytes = str1.getBytes();
        System.out.println(Array.toString(bytes));

    }

    public static void main(String[] args) {
        Stirng str1 = "abc123"; //UTF-8
        byte[] bytes = str1.getBytes();//编码
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str1.getBytes("gbk");//使用gbk字符集进行解码
        System.out.println(Arrays.toString(gbks));

        System.out.println("**********");

        String str2 = new String(bytes);//使用默认的字符集，进行解码
        System.out.println(str2);

        String str3 = new String(gbks);
        System.out.println(str3);//出现乱码。原因：编码集和解码集不一致

        String str4 = new String(gbks, "gbk");
        System.out.println(str4);//没有出现乱码。原因：编码集合解码集一致
    } 

}
