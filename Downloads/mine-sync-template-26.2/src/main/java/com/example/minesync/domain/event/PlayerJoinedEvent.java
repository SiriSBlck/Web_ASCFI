package com.example.minesync.domain.event;

import java.util.Objects;
import java.util.UUID;

import com.example.minesync.domain.model.Player;

public record PlayerJoinedEvent(Player player, UUID sessionId) implements MineSyncEvent{
    public PlayerJoinedEvent { 
        Objects.requireNonNull(player, "Player cannot be null");
        Objects.requireNonNull(sessionId, "Session id cannot be null");
    }

    @Override
    public EventType type() {
        return EventType.PLAYER_JOINED;
    }

    @Override
    public void dispatchEvent(MineSyncEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispatchEvent'");
    }
}
