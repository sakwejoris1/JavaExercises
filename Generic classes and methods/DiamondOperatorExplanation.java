import java.util.ArrayList;

public class DiamondOperatorExplanation {

    // A small stand-in class, just so the example compiles and runs
    static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String toString() {
            return "Employee: " + name;
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> workerList = new ArrayList<>(); // the statement in question

        workerList.add(new Employee("Alice"));
        workerList.add(new Employee("Bob"));

        System.out.println("workerList contains:");
        for (Employee employee : workerList) {
            System.out.println(employee);
        }

    }
}
