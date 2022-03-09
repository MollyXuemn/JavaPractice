import javax.crypto.Cipher;

public class Cylinder extends Circle{
    private double length;
    
    public Cylinder(){
        length = 1.0;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    //返回圆柱的体积
    public double findVolume(){
        // return Math.PI * radius * radius * length; 拿不到父类中的radius
        return  Math.PI * getRadius() * getRadius() * getLength();
        // return findArea() * getLength();
    }

    @Override
    public double findArea(){
        return Math.PI * getRadius() * getRadius() * 2 +
                2 * Math.PI * getRadius() * getRadius();
    }
}
