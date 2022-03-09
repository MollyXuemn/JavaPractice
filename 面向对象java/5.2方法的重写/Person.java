//定义： 在子类中可以根据需要对从父类中继承来的方法进行改造，
// 也称为方法的重置、覆盖。在程序执行时，子类的方法将覆盖父类的方法。

// 要求：
// 1. 子类重写的方法必须和父类被重写的方法具有相同的方法名称、参数列表
// 2. 子类重写的方法的返回值类型不能大于父类被重写方法的返回值类型
// 3. 子类重写的方法使用的访问权限不能小于父类被重写的方法的访问权限
//    >子类不能重写
   
public class Person {
   String name;
   int age;

   public Person(){

   }
   public Person(String name, int age, char gender){
       this.name = name;
       this.age = age;
   }

   public void eat(){
       System.out.println("吃饭");
   }

   public void walk(int distance){
       System.out.println("走路,走的距离是：" + distance +"公里");
       work();
   }

   private void work(){
       System.out.println("我每天都在工作");
   }

   public String info(int distance){
      return null;
  }

  public double info1(){
     return null;
  }

}

