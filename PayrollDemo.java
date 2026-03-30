public class PayrollDemo
{
    public static void main(String[] args)
    {
        Employee worker = new Employee("John", 50000);
        Manager boss = new Manager("Sarah", 70000, 10000);

        System.out.println("Employee: " + worker.getName());
        System.out.println("Annual income: $" + worker.getAnnualIncome());

        System.out.println();

        System.out.println("Manager: " + boss.getName());
        System.out.println("Annual income: $" + boss.getAnnualIncome());
    }
}
