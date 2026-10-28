package com.example.minesync.domain.event;

public interface MineSyncEvent {
    EventType type();
    public void dispatchEvent(MineSyncEvent event);
}
