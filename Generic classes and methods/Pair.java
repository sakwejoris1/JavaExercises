public class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        // F is String, S is Integer
        Pair<String, Integer> nameAndAge = new Pair<>("Jovi", 25);
        System.out.println("Pair: " + nameAndAge);
        System.out.println("First: " + nameAndAge.getFirst());
        System.out.println("Second: " + nameAndAge.getSecond());

        nameAndAge.setSecond(26);
        System.out.println("After setSecond: " + nameAndAge);

        // F and S can be any types at all, including two of the same type
        Pair<Double, Double> coordinates = new Pair<>(3.5, 7.2);
        System.out.println("\nCoordinates pair: " + coordinates);
    }
}
