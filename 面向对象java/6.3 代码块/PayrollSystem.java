import java.util.Calendar;

public class PayrollSystem {
    public static void main(String[] args) {
        //方式一：
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("输入当月的月份：");
        // int month = scanner.nextInt();
        //方式二：
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH); //获取当前几月份
        System.out.println(month);//一月份：0
        
        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("薛薛",1002, new MyDate(1992, 2, 28), 10000);
        emps[1] = new HourlyEmployee("一一",2001, new MyDate(2003, 5, 6), 50, 240);

        for(int i = 0; i < emps.length; i++){
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            System.out.println("月工资为" + salary);

            if((month + 1) == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐！ 奖励100元");
            }
        }
    }
}
