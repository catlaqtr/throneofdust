package com.catl.throneofdust.controller;

import com.catl.throneofdust.entity.Raid;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.catl.throneofdust.service.RaidService;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/raids")
public class RaidController {
    @Autowired
    private RaidService raidService;

    @PostMapping
    public Raid createRaid(@RequestBody Raid raid) {
        return raidService.createRaid(raid);
    }

    @GetMapping
    public List<Raid> getAllRaids() {
        return raidService.getAllRaids();
    }

    @PostMapping("/{raidId}/assign")
    public Raid assignCharacters(@PathVariable long raidId, @RequestBody List<com.catl.throneofdust.entity.Character> characters) {
        return raidService.assignCharacters(raidId, characters);
    }

    @PostMapping("/{raidId}/start")
    public Raid startRaid(@PathVariable long raidId) {
        return raidService.startRaid(raidId);

    }
    @PostMapping("/{raidId}/progress")
    public Raid progressRaid(@PathVariable long raidId) {
        return raidService.progressRaid(raidId);
    }
}
