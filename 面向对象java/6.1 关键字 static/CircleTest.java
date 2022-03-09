public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
    
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        System.out.println("c1 id:" + c1.getId());
        System.out.println("c2 id:" + c2.getId());
        c3.setRadius(3.5);
        System.out.println("c3 id:" + c3.getRadius());
        System.out.println("the number of the cirble is :" + Circle.getTotal());
    }
    
}


class Circle{
    private double radius;
    private int id;

    public Circle(){
        id = init++;
        total++;
    }
    public Circle(double radius){
        this();
        this.radius = radius;
        // id = init++;
        // total++;
    }
    private static int total;//记录圆的个数 
    private static int init = 1001;//static声明的属性被所有对象共享

    public double findArea(){
        return 3.14 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }
}