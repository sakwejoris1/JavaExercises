public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob", "Blue", 3000.00);
        Employee employee2 = new Employee("Sue", "Green", 4000.00);

        System.out.printf("%s %s yearly salary: $%.2f%n",
            employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12);
        System.out.printf("%s %s yearly salary: $%.2f%n%n",
            employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12);

        employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.10);
        employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.10);

        System.out.println("After 10% raise:");
        System.out.printf("%s %s yearly salary: $%.2f%n",
            employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12);
        System.out.printf("%s %s yearly salary: $%.2f%n",
            employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12);
    }
}
