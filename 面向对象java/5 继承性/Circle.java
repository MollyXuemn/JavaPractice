public class Circle {
    private double radius;
    
    public Circle(){}
    
    public Circle(double radius){
        radius = 1.0;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }

    //return the area
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
