// Exercise 16.18 (Copying and Reversing LinkedLists)
// Creates a LinkedList of 10 characters, then builds a second LinkedList
// that has the same characters but in reverse order.
import java.util.LinkedList;

public class CopyReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Character> original = new LinkedList<>();
        original.add('A');
        original.add('B');
        original.add('C');
        original.add('D');
        original.add('E');
        original.add('F');
        original.add('G');
        original.add('H');
        original.add('I');
        original.add('J');

        System.out.println("Original list: " + original);

        // Build the reversed copy by reading the original from back to front
        LinkedList<Character> reversed = new LinkedList<>();
        for (int i = original.size() - 1; i >= 0; i--) {
            reversed.add(original.get(i));
        }

        System.out.println("Reversed copy: " + reversed);
    }
}
