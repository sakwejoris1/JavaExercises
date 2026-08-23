import static java.lang.IO.print;

public class BucketSort {

    public void sort(int[] array) {
        int[][] buckets = new int[10][array.length]; // 10 rows (digits 0-9), each up to array.length wide
        int[] bucketCounts = new int[10];             // tracks how many values are in each row

        // Find the maximum value to determine how many digit passes we need
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }

        // Run one pass per digit position (ones, tens, hundreds, ...)
        for (int divisor = 1; max / divisor > 0; divisor *= 10) {

            //  Distribution pass
            for (int value : array) {
                int digit = (value / divisor) % 10;
                buckets[digit][bucketCounts[digit]] = value;
                bucketCounts[digit]++;
            }

            // Gathering pass
            int arrayIndex = 0;
            for (int row = 0; row < 10; row++) {
                for (int i = 0; i < bucketCounts[row]; i++) {
                    array[arrayIndex] = buckets[row][i];
                    arrayIndex++;
                }
            }

            // Reset counts before the next digit pass
            for (int row = 0; row < 10; row++) {
                bucketCounts[row] = 0;
            }

            print("After distributing and gathering on divisor " + divisor + ":");
            printArray(array);
        }
    }

    public void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int value : array) {
            sb.append(value).append(" ");
        }
        print(sb.toString());
    }

    public static void main(String[] args) {
        BucketSort sorter = new BucketSort();

        int[] array = {97, 3, 100};
        print("Before sorting:");
        sorter.printArray(array);
        sorter.sort(array);
        print("After sorting:");
        sorter.printArray(array);
    }
}