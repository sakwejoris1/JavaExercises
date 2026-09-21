// Exercise 16.17 (Inserting Elements in a LinkedList in Sorted Order)
// Generates 25 random integers (0-100), inserts each one into a LinkedList
// so the list stays sorted the whole time, then calculates the sum and
// the average of all the elements.
import java.util.LinkedList;
import java.util.Random;

public class SortedLinkedListInsert {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            int value = random.nextInt(101); // 0 to 100
            insertInOrder(list, value);
        }

        System.out.println("Sorted list of 25 random integers:");
        System.out.println(list);

        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        double average = (double) sum / list.size();

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
    }

    // Inserts "value" into "list" at the correct position to keep it sorted
    private static void insertInOrder(LinkedList<Integer> list, int value) {
        int index = 0;
        while (index < list.size() && list.get(index) <= value) {
            index++;
        }
        list.add(index, value);
    }
}
