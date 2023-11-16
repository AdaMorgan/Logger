package logger;

import logger.type.Level;
import logger.type.Status;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Log {
    private final int level, status;

    public Log(int level, int status) {
        this.level = level;
        this.status = status;
    }

    public Thread getThread() {
        return Thread.currentThread();
    }

    public Level getLevel() {
        return Arrays.stream(Level.values())
                .filter(value -> value.getCode() == this.level)
                .findFirst()
                .orElse(null);
    }

    public Status getStatus() {
        return Arrays.stream(Status.values())
                .filter(value -> value.getCode() == this.status)
                .findFirst()
                .orElse(null);
    }

    public <R> Message<R> setContent(R content) {
        return new Message<>(this, content).build();
    }
}
