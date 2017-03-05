package com.grouk.task4_1.util;

import java.util.Random;

/**
 * Created by Alena on 05.03.2017.
 */
public class RandomObject {
    private final static Random random = new Random();

    public static Object getRandomObject(Object[] objects) {
        int i = random.nextInt(objects.length);
        return objects[i];
    }
}
