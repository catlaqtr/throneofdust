package com.catl.throneofdust.service;

import com.catl.throneofdust.entity.Raid;
import com.catl.throneofdust.entity.RaidState;
import  com.catl.throneofdust.repository.RaidRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class RaidService {
    @Autowired
    private RaidRepository raidRepository;

    public Raid createRaid(Raid raid) {
        raid.setState(RaidState.PREPARING);
        return raidRepository.save(raid);
    }

    public List<Raid> getAllRaids() {
        return raidRepository.findAll();
    }
    public Raid assignCharacters(long raidId, List<com.catl.throneofdust.entity.Character> characters) {
        Raid raid = raidRepository.findById(raidId).orElseThrow();
        int requiredSize = raid.getMaxGroupSize();
        if (characters.size() == requiredSize) {
            raid.setParticipants(characters);
            return raidRepository.save(raid);
        }
        return raid;
    }
    public List<Raid> getAvailableRaids(){
        return raidRepository.findByState(RaidState.PREPARING);
    }

    public Raid startRaid(long raidId){
        Raid raid = raidRepository.findById(raidId).orElseThrow();
        raid.setState(com.catl.throneofdust.entity.RaidState.WAITING);
        raid.setPreparationEndTime(LocalDateTime.now().plusMinutes(30));
        return raidRepository.save(raid);
    }

    public RaidResult progressRaidWithResult(long raidId) {
        Raid raid = raidRepository.findById(raidId).orElseThrow();
        boolean completed = false;
        boolean success = false;
        String reward = null;

        if(raid.getState() == RaidState.WAITING && LocalDateTime.now().isAfter(raid.getPreparationEndTime())){
            raid.setState(RaidState.IN_PROGRESS);
            raid.setRaidEndTime(LocalDateTime.now().plusHours(1));
        } else if (raid.getState() == RaidState.IN_PROGRESS && LocalDateTime.now().isAfter(raid.getRaidEndTime())) {
            raid.setState(RaidState.COMPLETED);
            completed = true;
            success = new Random().nextBoolean();
            reward = success ? raid.getReward() : null;
        }
        raidRepository.save(raid);
        return new RaidResult(raid.getId(), raid.getState(), completed, success, reward);
    }
}
