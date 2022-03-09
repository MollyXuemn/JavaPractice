// 创建一个Customer,名字叫Jane Smith,他又一个账户为1000，余额为2000元，
// 年利率为1.23%；
// 对Jane Smith 操作：
//     存入100元，再取出960元，再取出2000元；
//     打印出Jane Smith 的基本信息：
//         -成功存入 100
//         -成功取出 960
//         -余额不足，取款失败

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Jane", "Smith");
        
        Account acct = new Account(1000, 2000, 0.0123);
        
        c1.setAccount(acct);

        c1.getAccount().deposit(100);
        c1.getAccount().withdraw(960);
        c1.getAccount().withdraw(2000);
 
        System.out.println("Customer[ "+ c1.getFirstName() 
        +"] has a account: id is " + c1.getAccount().getId()
        +", annualInterstRate" + c1.getAccount().getAnnualInterestRate());
    }
}
