/**
 * 定义三个重载方法max()
 * 第一个方法求两个int值中的最大值
 * 第二个方法求两个double中的最大值
 * 第三个方法求三个double中的最大值
 * 分别调用三个方法
 */


public class OverloadExer {
    public static void main(String[] args) {
        OverloadExer d = new OverloadExer();
        double m = d.max(-2.222,2.9,45.0);
        System.out.println(m);
    }

    public void mOL(int i){
        System.out.println(i * i);
    }
    public int max(int i, int j){
        return (i>j)? i :j;
    }
    public double max(double d1, double d2){
        return (d1 > d2)? d1 : d2;
    }
    public double max(double d1, double d2, double d3){
        double max = (d1 > d2)? d1 : d2;
        return (max > d3)? max : d3;
    }
}
