### 面试题：
== 和 equals的区别： 见 EqualsTest.java
### 重写equals的方法：
- 对称性 x.equals(y) return true, 那么 y.equals(x)也应该返回是true；
- 自反性 x.equals(x) 必须返回是“true”，而且y.equals（x)
- 传递性 如果x.equals(x) 必须返回是“true”，而且y.equals（x) 返回的是 true，那么 z.equals(z) 也必须返回是“true”
- 一致性 如果x.equals(x) 必须返回是“true”，只要x和y内容一直不变，不管重复多少次x.equals(y),返回的都是 true
- 任何情况下，x.equals(null),永远返回的都是‘false’: null.equals(x); x.equals(和x不同类型的对象)永远返回是“false"

### array也是Object类的子类出现，可以调用Object中的方法，arr.getClass();