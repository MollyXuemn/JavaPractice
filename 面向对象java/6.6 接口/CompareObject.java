public interface CompareObject {
    //若返回值是0，代表相等；若为正数，则代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
        
}
