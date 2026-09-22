// Exercise 16.12
// NOTE: Fig. 16.3 was not provided, so this is a self-contained program built
// around the same idea the exercise is testing: instead of creating an empty
// LinkedList and adding each element in a loop, you can build the list in
// ONE line using Arrays.asList(...) together with the LinkedList constructor
// that accepts a Collection.
//
// The "long way" (like the original lines 16-25 probably looked) is shown
// commented out below the concise version, so you can compare them.
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConciseLinkedList {
    public static void main(String[] args) {
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};

        // ----- Concise version (what this exercise asks for) -----
        List<String> list = new LinkedList<String>(Arrays.asList(colors));

        // ----- The longer way this replaces would have looked like: -----
        // List<String> list = new LinkedList<String>();
        // for (String color : colors) {
        //     list.add(color);
        // }

        System.out.println("List built with asList + LinkedList(Collection):");
        System.out.println(list);
    }
}
