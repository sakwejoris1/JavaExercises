import java.util.Arrays;

public class Exercise7_8 {
    public static void main(String[] args) {

        // ----- a) Display the value of element 6 of array f -----
        int[] f = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(f[6]);

        // ----- b) Initialize each of the five elements of array g to 8 -----
        int[] g = new int[5];
        for (int i = 0; i < g.length; i++) {
            g[i] = 8;
        }
        System.out.println("g = " + Arrays.toString(g));

        // ----- c) Total the 100 elements of floating-point array c -----
        double[] c = new double[100];
        for (int i = 0; i < c.length; i++) {
            c[i] = i + 1; // sample values so the total is not zero
        }
        double total = 0;
        for (int i = 0; i < c.length; i++) {
            total += c[i];
        }
        System.out.println("Total of c = " + total);

        // ----- d) Copy 11-element array a into the first portion of 34-element array b -----
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] b = new int[34];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        // Equivalent one-line alternative:
        // System.arraycopy(a, 0, b, 0, a.length);
        System.out.println("b (first 11 elements) = " + Arrays.toString(Arrays.copyOf(b, 11)));

        // ----- e) Determine and display the smallest and largest values in 99-element array w -----
        double[] w = new double[99];
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < w.length; i++) {
            w[i] = rand.nextDouble() * 100; // sample random values
        }

        double smallest = w[0];
        double largest = w[0];
        for (int i = 1; i < w.length; i++) {
            if (w[i] < smallest) {
                smallest = w[i];
            }
            if (w[i] > largest) {
                largest = w[i];
            }
        }
        System.out.println("Smallest value in w = " + smallest);
        System.out.println("Largest value in w = " + largest);
    }
}
