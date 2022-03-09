import java.util.Scanner;
public class SameString {
    /**
     * 获取两个字符串中最大相同子串。
     * 提示：将短的那个串进行长度依次递减的子串与较长的串比较
     *      双指针
     * @param str1
     * @param str2
     * @return
     */
    public String getMaxSameString(String str1, String str2) {
       //前提：两个子串中只有一个相同子串, 若有两个相同的子串，请看视频476
        if(str1 != null && str2 != null){
            String maxStr = str1.length() >= str2.length() ? str1 : str2;
            String minStr = str1.length() < str2.length() ? str1 : str2;
            int length = minStr.length();

            for(int i = 0; i < length; i++){
                for(int i = 0, y = length - i;y <= length;x++, y++){
                    String subStr = minStr.subString(x, y);
                    if(maxStr.contains(minStr)){
                        return minStr;
                    }
                }
            }

        return null;
       }
       public static void intro(String name) {
            System.out.println(maxSameString11); 
       }
       public void testGetMaxSameString() {
           String str11 = "abchellodsjajwiodaklj";
           String str22 = "cvhellomolll";
           String maxSameString11 = getMaxSameString(str11, str22);
           System.out.println(maxSameString11); 
       }
    }
}
