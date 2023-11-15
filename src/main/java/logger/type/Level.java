package logger.type;

import java.awt.*;

public enum Level {
    SERVER(1, 0xA771BF),
    CLIENT(0, 0xA771BF),
    DEBUG(2, 0x299999),
    INFO(3, 0x56A8F5);

    private final int code;
    private final int color;

    Level(int code, int color) {
        this.code = code;
        this.color = color;
    }

    private Color getColor() {
        return new Color(this.color);
    }

    public int getCode() {
        return code;
    }

    public String toANSI() {
        return String.format("\u001B[38;2;%d;%d;%dm", getColor().getRed(), getColor().getGreen(), getColor().getBlue());
    }
}
