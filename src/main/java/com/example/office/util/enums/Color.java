package com.example.office.util.enums;

import java.util.Random;

public enum Color {
    RED,
    GREEN,
    BLUE,
    BLACK,
    WHITE;

    private static final Random random = new Random();

    public static Color getRandomColor() {
        Color[] colors = values();
        return colors[random.nextInt(colors.length)];
    }
}
