// Exercise 18.22 (Mazes of Any Size)
// MazeTraversal.mazeTraversal and MazeGenerator.generateMaze were already
// written generically - they use maze.length and maze[0].length instead
// of hardcoding 12, so they already work for any width and height. This
// program just proves that by generating and solving mazes of different sizes.
public class MazeAnySize {
    public static void main(String[] args) {
        testSize(8, 8);
        testSize(10, 15);
        testSize(20, 12);
    }

    private static void testSize(int rows, int columns) {
        System.out.println("===== Maze size: " + rows + " x " + columns + " =====");

        int[] entry = new int[2];
        int[] exit = new int[2];
        char[][] maze = MazeGenerator.generateMaze(rows, columns, entry, exit);

        MazeTraversal.printMaze(maze);

        boolean solved = MazeTraversal.mazeTraversal(maze, entry[0], entry[1], exit[0], exit[1]);
        System.out.println(solved ? "Solved!" : "No path exists for this random maze.");
        System.out.println();
    }
}
