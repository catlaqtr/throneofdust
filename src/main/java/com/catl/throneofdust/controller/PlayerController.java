package com.catl.throneofdust.controller;

import com.catl.throneofdust.entity.Player;
import com.catl.throneofdust.repository.PlayerRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @PostMapping
    public Player createPlayer(@Valid @RequestBody Player player){
        return playerRepository.save(player);
    }

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
}
