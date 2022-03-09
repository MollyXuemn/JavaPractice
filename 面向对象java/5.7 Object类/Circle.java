public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        super();
        radius = 1.0;
        // color = "white";
        // weight = 1.0;
    }
//比较两个圆的半径是否相等，如相等返回true
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj instanceof Circle){
            Circle c = (Circle)obj;
            //比较两个对象的每个属性是否相同
            // if(this.age == cust.age && this.name.equals(cust.name)){
            //     return true;
            // }else{
            //     return false;
            // } 或
            return this.radius == c.radius;
        }
        return false;
        
    }
}
@Override
    public String toString() {
        return "Circle [radius = " + radius + "]";
}