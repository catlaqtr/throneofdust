package com.catl.throneofdust.repository;
import com.catl.throneofdust.entity.Character;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterRepository extends JpaRepository<Character, Long> {
    List<Character> findByPlayerId(Long playerId);
}
