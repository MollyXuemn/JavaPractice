// import javax.management.RuntimeErrorException;

/**
 * 定义一个CC类，继承Circle类并且实现CO接口；
 * 在CC类中给出接口方法compareTo的实现体，用来比较两个圆的半径大小
 * 
 * 
 */

public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle(double radius){
        super(radius);
    }
    
    @Override
    public int compareTo(Object o){
        if(this == o){
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;
            //错误的：
            // return (int)(this.getRadius() - c.getRadius());
            if(this.getRadius() > c.getRadius()){
                return 1;
            }else if(this.getRadius() < c.getRadius()){
                return -1;
            }else{
                return 0;
            }
            //当Circle中属性radius声明为Double类型时，可以调用包装类的方法
            //return this.getRadius().compareTo(c.getRadius());
        }else{
            // return 0;
            throw new RuntimeException("传入的数据不匹配");

        }
    }
}
