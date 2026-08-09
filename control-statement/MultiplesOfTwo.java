public class MultiplesOfTwo {
    public static void main(String[] args) {
        int multiple = 2;

        while (true) {
            System.out.println(multiple);
            multiple *= 2;
        }
    }
}

/*
 * What happens when you run this program?
 *
 * The loop never terminates -- it keeps printing increasing powers of 2
 * forever until the program is stopped manually (e.g. Ctrl+C), or until
 * the "multiple" variable overflows the int range and starts producing
 * incorrect/wrapped values (eventually going negative due to integer
 * overflow).
 */
