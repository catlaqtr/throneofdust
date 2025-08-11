package com.catl.throneofdust.service;

import com.catl.throneofdust.entity.*;
import com.catl.throneofdust.entity.Character;
import com.catl.throneofdust.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import com.catl.throneofdust.util.NameGenerator;


@Service
public class CharacterService {
    @Autowired
    private CharacterRepository characterRepository;

    public Character create(Character character) {
        return characterRepository.save(character);
    }

    public List<Character> getAll() {
        return characterRepository.findAll();
    }

    public Optional<Character>getById(Long id) {
        return characterRepository.findById(id);
    }

    public void deleteById(Long id) {
        characterRepository.deleteById(id);
    }

    public Character update(long id, Character updated){
        updated.setId(id);
        return characterRepository.save(updated);
    }
    public List<Character> getByPlayerId(Long playerId) {
        return characterRepository.findByPlayerId(playerId);
    }

    public List<Character> generateRandomCharacter(int count){
        List<Character> options = new ArrayList<>();
        for(int i = 0; i < count; i++){
            Character c = new Character();
            c.setName(NameGenerator.generateName());
            CharacterClass randomClass = CharacterClass.values()[new Random().nextInt(CharacterClass.values().length)];
            c.setCharacterClass(randomClass);
            c.setStats(CharacterStatGenerator.generateStatsForClass(randomClass));
            c.setLevel(1);
            c.setExperience(0);
            c.setHealth(100);
            c.setAlive(true);
            c.setTitles(new ArrayList<>());
            c.setFaction(Faction.values()[new Random().nextInt(Faction.values().length)]);
            c.setExtractionCount(0);
            c.setMorale(100);
            c.setLoyalty(50);
            c.setInjuryStatus(List.of(InjuryStatus.HEALTHY));
            c.setBetrayalRisk(0.0);
            options.add(c);
        }
        return options;
    }
}
