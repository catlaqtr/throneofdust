package com.catl.throneofdust.controller;

import com.catl.throneofdust.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.catl.throneofdust.entity.Character;



@RestController
@RequestMapping("/characters")
public class CharacterController {
    @Autowired
    private CharacterService characterService;

    @PostMapping
    public Character create(@RequestBody Character character) {
        return characterService.create(character);
    }

    @GetMapping
    public List<Character> getAll() {
        return characterService.getAll();
    }

    @GetMapping("/{id}")
    public Character getById(@PathVariable long id) {
        return characterService.getById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public Character update(@PathVariable long id, @RequestBody Character character) {
        return characterService.update(id, character);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        characterService.deleteById(id);
    }

    @GetMapping("/options")
    public List<Character> getCharacterOptions() {
        return characterService.generateRandomCharacter(3);
    }

    @PostMapping("/pick")
    public Character pickCharacter(@RequestBody Character character) {
        return characterService.create(character);
    }

    @GetMapping("/by-player/{playerId}")
    public List<Character> getByPlayerId(@PathVariable long playerId) {
        return characterService.getByPlayerId(playerId);
    }
}
