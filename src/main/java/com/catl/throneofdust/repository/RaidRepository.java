package com.catl.throneofdust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.catl.throneofdust.entity.Raid;
import com.catl.throneofdust.entity.RaidState;

public interface RaidRepository extends JpaRepository<Raid, Long> {
List<Raid> findByState(RaidState state);
}
