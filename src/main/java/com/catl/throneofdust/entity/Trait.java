package com.catl.throneofdust.entity;

public enum Trait {
    INTELLIGENT,
    UNINTELLIGENT,
    NAIVE,
    CUNNING,
    RESOURCEFUL,
    INEPT,
    LOYAL,
    DISLOYAL,
    HONEST,
    DECEITFUL,
    MERCIFUL,
    CRUEL,
    DISCIPLINED,
    RECKLESS,
    IMPULSIVE,
    CAUTIOUS,
    CHARISMATIC,
    SHY,
    BRAVE,
    COWARDLY,
    OPTIMISTIC,
    PESSIMISTIC,
    JEALOUS,
    SELFISH,
    AMBITION_DRIVEN,
    CONTENT,
    SUSPICIOUS,
    TRUSTING;

    private Trait opposite;

    static {
        INTELLIGENT.opposite = UNINTELLIGENT;
        UNINTELLIGENT.opposite = INTELLIGENT;
        NAIVE.opposite = CUNNING;
        CUNNING.opposite = NAIVE;
        RESOURCEFUL.opposite = INEPT;
        INEPT.opposite = RESOURCEFUL;
        LOYAL.opposite = DISLOYAL;
        DISLOYAL.opposite = LOYAL;
        HONEST.opposite = DECEITFUL;
        DECEITFUL.opposite = HONEST;
        MERCIFUL.opposite = CRUEL;
        CRUEL.opposite = MERCIFUL;
        DISCIPLINED.opposite = RECKLESS;
        RECKLESS.opposite = DISCIPLINED;
        IMPULSIVE.opposite = CAUTIOUS;
        CAUTIOUS.opposite = IMPULSIVE;
        CHARISMATIC.opposite = SHY;
        SHY.opposite = CHARISMATIC;
        BRAVE.opposite = COWARDLY;
        COWARDLY.opposite = BRAVE;
        OPTIMISTIC.opposite = PESSIMISTIC;
        PESSIMISTIC.opposite = OPTIMISTIC;
        JEALOUS.opposite = SELFISH;
        SELFISH.opposite = JEALOUS;
        AMBITION_DRIVEN.opposite = CONTENT;
        CONTENT.opposite = AMBITION_DRIVEN;
        SUSPICIOUS.opposite = TRUSTING;
        TRUSTING.opposite = SUSPICIOUS;
    }

    public Trait getOpposite() {
        return opposite;
    }
}