public class Customer {
    private String name;
    private int age; //基本数据类型
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    
    public Customer(){
        super();
    }
    public Customer(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }
    // 手动实现equals()的重写  
    // 重写原则：比较两个对象的实体内容（即：name和age）是否相同
    // @Override
    // public boolean equals(Object obj) {
    //     if(this == obj){
    //         return true;
    //     }

    //     if(obj instanceof Customer){
    //         Customer cust = (Customer)obj;
    //         //比较两个对象的每个属性是否相同
    //         // if(this.age == cust.age && this.name.equals(cust.name)){
    //         //     return true;
    //         // }else{
    //         //     return false;
    //         // } 或
    //         return this.age == cust.age && this.name.equals(cust.name);
    //     }else{
    //         return false;
    //     }
        
    // }

    @Override
    public String toString() {
    return "Customer[name = "+ name + " ,age = "+ age +"]";
    }

}
