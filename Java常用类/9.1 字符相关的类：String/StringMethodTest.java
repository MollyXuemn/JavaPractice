/*
int lenght(): 返回字符串的长度：return value.length
char charAt(int index):返回某索引处的字符 return value[index]
boolean isEmpty(): 判断是否是空字符串：return value.lenght == 0
String toLowerCase():
String toUpperCase():
String trim():返回字符串的副本，忽略前导空白和尾部空白
boolean equals(Object obj):比较字符串的内容是否相同
boolean equalsIgnoreCase(String anotherString): 与equals方法类似，忽略大小写
String concat(String str): 将指定字符串连接到此字符串的结尾，等价于用“+”
int compareTo(String anotherString): 比较俩个字符串的大小，返回正负数值
String substring(int beginIndex): 返回一个新的字符串，他是此字符串的从beginIndex开始截取
String substring(int beginIndex, int endIndex): 返回一个新的字符串，
他是beginIndex开始截取到endIndex(不包含)的一个子字符串

boolean endsWith(String suffix): 测试此字符串是否以指定的后缀结束
boolean startWith(String prefix): 测试此字符串是否以指定的前缀开始
boolean startsWith(String prefix, int offset): 测试此字符串从指定索引开始的子字符串
是否以指定的前缀开始
boolean string.contains(CharSequence s): 是否包含指定的char
int IndexOf(Sting s): 字符串中第一次出现指定字母的索引；
int IndexOf(String s, fromIndex: num): 从指定索引开始向后第一次出现该字符串处的索引
int LastIndexOf(String s):返回指定子字符串最右边出现处的索引，但是反向寻找，正向返回索引值，
若没找到，返回-1;

什么情况下，IndexOf(str)和LastIndexOf(str)返回值相同？
1. 存在唯一的一个str；2.不存在str

*/

public class StringMethodTest {
    public static void main(String[] args) {
        String s1 = "helloworld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));    

        String s3 = " he llo  world   ";
        String s4 = s3.trim();
        System.out.println(s3);//不变
        System.out.println(s4);//去除首尾空格

        //boolean startsWith(String prefix, int offset):
        boolean b3 = s1.startsWith("ll", 2);
        System.out.println(b3);//true
    }
    
}
