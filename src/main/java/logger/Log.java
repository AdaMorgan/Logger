package logger;

import logger.type.Level;
import logger.type.Status;

import java.util.Arrays;

public class Log {
    private final int level, status;

    public Log(Level level, Status status) {
        this(level.getCode(), status.getCode());
    }

    public Log(int level, int status) {
        this.level = level;
        this.status = status;
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

    public <R> void setContent(R content) {
        new Message<>(this, content).build();
    }
}
