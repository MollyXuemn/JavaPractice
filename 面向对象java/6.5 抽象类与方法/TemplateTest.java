public class TemplateTest {
    public static void main(String[] args) {
        SubTemplate t = new SubTemplate();

        t.spendTime();//调用子类的功能
    }
}
abstract class Template{

    //计算某段代码执行所需花费的时间
    public void spendTime() {
        long start = System.currentTimeMillis();

        this.code();//不确定的部分、易变的部分, 像个钩子一样，
        //具体被哪个子类重写，就执行哪个子类的实现代码

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));

    }

    public abstract void code();

}

class SubTemplate extends Template{

    @Override
    public void code() {
        for(int i = 2; i <= 100; i++){
            boolean isFlag =true;
            for(int j = 2;j <= Math.sqrt(i);j++){
                if(i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }

        }
    }

}