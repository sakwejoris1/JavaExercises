// Exercise 18.21 (Generating Mazes Randomly)
// Randomly builds a maze of walls ('#') and paths ('.'), with an entry
// point on the left border and an exit point on the right border, then
// tests it with the mazeTraversal method from Exercise 18.20 (MazeTraversal.java).
import java.util.Arrays;
import java.util.Random;

public class MazeGenerator {
    private static final char WALL = '#';
    private static final char PATH = '.';

    // Builds a random maze of the given size. entryOut and exitOut are
    // 2-element arrays ({row, col}) that this method fills in with the
    // entry and exit locations it picked.
    public static char[][] generateMaze(int rows, int columns, int[] entryOut, int[] exitOut) {
        char[][] maze = new char[rows][columns];
        Random random = new Random();

        // Start with every cell as a wall
        for (char[] row : maze) {
            Arrays.fill(row, WALL);
        }

        // Randomly turn interior cells into paths (about half the time)
        for (int row = 1; row < rows - 1; row++) {
            for (int col = 1; col < columns - 1; col++) {
                if (random.nextInt(2) == 0) {
                    maze[row][col] = PATH;
                }
            }
        }

        // Pick an entry point somewhere on the left border, and connect it inward
        int entryRow = 1 + random.nextInt(rows - 2);
        maze[entryRow][0] = PATH;
        maze[entryRow][1] = PATH;

        // Pick an exit point somewhere on the right border, and connect it inward
        int exitRow = 1 + random.nextInt(rows - 2);
        maze[exitRow][columns - 1] = PATH;
        maze[exitRow][columns - 2] = PATH;

        entryOut[0] = entryRow;
        entryOut[1] = 0;
        exitOut[0] = exitRow;
        exitOut[1] = columns - 1;

        return maze;
    }

    public static void main(String[] args) {
        int[] entry = new int[2];
        int[] exit = new int[2];

        char[][] maze = generateMaze(12, 12, entry, exit);

        System.out.println("Randomly generated maze:");
        MazeTraversal.printMaze(maze);
        System.out.println("\nEntry: row " + entry[0] + ", col " + entry[1]);
        System.out.println("Exit:  row " + exit[0] + ", col " + exit[1]);

        boolean solved = MazeTraversal.mazeTraversal(maze, entry[0], entry[1], exit[0], exit[1]);

        System.out.println();
        if (solved) {
            System.out.println("Solved! Path marked with 'x':");
        } else {
            System.out.println("No path exists in this randomly generated maze.");
        }
        MazeTraversal.printMaze(maze);
    }
}
