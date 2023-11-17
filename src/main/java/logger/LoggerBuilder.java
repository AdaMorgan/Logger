package logger;

import logger.type.Level;
import logger.type.Status;

public class LoggerBuilder {
    public static void log(Level level, Status status, String context) {
        new Log(level, status).setContent(context);
    }

    public static void info(Status status, String context) {
        log(Level.INFO, status, context);
    }

    public static void debug(Status status, String context) {
        log(Level.DEBUG, status, context);
    }

    public static void client(Status status, String context) {
        log(Level.CLIENT, status, context);
    }

    public static void server(Status status, String context) {
        log(Level.SERVER, status, context);
    }
}
