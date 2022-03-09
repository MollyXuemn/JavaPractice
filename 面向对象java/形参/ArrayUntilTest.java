public class ArrayUntilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{3,2,5,6,0,9,10};
        int max = util.getMax(arr);
        System.out.println("最大值为" + max);
    }
}
