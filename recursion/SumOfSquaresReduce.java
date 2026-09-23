// Exercise 17.14 (Mapping Then Reducing an IntStream for Parallelization)
// NOTE: Fig. 17.5 wasn't provided, so this is a self-contained example of
// the same idea the exercise is testing.
//
// The WRONG way (commented out below) squares and adds in one reduce step:
//     reduce(0, (a, b) -> a + b * b)
// That lambda is NOT associative - if a parallel stream evaluated pieces of
// it in a different order, "b" would sometimes be an already-squared partial
// sum instead of a raw value, giving a wrong answer.
//
// The RIGHT way: first MAP every value to its square, then REDUCE the
// squared values using plain addition, which IS associative and safe to
// run in any order (including in parallel).
import java.util.stream.IntStream;

public class SumOfSquaresReduce {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        // Non-associative version - do NOT use this with a parallel stream:
        // int sumOfSquares = IntStream.of(values).reduce(0, (a, b) -> a + b * b);

        // Associative version: map to squares first, then reduce by addition
        int sumOfSquares = IntStream.of(values)
            .map(value -> value * value)
            .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
