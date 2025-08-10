package com.catl.throneofdust.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

    @Entity
    public class Raid{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        private String location;
        private int difficulty;
        private String reward;
        private int maxGroupSize;

        @ManyToMany
        private List<Character> participants;

        @Enumerated(EnumType.STRING)
        private RaidState state = RaidState.PREPARING;

        private LocalDateTime preparationEndTime;
        private LocalDateTime raidEndTime;

        public int getMaxGroupSize() {
            return maxGroupSize;
        }

        public void setMaxGroupSize(int maxGroupSize) {
            this.maxGroupSize = maxGroupSize;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public int getDifficulty() {
            return difficulty;
        }

        public void setDifficulty(int difficulty) {
            this.difficulty = difficulty;
        }

        public String getReward() {
            return reward;
        }

        public void setReward(String reward) {
            this.reward = reward;
        }

        public List<Character> getParticipants() {
            return participants;
        }

        public void setParticipants(List<Character> participants) {
            this.participants = participants;
        }

        public RaidState getState() {
            return state;
        }

        public void setState(RaidState state) {
            this.state = state;
        }

        public LocalDateTime getPreparationEndTime() {
            return preparationEndTime;
        }

        public void setPreparationEndTime(LocalDateTime preparationEndTime) {
            this.preparationEndTime = preparationEndTime;
        }

        public LocalDateTime getRaidEndTime() {
            return raidEndTime;
        }

        public void setRaidEndTime(LocalDateTime raidEndTime) {
            this.raidEndTime = raidEndTime;
        }
    }
