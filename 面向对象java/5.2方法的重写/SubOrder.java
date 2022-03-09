public class SubOrder extends Order {
    orderProtected = 1;
    orderPublic  = 2;

    methodProtected();
    methodPublic();

    //不同包的子类中，不能掉用Order类中声明为private和缺省权限的属性、方法

    
}
