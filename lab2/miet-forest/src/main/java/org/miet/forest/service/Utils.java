package main.java.org.miet.forest.service;

import java.util.Random;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Utils {
    private static final Random rand = new Random();
//    private static final Gson objGson = new GsonBuilder().setPrettyPrinting().create();

    public static <T> T getRandomValue(T[] values) {
        return values[rand.nextInt(values.length)];
    }

//    public static <T> String convertToJson(T[] array) {
//        String json = objGson.toJson(array);
//        return json;
//    }
//
//    public static <T> T[] parseJson(String json) {
//        T[] array = objGson.fromJson(json, T[].class);
//        return array;
//    }
}
