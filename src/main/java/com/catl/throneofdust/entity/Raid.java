package com.catl.throneofdust.entity;

import jakarta.persistence.*;
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
    }
