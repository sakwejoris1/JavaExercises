// out-of-range lowSubscript or highSubscript.
public class InvalidSubscriptException extends Exception {
    public InvalidSubscriptException(String message) {
        super(message);
    }
}
