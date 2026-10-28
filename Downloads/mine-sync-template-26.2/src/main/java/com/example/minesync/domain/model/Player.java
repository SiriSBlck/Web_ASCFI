package com.example.minesync.domain.model;

import java.util.UUID;
import java.util.Objects;

public record Player(UUID uuid, String name, int onlinePlayerCount){ 
    public Player {
        Objects.requireNonNull(uuid, "Player UUID cannot be null");
        Objects.requireNonNull(name, "Player name cannot be null");

        name = name.trim();

        if(name.isBlank()) {
            throw new IllegalArgumentException("Player name cannot be blank");
        }

        if(onlinePlayerCount < 0) {
            throw new IllegalArgumentException("Connected player count cannot be negative");
        }
    }
}


