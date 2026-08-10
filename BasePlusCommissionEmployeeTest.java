public class BasePlusCommissionEmployeeTest {
   public static void main(String[] args) {
      BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

      System.out.printf("%s%n%n", employee);
      System.out.printf("%s: $%,.2f%n%n", "earnings", employee.earnings());

      employee.setBaseSalary(1000);
      System.out.printf("Updated base salary is: $%,.2f%n%n",
         employee.getBaseSalary());
      System.out.printf("new earnings: $%,.2f%n", employee.earnings());
   }
}
