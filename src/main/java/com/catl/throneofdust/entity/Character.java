package com.catl.throneofdust.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String name;

    @NotBlank
    private String role;
    @Min(1)
    private int level;
    private int health;

    private int experience;
    private int morale;
    private boolean isAlive = true;
    private LocalDateTime lastMissionDate;
    private int extractionCount;
    private double betrayalRisk;
    private String location;
    private String faction;
    private int reputation;
    private int loyalty;

    @ElementCollection
    private List<String> status = new ArrayList<>();

    @ElementCollection(targetClass = Trait.class)
    @Enumerated(EnumType.STRING)
    private List<Trait> trait = new ArrayList<>();

    @ElementCollection
    private List<String> injuryStatus = new ArrayList<>();

    @ElementCollection
    private List<String> inventory = new ArrayList<>();

    @ElementCollection
    private List<String> allegiance = new ArrayList<>();

    @ElementCollection
    private List<String> cooldowns = new ArrayList<>();

    @ElementCollection
    private List<String> timers = new ArrayList<>();

    @ElementCollection
    private List<String> gear = new ArrayList<>();

    @ElementCollection
    private List<String> specialAbilities = new ArrayList<>();

    @ElementCollection
    private List<String> relationshipStatuses = new ArrayList<>();


    @ElementCollection
    private List<String> buffs = new ArrayList<>();

    @ElementCollection
    private List<String> debuffs = new ArrayList<>();

    @ElementCollection
    private List<String> achievements = new ArrayList<>();

    @ElementCollection
    private List<String> skills = new ArrayList<>();

    @ElementCollection
    private List<String> historyLogs = new ArrayList<>();

    @ElementCollection
    private List<String> quests = new ArrayList<>();

    @ElementCollection
    private List<String> titles = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }



    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getMorale() {
        return morale;
    }

    public void setMorale(int morale) {
        this.morale = morale;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public LocalDateTime getLastMissionDate() {
        return lastMissionDate;
    }

    public void setLastMissionDate(LocalDateTime lastMissionDate) {
        this.lastMissionDate = lastMissionDate;
    }


    public int getExtractionCount() {
        return extractionCount;
    }

    public void setExtractionCount(int extractionCount) {
        this.extractionCount = extractionCount;
    }

    public double getBetrayalRisk() {
        return betrayalRisk;
    }

    public void setBetrayalRisk(double betrayalRisk) {
        this.betrayalRisk = betrayalRisk;
    }

    public Player getPlayer() {
        return player;
    }


    public void setPlayer(Player player) {
        this.player = player;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }


    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }


    public List<String> getBuffs() {
        return buffs;
    }

    public void setBuffs(List<String> buffs) {
        this.buffs = buffs;
    }

    public List<String> getDebuffs() {
        return debuffs;
    }

    public void setDebuffs(List<String> debuffs) {
        this.debuffs = debuffs;
    }

    public List<String> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<String> achievements) {
        this.achievements = achievements;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getHistoryLogs() {
        return historyLogs;
    }

    public void setHistoryLogs(List<String> historyLogs) {
        this.historyLogs = historyLogs;
    }

    public List<String> getCooldowns() {
        return cooldowns;
    }

    public void setCooldowns(List<String> cooldowns) {
        this.cooldowns = cooldowns;
    }

    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public List<Trait> getTrait() {
        return trait;
    }

    public void setTrait(List<Trait> trait) {
        this.trait = trait;
    }

    public List<String> getInjuryStatus() {
        return injuryStatus;
    }

    public void setInjuryStatus(List<String> injuryStatus) {
        this.injuryStatus = injuryStatus;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }

    public List<String> getAllegiance() {
        return allegiance;
    }

    public void setAllegiance(List<String> allegiance) {
        this.allegiance = allegiance;
    }

    public List<String> getTimers() {
        return timers;
    }

    public void setTimers(List<String> timers) {
        this.timers = timers;
    }

    public List<String> getGear() {
        return gear;
    }

    public void setGear(List<String> gear) {
        this.gear = gear;
    }

    public List<String> getSpecialAbilities() {
        return specialAbilities;
    }

    public void setSpecialAbilities(List<String> specialAbilities) {
        this.specialAbilities = specialAbilities;
    }

    public List<String> getRelationshipStatuses() {
        return relationshipStatuses;
    }

    public void setRelationshipStatuses(List<String> relationshipStatuses) {
        this.relationshipStatuses = relationshipStatuses;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public List<String> getQuests() {
        return quests;
    }

    public void setQuests(List<String> quests) {
        this.quests = quests;
    }
}
