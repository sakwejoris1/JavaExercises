import static java.lang.IO.print;

public class GenericIsEqualTo {

    public static <T> boolean isEqualTo(T first, T second) {
        return first.equals(second);
    }

    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 5;
        Integer c = 7;

        Object x = "hello";
        Object y = "hello";

        String s1 = "test";
        String s2 = "test";

        print("isEqualTo(5, 5): " + isEqualTo(a, b));
        print("isEqualTo(5, 7): " + isEqualTo(a, c));
        print("isEqualTo(\"hello\" as Object, \"hello\" as Object): " + isEqualTo(x, y));
        print("isEqualTo(\"test\", \"test\"): " + isEqualTo(s1, s2));

        // Attempting to compare two different types, e.g. an Integer and a String,
        // will not compile if you try to pass them directly to isEqualTo(T, T) --
        // the compiler cannot infer a single T that fits both argument types.
        // If you upcast both to Object first, it compiles, but equals() will
        // correctly return false since an Integer never equals a String.
        Object mixedFirst = 5;
        Object mixedSecond = "5";
        print("isEqualTo(Integer 5 as Object, String \"5\" as Object): " + isEqualTo(mixedFirst, mixedSecond));
    }
}
