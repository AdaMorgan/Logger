package example;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        String time = LocalDate.now()
                .toString();

        System.out.println(formatted("INFO", 8) + "|");
        System.out.println(formatted("FAILED", 8) + "|");
        System.out.println(formatted("SUCCESS", 8) + "|");
        //new Log(1, 1).setContent("Application start!");
    }

    public static @NotNull String formatted(@NotNull String key, int space) {
        return key + " ".repeat(space - key.length());
    }
}
