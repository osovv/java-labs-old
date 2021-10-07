package main.java.org.miet.forest.service;

import java.util.Random;

public class Utils {
    private static final Random rand = new Random();

    public static <T> T getRandomValue(T[] values) {
        return values[rand.nextInt(values.length)];
    }
}
