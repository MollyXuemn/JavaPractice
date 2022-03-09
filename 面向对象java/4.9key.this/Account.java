public class Account {
    private int id;
    private double balance;//余额
    private double annualInterestRate;
    public Account(int id, double balance, double annualInterestRate){
         this.id = id;
         this.balance = balance;
         this.annualInterestRate = annualInterestRate;
    }
    
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    // 在取款的方法withdraw中，需要判断用户余额是否能够满足提款数额的需求，如果不能，应该给出提示。
    public void withdraw(double amount){//取钱
        if(this.balance < amount){
            System.out.println("余额不足哦, 取款失败！");
            return;     
            }
            balance -= amount;
            System.out.println("成功取款：" + amount);
        }
    
    public void deposit(double amount){//存钱
        if(amount > 0){
            balance += amount;
            System.out.println("成功存入: " + amount);
        }
        
    }
}
