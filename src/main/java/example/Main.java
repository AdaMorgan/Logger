package example;

import logger.Log;

public class Main {
    public static void main(String[] args) {
        new Log(1, 1).setContent("Hello world!");
        new Log(2, 0).setContent("Hello world!");
        new Log(3, 2).setContent("Hello world!");
        new Log(0, 0).setContent("Hello world!");
    }
}
