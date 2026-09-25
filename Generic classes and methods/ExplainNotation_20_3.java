public class ExplainNotation_20_3<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        // T becomes String for this object
        ExplainNotation_20_3<String> stringBox = new ExplainNotation_20_3<>();
        stringBox.setValue("Hello, generics!");
        System.out.println("stringBox holds: " + stringBox.getValue());

        // T becomes Integer for this (completely separate) object
        ExplainNotation_20_3<Integer> intBox = new ExplainNotation_20_3<>();
        intBox.setValue(42);
        System.out.println("intBox holds: " + intBox.getValue());

    }
}
