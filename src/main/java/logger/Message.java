package logger;

import logger.type.Level;
import org.jetbrains.annotations.NotNull;

public class Message<T> {
    private final String message;

    public Message(@NotNull T message) {
        this.message = message.toString();
    }

    private String formatter() {
        return null;
    }

    public String reset() {
        return "\u001B[0m";
    }
}
