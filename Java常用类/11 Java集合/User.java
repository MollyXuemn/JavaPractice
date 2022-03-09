import java.util.Objects;

public class User implements compareTo{
    private String name;
    private int age;
    
    public User(){

    }
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("User equals() ....");
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        User user = (User)o;

        if(age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;

    }

    @Override
    public int hasCode() {//return name.hashCode() + age；
        int res = name != null ? name.hashCode() : 0;
        res = 31 + res + age;
        return res;
    }

    //按照姓名从大到小排列，年龄从小到大排列
    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User user = (User)o;
            // return -this.name.compareTo(user.name);
            int compare = -this.name.compareTo(user.name);
            if(compare != 0){
                return compare;
            }else{
                return Integer.compare(this.age, this.age);
            }

        }else{
            throw new RuntimeException("输入的类型不匹配");
        }
    }

}
