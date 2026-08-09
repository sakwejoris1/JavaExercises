public class PythagoreanTriples {
    public static void main(String[] args) {
        System.out.printf("%-8s%-8s%-8s%n", "Side1", "Side2", "Hypotenuse");

        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = side1; side2 <= 500; side2++) {
                double hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));

                if (hypotenuse == (int) hypotenuse && hypotenuse <= 500) {
                    System.out.printf("%-8d%-8d%-8.0f%n", side1, side2, hypotenuse);
                }
            }
        }
    }
}
