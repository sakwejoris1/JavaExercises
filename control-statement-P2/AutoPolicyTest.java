public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy("A100", "Toyota Camry", "NY");
        System.out.println("Policy1 state: " + policy1.getState());

        AutoPolicy policy2 = new AutoPolicy("A101", "Honda Civic", "TX");
        System.out.println("Policy2 state: " + policy2.getState());

        policy1.setState("ZZ");
        policy1.setState("MA");
        System.out.println("Policy1 state after update: " + policy1.getState());
    }
}
