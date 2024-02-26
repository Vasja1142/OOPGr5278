package Program.MyException;

public class GenderInputException extends InputException{
    /**
     * Constructs an {@code IOException} with the specified detail message.
     *
     * @param message The detail message (which is saved for later retrieval
     *                by the {@link #getMessage()} method)
     */
    public GenderInputException(String message) {
        super(message);
    }
}
