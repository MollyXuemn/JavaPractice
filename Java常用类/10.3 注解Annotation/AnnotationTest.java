import java.lang.annotation.Annotation;
import java.util.ArrayList;

/**
 * 注解的使用：
 * 1. 理解Annotation：
 *    1. JDK5.0新增的功能
 *    2. Annotation 就是代码里的特殊标记
 * 
 * 2. Annotation的使用示例：
 * 示例一：生成文档相关的注解
 * 示例二：在编译时进行格式检查（JDK内置的三个基本注解）
 * 
 * @Override: 限定重写父类方法，只能用于方法
 * @deprecated: 用于表示所修饰的元素(类，方法等)已过时。通常是因为所修饰的结构危险或存在隐患
 * @suppressWarnings: 抑制编译器警告
 * 
 * 示例三：跟踪代码依赖性，实现替代配置文件功能
 * 
 * 
 * 3.如何自定义注解 参照@SupressWarnings定义
 *     1. 注解声明为：@interface 
 *     2. 内部定义成员，通常使用value表示
 *     3. 没有成员定义的Annotation称为标记；包含成员变量的Annotation称为元数据Annotation
 *     4. 可以指定成员的默认值，使用default定义
 *     
 *      如果注解有成员，在使用注解时，需要指明成员的值。
 *      自定义注解必须配上注解的信息处理流程(使用反馈)才有意义
 *      自定义注解通过都会指明两个元注解：Retention、Target     
 * 
 * 4. jdk: 提供4种元注解 
 *      元注解：用于修饰其他Annotation定义
 *          Retention: 指定所修饰的Annotation的生命周期：SOURCE\CLASS\RUNTIME
 *                      只有声明为RUNITIME生命周期的注解，才能通过反射获取。
 *          Target: 用于指定被修饰的Annotation能用于修饰哪些程序元素
 *                  {TPYE Class, FIELD属性, METHOD方法, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE}
 *          Documented: 表示所修饰的注解在被javadoc解析时，保留下来。
 *          Inherited：被她修饰的Annotation 将具有继承性
 * 类比： 元数据的概念： String name = “Tom”;
 * 
 * 5. 通过反射来获取注解信息 --- 到反射时在系统讲解
 * 
 * 前提：要求此注解的元注解Retention中声明的生命周期状态为：RUNTIME
 * 
 * 6. jdk 8中注解的新特性：可重复注解、类型注解
 *      6.1 可重复注解：i. 在MyAnnotation上声明@Repeatable，成员值为MyAnnotations.class
 *                    ii.MyAnnotation的Target和Retention等元注解和MyAnnotations相同
 *      6.2 类型注解：
 *      ElementType.TYPE_PARAMETER  表示注解能写在类型变量的声明语句中（如泛型声明）
 *      ElementTpye.TYPE_USE  表示该注解能写在使用类型的任何语句中
 * 
 * 2. 注解的使用示例
 * 在JavaSE中，注解的使用目的简单，例如标记过时的功能，忽略警告等。
 * 在JavaEE/Android中注解占据了更重要的角色，例如用来配置应用程序的
 * 任何切面，代替JavaEE旧版中所遗留的繁庸
 * 代码和XML配置等
 * 
 * 框架 = 注解 + 反射机制 + 设计模式
 * 
 * 3. 如何自定义注解：参照@SuppressWarnings定义
 * 
 */

 
public class AnnotationTest {
    public static void main(String[] args) {
        // Person p = new Student();
        // p.walk();
        // @SuppressWarnings("unused")
        // int num = 10;
        Class clazz = Student.class;
        Annotation[] annotations = clazz.getAnnotations();
        for(int i = 0; i< annotations.length; i++){
             System.out.println(annotations[i]);
        }

    }

    // @Test
    // public void testGetAnnotation() {
    //     Class clazz = Student.class;
    //     Annotation[] annotations = clazz.getAnnotations();
    //     for(int i = 0; i< annotations.length; i++){
    //          System.out.println(annotations[i]);
    //     }
    // }
}

@MyAnnotation(value = "mmollly")
@MyAnnotation(value = "mhihi")
//jdk8 之前的写法：
//@MyAnnotations({@MyAnnotation(value = "mmollly"), @MyAnnotation(value = "mhihi")})
class Person{

    private String name;
    private int age;
    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void walk() {
        System.out.println("人走路");
    }

    public void eat() {
        System.out.println("人吃饭");
    }
}
interface Info{
    void show();
}
class Student extends Person implements Info{
    @Override
    public void walk() {
        System.out.println("学生走路");
    }

    public void show() {
        System.out.println("学生走路");
    }
}

class Generic<@MyAnnotation T>{
    public void show() throws @MyAnnotation RuntimeException{
        ArrayList<@MyAnnotation String> list = new ArrayList<>();
        int num = (@MyAnnotation int) 10L;
    }
}