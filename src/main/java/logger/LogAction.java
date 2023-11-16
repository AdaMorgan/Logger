package logger;

public interface LogAction {
    String getTime();

    String getThread();

    String getLevel();

    String getStatus();

    String getMessage();
}
