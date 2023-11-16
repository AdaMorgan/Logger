package logger;

import org.jetbrains.annotations.NotNull;

public class Message<T> {
    private final String message;

    public Message(@NotNull T message) {
        this.message = message.toString();
    }

    private String formatter() {
        return null;
    }

    public static @NotNull String setWidth(@NotNull String key, int space) {
        return key + " ".repeat(space - key.length());
    }

    public String reset() {
        return "\u001B[0m";
    }
}
