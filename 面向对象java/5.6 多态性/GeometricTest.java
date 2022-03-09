
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle(2.3, "blue", 2.5);
        test.displayGeometricObject(c1);
        Circle c2 = new Circle(3.3, "White", 1.5);
        test.displayGeometricObject(c2);

        boolean isEquals = test.equalsArea(c1, c2);
        System.out.println("c1和c2的面积是否相等" + isEquals);
        MyRectangle rect = new MyRectangle(2.0, 3.0, "Yellow", 4.5);
        test.displayGeometricObject(rect);
    }
    public void displayGeometricObject(GeometricObject o){
        //GeometricObject o = new Circle（...）;多态
        System.out.println("面积为： " + o.findArea());
    }

    public boolean equalsArea(GeometricObject o1, GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }
}
