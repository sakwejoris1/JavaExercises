public class GenericIsEqualTo {

    public static <T> boolean isEqualTo(T first, T second) {
        return first.equals(second);
    }

    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        Integer int1 = 7;
        Integer int2 = 7;
        Integer int3 = 8;

        String string1 = "hello";
        String string2 = "hello";

        System.out.println("object1.equals(object2): " + isEqualTo(object1, object2));
        System.out.println("int1.equals(int2): " + isEqualTo(int1, int2));
        System.out.println("int1.equals(int3): " + isEqualTo(int1, int3));
        System.out.println("string1.equals(string2): " + isEqualTo(string1, string2));

    }
}
