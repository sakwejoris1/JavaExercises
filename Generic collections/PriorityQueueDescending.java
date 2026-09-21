// Exercise 16.21 (Changing a PriorityQueue's Sort Order)
// NOTE: Fig. 16.15 was not provided, so this is a self-contained version
// built around the same idea: a PriorityQueue of Doubles normally removes
// the SMALLEST value first (ascending order). This program uses a
// Comparator so it removes the LARGEST value first instead (descending
// order) - meaning 9.8 comes out before 3.2, as the exercise asks.
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDescending {
    public static void main(String[] args) {
        // Comparator.reverseOrder() flips the natural ordering, so the
        // "highest priority" (first one removed) is the largest value.
        PriorityQueue<Double> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.add(3.2);
        queue.add(9.8);
        queue.add(5.4);
        queue.add(0.4);
        queue.add(1.1);
        queue.add(6.3);

        System.out.print("Removing elements from the queue (highest first): ");
        while (!queue.isEmpty()) {
            System.out.printf("%.1f ", queue.poll());
        }
        System.out.println();
    }
}
