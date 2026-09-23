// Exercise 18.20 (Maze Traversal Using Recursive Backtracking)
// Walks through the maze from Fig. 18.22, trying down, right, up, then
// left at each step. Marks the path with 'x'. If a path leads to a dead
// end, it's re-marked with '0' so only the real solution path is shown
// with x's at the end (this is recursive backtracking).
//
// NOTE: the exercise asks to display the maze after every single move so
// you can watch it being solved. To keep the output readable in a plain
// console program, this version only prints the maze before and after
// solving; the backtracking algorithm itself works exactly as described.
public class MazeTraversal {
    private static final char WALL = '#';
    private static final char PATH = '.';
    private static final char VISITED = 'x';
    private static final char DEAD_END = '0';

    // Tries to walk from (row, col) to the exit. Returns true if a path
    // to the exit is found.
    public static boolean mazeTraversal(char[][] maze, int row, int col, int exitRow, int exitCol) {
        // Out of bounds check
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length) {
            return false;
        }
        // Only a plain, unvisited path cell can be walked on
        if (maze[row][col] != PATH) {
            return false;
        }

        maze[row][col] = VISITED; // mark this cell as part of the current path

        if (row == exitRow && col == exitCol) {
            return true; // reached the exit
        }

        // Try each direction: down, right, up, left
        if (mazeTraversal(maze, row + 1, col, exitRow, exitCol)) return true;
        if (mazeTraversal(maze, row, col + 1, exitRow, exitCol)) return true;
        if (mazeTraversal(maze, row - 1, col, exitRow, exitCol)) return true;
        if (mazeTraversal(maze, row, col - 1, exitRow, exitCol)) return true;

        // None of the 4 directions worked from here - dead end, back up
        maze[row][col] = DEAD_END;
        return false;
    }

    public static void printMaze(char[][] maze) {
        for (char[] row : maze) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // The maze from Fig. 18.22. Entry point is (2,0) - the only opening
        // on the left border. Exit is (4,11) - the only opening on the right border.
        char[][] maze = {
            {'#','#','#','#','#','#','#','#','#','#','#','#'},
            {'#','.','.','.','#','.','.','.','.','.','.','#'},
            {'.','.','#','.','#','.','#','#','#','#','.','#'},
            {'#','#','#','.','#','.','.','.','.','#','.','#'},
            {'#','.','.','.','.','#','#','#','.','#','.','.'},
            {'#','#','#','#','.','#','.','#','.','#','.','#'},
            {'#','.','.','#','.','#','.','#','.','#','.','#'},
            {'#','#','.','#','.','#','.','#','.','#','.','#'},
            {'#','.','.','.','.','.','.','.','.','#','.','#'},
            {'#','#','#','#','#','#','.','#','#','#','.','#'},
            {'#','.','.','.','.','.','.','#','.','.','.','#'},
            {'#','#','#','#','#','#','#','#','#','#','#','#'}
        };

        System.out.println("Starting maze:");
        printMaze(maze);

        boolean solved = mazeTraversal(maze, 2, 0, 4, 11);

        System.out.println();
        if (solved) {
            System.out.println("Solved! Path marked with 'x' (dead ends marked with '0'):");
        } else {
            System.out.println("No path found. Dead ends marked with '0':");
        }
        printMaze(maze);
    }
}
