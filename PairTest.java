import static java.lang.IO.print;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> nameAge = new Pair<>("Jovi", 25);
        print("nameAge: " + nameAge);

        nameAge.setSecond(26);
        print("After setSecond: " + nameAge);

        Pair<Integer, Double> idScore = new Pair<>(101, 98.5);
        print("idScore: " + idScore);
        print("First: " + idScore.getFirst());
        print("Second: " + idScore.getSecond());
    }
}
