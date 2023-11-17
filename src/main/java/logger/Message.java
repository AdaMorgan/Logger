package logger;

import org.jetbrains.annotations.NotNull;

import java.time.LocalTime;

public class Message<T> {
    private final Log log;
    private final T message;

    public Message(Log log, @NotNull T message) {
        this.log = log;
        this.message = message;
    }

    protected void build() {
        System.out.println(formatted());
    }

    private @NotNull String reset() {
        return "\u001B[0m";
    }

    private @NotNull String formatted() {
        return getTime() + getThread() + getLevel() + getStatus() + getMessage();
    }

    private @NotNull String setWidth(@NotNull String key, int length) {
        return key + " ".repeat(length - key.length());
    }

    private @NotNull String setColor(String key, String color) {
        return color + key;
    }

    public String getTime() {
        return setColor(setWidth(LocalTime.now().toString(), 20), "\u001B[0m");
    }

    public String getThread() {
        return setColor(setWidth(Thread.currentThread().getName(), 6), "\u001B[0m");
    }

    public String getLevel() {
        return setColor(setWidth(this.log.getLevel().name(), 8), this.log.getLevel().toANSI());
    }

    public String getStatus() {
        return setColor(setWidth(this.log.getStatus().name(), 8), this.log.getStatus().toANSI());
    }

    public String getMessage() {
        return reset() + this.message;
    }
}
