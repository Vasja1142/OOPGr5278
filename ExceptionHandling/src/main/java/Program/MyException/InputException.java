package Program.MyException;

import java.io.IOException;

public abstract class InputException extends IOException {
    /**
     * Constructs an {@code IOException} with the specified detail message.
     *
     * @param message The detail message (which is saved for later retrieval
     *                by the {@link #getMessage()} method)
     */
    public InputException(String message) {
        super(message);
    }
}