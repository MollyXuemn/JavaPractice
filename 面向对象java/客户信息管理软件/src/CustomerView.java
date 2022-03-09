/**
 * CustomerView为主模块，负责菜单的显示和处理用户的操作
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);
    //显示《客户信息管理软件》页面的方法
    public void enterMainMenu(){
        boolean isFlag = true;
        while(isFlag){
            System.out.println("\n------客户信息管理软件------\n");
            System.out.println("         1.添加客户");
            System.out.println("         2.修改客户");
            System.out.println("         3.删除客户");
            System.out.println("         4.退   出\n");
            System.out.println("         请选择（1-5）： ");
            char menu = CMUtility().readMenuSelection();
            switch(menu){
                case '1':
                    addNewCustomer();
                case '2':
                    modifyCustomer();
                case '3':
                    deleteCustomer();
                case '4':
                    listAllCustomer();
                case '5':
                    System.out.println("确认是否退出（Y/N）：");
                    char isExit = CMUtility.readConfirmSelection();
                    if(isExit == "Y"){
                        isFlag = false;
                    } 
            }
            // isFlag = false;
        }
    }
    private void addNewCustomer(){
        System.out.println("添加用户的操作");
        System.out.println("姓名：");
        String name = CMUtility.readString(10);
        System.out.println("性别：");
        char gender =  CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        
    }
    private void modifyCustomer(){
        System.out.println("修改客户的操作");
    }

    private void deleteCustomer(){
        System.out.println("删除客户的操作");
    }
    private void listAllCustomer(){
        System.out.println("显示客户列表的操作");
    }

    public static void main(String[] args) {
        CustomerView view= new CustomerView();
        view.enterMainMenu();
    }
}
