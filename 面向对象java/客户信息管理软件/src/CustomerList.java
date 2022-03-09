/**
 * Description: CustomerList为Customer对象的管理模块，
 * 内部用数组管理一组Customer对象，并提供相应的添加、修改、
 * 删除和遍历方法，供CustomerView调用
 */
public class CustomerList {
    private Customer[] customers;//用来保存客户对象的数组
    private int total; //记录保存客户对象的数量

/**
 * 用来初始Customers数组的构造器
 * @param totlaCustomer：指定数组的长度
 */
    public CustomerList(int totlaCustomer){
        customers = new Customer[totlaCustomer];
    }
/**
 * @Description 将指定的客户添加到数组中
 * @param customer
 * @return true:添加成功； false：添加失败
 */
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            return false;
        }
        customers[total++]=customer;
        return true;
    }
/**
 * @Description 修改指定引索位置客户的信息
 * @param index，cust
 * @return true:添加成功； false：添加失败
 */
    public boolean replaceCustomer(int index, Customer cust){
        if(index < 0 || index >= total){
            return false;
        }
        customers[index] = cust;
        return true;
    }
/**
 * 
 * @param index
 * @return true:删除成功； false：删除失败
 */
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            return false;
        }
        //数组中删除元素只能将后面一个元素前移
        for(int i = index; i < total - 1; i++){
            customers[i] = customers[i + 1];
        }
        //最后有数据的元素要置空
        // customers[total - 1] = null;
        // total--;
        // return true;
        customers[--total] = null;
        return true;
    }
    //获取所有的客户信息
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for(int i = 0;i < total;i++){
            custs[i] = customers[i];
        }
        return custs;
    }
    //获取指定位置上的客户信息
    //如果找了元素，则返回；如果没有找到，则返回null
    public Customer getCustomer(int index){
        if(index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }
    //获取存储的客户的数量
    public int getTotal(){
        return total;

    }
}
