public class StringDemo {

    /**
     * 将一个字符串进行反转。将字符串中指定的部分进行反转。
     * 方式一：转换为char[]
     */
    public String reverse(String str, int startIndex, int endIndex) {
        if(str != null){
            char [] arr = str.toCharArray();
            for(int x = startIndex, y = endIndex; x < y; x++, y--){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }

            return new String(arr);
        }
        return null;
    }

    //方式二: 使用String的拼接
    public String reverse1(String str, int startIndex, int endIndex) {
        if(str != null){
            String reverseStr = str.substring(0, startIndex);
            for(int i = endIndex; i >= startIndex; i--){
                reverseStr += str.charAt(i);
            }
            //第三部分
            reverseStr += str.substring(endIndex + 1);
            return reverseStr;
        }
        return null;
    }

    //方式三：使用StringBuffer或StringBuilder
    public String reverse2(String str, int startIndex, int endIndex) {
        if(str != null){
            StringBuilder builder = new StringBuilder(str.length());
            //第一部分：
            builder.append(str.substring(0, startIndex));
            for(int i = endIndex; i >= startIndex; i--){
                builder.append(str.charAt(i));
            }
            //第三部分：
            builder.append(str.substring(endIndex+1));
            return builder.toString();
        }
        return null;
    }
    public static void main(String[] args) {
        String str = "abcdefg";
        String reverse = reverse2(str, 2, 5);
        System.out.println(reverse);
    }
    // public void testReverse() {
    //     String str = "abcdefg";
    //     String reverse = reverse(str, 2, 5);
    //     System.out.println(reverse);
    // }
    
}
