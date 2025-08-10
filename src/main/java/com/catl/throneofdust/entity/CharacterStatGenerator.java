package com.catl.throneofdust.entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CharacterStatGenerator {
    public static List<Stat> generateStatsForClass(CharacterClass characterClass) {
        List<Stat> stats = new ArrayList<>();
        Random random = new Random();
        for (Map.Entry<StatType, StatRange> entry : characterClass.getStatRanges().entrySet()) {
            int min = entry.getValue().getMin();
            int max = entry.getValue().getMax();
            int value = min + random.nextInt(max - min + 1);
            stats.add(new Stat(entry.getKey(), value));
        }
        return stats;
    }
}