public class RecursionTest {
    public static void main(String[] args){
        //计算1-100之间所有自然数的和
        //方法一：
        int sum = 0;
        for(int i =0; i <= 100;i++){
            sum += i;
        }
        System.out.println(sum);
        //方法二：
        RecursionTest test = new RecursionTest();
        int sum1 = test.getSum(100);
        System.out.println(sum1);
        System.out.println("***********");
        int value = test.f(10);
        System.out.println(value);
    }
    
    public int getSum(int n){
        if(n == 1){
            return 1;
        }else{
            return n + getSum(n - 1);
        }
    }
    //例3 递归：一个方法体内调用自身
    //已知 f(0) = 1, f(1) = 4, f(n+2) = 2f(n+1) + f(n)
    public int f(int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else{
            // return f(n+2) - 2 * f(n+1);
            return 2 * f(n - 1) + f(n - 2);
        }
    }
    //例4 Fibonacci数列的第n个值 1 1 2 3 5 8 13 21 55
    //同上题一个数等于前两个数之和
    //例5 汉诺塔问题； 例6 快排
    
}
