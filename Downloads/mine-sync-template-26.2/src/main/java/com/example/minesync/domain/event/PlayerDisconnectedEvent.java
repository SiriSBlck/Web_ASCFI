package com.example.minesync.domain.event;

import java.util.UUID;
import java.util.Objects;

import com.example.minesync.domain.model.Player;

public record PlayerDisconnectedEvent(Player player, UUID sessionId, String reason) implements MineSyncEvent{
    public PlayerDisconnectedEvent {
        Objects.requireNonNull(player, "Player cannot be null");
        Objects.requireNonNull(sessionId, "Session id cannot be null");
    }

    @Override
    public EventType type() {
        return EventType.PLAYER_DISCONNECTED;
    }

    @Override
    public void dispatchEvent(MineSyncEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispatchEvent'");
    }
}
