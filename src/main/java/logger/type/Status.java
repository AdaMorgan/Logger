package logger.type;

import java.awt.*;

public enum Status {
    SUCCESS(0, 0x6AAB73),
    WARNING(1, 0xE0BB65),
    FAILED(2, 0xF75464);

    private final int code;
    private final int color;

    Status(int code, int color) {
        this.code = code;
        this.color = color;
    }

    public int getCode() {
        return code;
    }

    public Color getColor() {
        return new Color(color);
    }

    public String toANSI() {
        return String.format("\u001B[38;2;%d;%d;%dm", getColor().getRed(), getColor().getGreen(), getColor().getBlue());
    }
}
