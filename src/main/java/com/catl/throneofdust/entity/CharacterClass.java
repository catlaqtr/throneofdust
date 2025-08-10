package com.catl.throneofdust.entity;

import java.util.EnumMap;
import java.util.Map;

public enum CharacterClass {
    WARRIOR(statRanges(
            StatType.HEALTH, 120, 140,
            StatType.STAMINA, 80, 100,
            StatType.MANA, 10, 20,
            StatType.PHYSICAL_ATTACK, 15, 20,
            StatType.PHYSICAL_DEFENSE, 12, 18,
            StatType.MAGIC_ATTACK, 2, 6,
            StatType.MAGIC_DEFENSE, 4, 8,
            StatType.SPEED, 8, 12,
            StatType.ACCURACY, 10, 15,
            StatType.EVASION, 5, 10,
            StatType.CRITICAL_CHANCE, 3, 7,
            StatType.CRITICAL_DAMAGE, 10, 15,
            StatType.ARMOR_PENETRATION, 5, 10,
            StatType.MAGIC_PENETRATION, 0, 3,
            StatType.LUCK, 5, 10
    )),
    MAGE(statRanges(
            StatType.HEALTH, 60, 80,
            StatType.STAMINA, 40, 60,
            StatType.MANA, 120, 150,
            StatType.PHYSICAL_ATTACK, 2, 6,
            StatType.PHYSICAL_DEFENSE, 2, 6,
            StatType.MAGIC_ATTACK, 18, 25,
            StatType.MAGIC_DEFENSE, 12, 18,
            StatType.SPEED, 8, 12,
            StatType.ACCURACY, 10, 15,
            StatType.EVASION, 5, 10,
            StatType.CRITICAL_CHANCE, 5, 10,
            StatType.CRITICAL_DAMAGE, 12, 18,
            StatType.ARMOR_PENETRATION, 0, 3,
            StatType.MAGIC_PENETRATION, 8, 14,
            StatType.LUCK, 8, 14
    )),
    ROGUE(statRanges(
            StatType.HEALTH, 80, 100,
            StatType.STAMINA, 70, 90,
            StatType.MANA, 20, 40,
            StatType.PHYSICAL_ATTACK, 10, 15,
            StatType.PHYSICAL_DEFENSE, 6, 10,
            StatType.MAGIC_ATTACK, 4, 8,
            StatType.MAGIC_DEFENSE, 4, 8,
            StatType.SPEED, 15, 20,
            StatType.ACCURACY, 12, 18,
            StatType.EVASION, 12, 18,
            StatType.CRITICAL_CHANCE, 8, 14,
            StatType.CRITICAL_DAMAGE, 14, 20,
            StatType.ARMOR_PENETRATION, 8, 14,
            StatType.MAGIC_PENETRATION, 2, 6,
            StatType.LUCK, 10, 16
    )),
    CLERIC(statRanges(
            StatType.HEALTH, 90, 110,
            StatType.STAMINA, 60, 80,
            StatType.MANA, 80, 110,
            StatType.PHYSICAL_ATTACK, 6, 10,
            StatType.PHYSICAL_DEFENSE, 8, 14,
            StatType.MAGIC_ATTACK, 10, 16,
            StatType.MAGIC_DEFENSE, 14, 20,
            StatType.SPEED, 7, 11,
            StatType.ACCURACY, 9, 14,
            StatType.EVASION, 6, 10,
            StatType.CRITICAL_CHANCE, 4, 8,
            StatType.CRITICAL_DAMAGE, 10, 15,
            StatType.ARMOR_PENETRATION, 2, 6,
            StatType.MAGIC_PENETRATION, 6, 12,
            StatType.LUCK, 8, 14
    )),
    RANGER(statRanges(
            StatType.HEALTH, 85, 105,
            StatType.STAMINA, 90, 110,
            StatType.MANA, 30, 50,
            StatType.PHYSICAL_ATTACK, 12, 18,
            StatType.PHYSICAL_DEFENSE, 7, 12,
            StatType.MAGIC_ATTACK, 4, 8,
            StatType.MAGIC_DEFENSE, 5, 10,
            StatType.SPEED, 13, 18,
            StatType.ACCURACY, 14, 20,
            StatType.EVASION, 10, 16,
            StatType.CRITICAL_CHANCE, 7, 13,
            StatType.CRITICAL_DAMAGE, 12, 18,
            StatType.ARMOR_PENETRATION, 7, 13,
            StatType.MAGIC_PENETRATION, 2, 6,
            StatType.LUCK, 9, 15
    )),
    PALADIN(statRanges(
            StatType.HEALTH, 110, 130,
            StatType.STAMINA, 70, 90,
            StatType.MANA, 60, 90,
            StatType.PHYSICAL_ATTACK, 12, 16,
            StatType.PHYSICAL_DEFENSE, 14, 20,
            StatType.MAGIC_ATTACK, 8, 14,
            StatType.MAGIC_DEFENSE, 12, 18,
            StatType.SPEED, 7, 11,
            StatType.ACCURACY, 9, 14,
            StatType.EVASION, 6, 10,
            StatType.CRITICAL_CHANCE, 4, 8,
            StatType.CRITICAL_DAMAGE, 10, 15,
            StatType.ARMOR_PENETRATION, 4, 8,
            StatType.MAGIC_PENETRATION, 4, 8,
            StatType.LUCK, 7, 13
    )),
    BERSERKER(statRanges(
            StatType.HEALTH, 130, 150,
            StatType.STAMINA, 90, 110,
            StatType.MANA, 5, 15,
            StatType.PHYSICAL_ATTACK, 18, 25,
            StatType.PHYSICAL_DEFENSE, 10, 16,
            StatType.MAGIC_ATTACK, 1, 4,
            StatType.MAGIC_DEFENSE, 2, 6,
            StatType.SPEED, 10, 15,
            StatType.ACCURACY, 8, 13,
            StatType.EVASION, 7, 12,
            StatType.CRITICAL_CHANCE, 10, 16,
            StatType.CRITICAL_DAMAGE, 16, 24,
            StatType.ARMOR_PENETRATION, 10, 16,
            StatType.MAGIC_PENETRATION, 0, 2,
            StatType.LUCK, 6, 12
    )),
    NECROMANCER(statRanges(
            StatType.HEALTH, 70, 90,
            StatType.STAMINA, 40, 60,
            StatType.MANA, 110, 140,
            StatType.PHYSICAL_ATTACK, 3, 7,
            StatType.PHYSICAL_DEFENSE, 3, 7,
            StatType.MAGIC_ATTACK, 16, 22,
            StatType.MAGIC_DEFENSE, 10, 16,
            StatType.SPEED, 7, 12,
            StatType.ACCURACY, 9, 14,
            StatType.EVASION, 6, 11,
            StatType.CRITICAL_CHANCE, 6, 12,
            StatType.CRITICAL_DAMAGE, 13, 19,
            StatType.ARMOR_PENETRATION, 1, 4,
            StatType.MAGIC_PENETRATION, 10, 16,
            StatType.LUCK, 10, 16
    )),
    MONK(statRanges(
            StatType.HEALTH, 100, 120,
            StatType.STAMINA, 100, 120,
            StatType.MANA, 30, 50,
            StatType.PHYSICAL_ATTACK, 12, 18,
            StatType.PHYSICAL_DEFENSE, 10, 16,
            StatType.MAGIC_ATTACK, 6, 10,
            StatType.MAGIC_DEFENSE, 8, 14,
            StatType.SPEED, 14, 20,
            StatType.ACCURACY, 13, 18,
            StatType.EVASION, 13, 18,
            StatType.CRITICAL_CHANCE, 7, 13,
            StatType.CRITICAL_DAMAGE, 12, 18,
            StatType.ARMOR_PENETRATION, 6, 12,
            StatType.MAGIC_PENETRATION, 2, 6,
            StatType.LUCK, 8, 14
    )),
    BARD(statRanges(
            StatType.HEALTH, 75, 95,
            StatType.STAMINA, 60, 80,
            StatType.MANA, 60, 90,
            StatType.PHYSICAL_ATTACK, 6, 10,
            StatType.PHYSICAL_DEFENSE, 5, 9,
            StatType.MAGIC_ATTACK, 8, 14,
            StatType.MAGIC_DEFENSE, 8, 14,
            StatType.SPEED, 10, 15,
            StatType.ACCURACY, 11, 16,
            StatType.EVASION, 10, 15,
            StatType.CRITICAL_CHANCE, 6, 12,
            StatType.CRITICAL_DAMAGE, 10, 16,
            StatType.ARMOR_PENETRATION, 2, 6,
            StatType.MAGIC_PENETRATION, 4, 8,
            StatType.LUCK, 14, 20
    ));

    private final Map<StatType, StatRange> statRanges;

    CharacterClass(Map<StatType, StatRange> statRanges) {
        this.statRanges = statRanges;
    }

    public Map<StatType, StatRange> getStatRanges() {
        return statRanges;
    }

    private static Map<StatType, StatRange> statRanges(Object... args) {
        Map<StatType, StatRange> map = new EnumMap<>(StatType.class);
        for (int i = 0; i < args.length; i += 3) {
            map.put((StatType) args[i], new StatRange((Integer) args[i + 1], (Integer) args[i + 2]));
        }
        return map;
    }
}