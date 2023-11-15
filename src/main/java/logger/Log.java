package logger;

import logger.type.Level;
import logger.type.Status;

import java.sql.Time;
import java.util.Arrays;
import java.util.TimeZone;

public class Log {
    private final int level, status;

    public Log(int level, int status) {
        this.level = level;
        this.status = status;
    }

    public <R> Message<R> setContent(R content) {
        return new Message<>(content);
    }

    public void setTime() {

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
}
