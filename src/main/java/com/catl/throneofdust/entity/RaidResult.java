package com.catl.throneofdust.entity;

public class RaidResult {
    private long raidId;
    private RaidState state;
    private boolean completed;
    private boolean success;
    private String reward;

    public RaidResult(long raidId, RaidState state, boolean completed, boolean success, String reward) {
        this.raidId = raidId;
        this.state = state;
        this.completed = completed;
        this.success = success;
        this.reward = reward;
    }

    public long getRaidId() {
        return raidId;
    }

    public RaidState getState() {
        return state;
    }

    public boolean isCompleted() {
        return completed;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getReward() {
        return reward;
    }
}