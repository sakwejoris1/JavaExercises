public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("%-6s%-8s%-8s%-8s%n", "N", "10*N", "100*N", "1000*N");

        for (int n = 1; n <= 5; n++) {
            System.out.printf("%-6d%-8d%-8d%-8d%n", n, 10 * n, 100 * n, 1000 * n);
        }
    }
}
