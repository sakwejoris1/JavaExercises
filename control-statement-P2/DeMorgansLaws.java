public class DeMorgansLaws {
    public static void main(String[] args) {
        int x = 4, y = 8, a = 5, b = 6, g = 5, i = 5, j = 7;

        // a) !(x < 5) && !(y >= 7)  ==  !((x < 5) || (y >= 7))
        boolean original_a = !(x < 5) && !(y >= 7);
        boolean equivalent_a = !((x < 5) || (y >= 7));
        System.out.println("a) original: " + original_a + " | equivalent: " + equivalent_a);

        // b) !(a == b) || !(g != 5)  ==  !((a == b) && (g != 5))
        boolean original_b = !(a == b) || !(g != 5);
        boolean equivalent_b = !((a == b) && (g != 5));
        System.out.println("b) original: " + original_b + " | equivalent: " + equivalent_b);

        // c) !((x <= 8) && (y > 4))  ==  !(x <= 8) || !(y > 4)
        boolean original_c = !((x <= 8) && (y > 4));
        boolean equivalent_c = !(x <= 8) || !(y > 4);
        System.out.println("c) original: " + original_c + " | equivalent: " + equivalent_c);

        // d) !((i > 4) || (j <= 6))  ==  !(i > 4) && !(j <= 6)
        boolean original_d = !((i > 4) || (j <= 6));
        boolean equivalent_d = !(i > 4) && !(j <= 6);
        System.out.println("d) original: " + original_d + " | equivalent: " + equivalent_d);
    }
}
