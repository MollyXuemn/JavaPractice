public class StringAppearTimes {
    /**
     * 获取一个字符串在另一个字符串中出现的次数。
     *  比如：获取”ab“在”abkkcabkabdasab“中出现的次数
     * @param mainStr
     * @param subStr
     * @return
     */
    public int getCount(String mainStr, String subStr) {
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if(mainLength >= subLength){
            //方式一：循环
             while(intdex = mainStr.indexOf(subStr) != -1){
                 count++;
                 mainStr = mainStr.substring(index + subStr.length());

             }
            //方式二：
            // while((index = mainStr.indexOf(subStr,index)) != -1){
            //     count++;
            //     index += subLength;
            // }
            
            // return count;
        }else{
            return 0;
        }
        
        // public void testGetCount() {
        //     String mainStr1 = "abkkcadkabkabfakab";
        //     String subStr1 = "ab";
        //     int count1 = getCount(mainStr1, subStr1);
        //     System.out.println(count1);
        // }
        public static void main(String[] args) {
            String mainStr1 = "abkkcadkabkabfakab";
            String subStr1 = "ab";
            int count1 = getCount(mainStr1, subStr1);
            System.out.println(count1);
        }
        
    }
}
