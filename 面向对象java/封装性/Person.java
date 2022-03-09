public class Person {
    //private static int NUM_OF_PERSON;
    private int age;
    private String name;


    public Person(){
        age = 18;// this(0,"") is the same 
    }
    public Person(String n, int a ){
        name = n;
        age = a;
        //NUM_OF_PERSON ++;
    }

    public void setAge(int a) {
        if( a < 0 || a > 130){
            System.out.println("传入非法数据");
        }else{
            age = a;
        }
    }
    
    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}

