package com.catl.throneofdust.util;

import java.util.Random;

public class NameGenerator {
    private static final String[] FIRST_NAMES = {
            "Arin", "Lira", "Doran", "Mira", "Thane", "Kael", "Sera", "Varek", "Elin", "Joren"
    };
    private static final String[] LAST_NAMES = {
            "Stormborn", "Ironwood", "Nightshade", "Duskblade", "Frostfall", "Ashen", "Brightstar", "Shadowend"
    };
    private static final Random RANDOM = new Random();

    public static String generateName() {
        String first = FIRST_NAMES[RANDOM.nextInt(FIRST_NAMES.length)];
        String last = LAST_NAMES[RANDOM.nextInt(LAST_NAMES.length)];
        return first + " " + last;
    }
}