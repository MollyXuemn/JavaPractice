public interface CompareA {
    //静态方法
    public static void method1() {
        System.out.println("compareA: 上海");
        
    }
    //默认方法
    public default void method2() {
        System.out.println("compareA: 南京");
    }
    default void method3() {
        System.out.println("compareA: xasd");
    }
}
