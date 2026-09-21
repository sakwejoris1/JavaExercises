// Exercise 16.13 (Duplicate Elimination)
// Reads first names from the user, stores them in a Set (which automatically
// throws away duplicates), then lets the user search for a name.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElimination {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first names one at a time. Type 'done' to stop.");
        String name = input.nextLine();
        while (!name.equalsIgnoreCase("done")) {
            boolean added = names.add(name);
            if (!added) {
                System.out.println("(\"" + name + "\" is a duplicate - not added again.)");
            }
            name = input.nextLine();
        }

        System.out.println("\nUnique names collected: " + names);

        // Let the user search for a name
        System.out.println("\nEnter a name to search for. Type 'quit' to stop.");
        String search = input.nextLine();
        while (!search.equalsIgnoreCase("quit")) {
            if (names.contains(search)) {
                System.out.println("\"" + search + "\" was found.");
            } else {
                System.out.println("\"" + search + "\" was NOT found.");
            }
            search = input.nextLine();
        }
    }
}
