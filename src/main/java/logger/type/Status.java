package logger.type;

import java.awt.*;

public enum Status {
    SUCCESS(1, 0x6AAB73),
    WARNING(2, 0xE0BB65),
    FAILED(3, 0xF75464);

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
}
