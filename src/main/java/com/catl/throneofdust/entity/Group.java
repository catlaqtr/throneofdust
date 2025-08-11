package com.catl.throneofdust.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "player_group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @ManyToMany
    private List<Character> members;

    private int maxSize;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Character> getMembers() {
        return members;
    }

    public void setMembers(List<Character> members) {
        this.members = members;
    }
}
