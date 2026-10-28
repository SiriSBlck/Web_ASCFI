package com.example.minesync.application;

import java.time.LocalDateTime;

import com.example.minesync.domain.event.EventType;
import com.example.minesync.domain.event.MineSyncEvent;

public class EventDispatcher {
    private int id;
    private EventType eventType;
    private LocalDateTime date;
    private int serverId;
    private int serverInstanceId;
    private int nSec;
    private int playload;

    public EventDispatcher(MineSyncEvent event) {
        // this.id = ;
        // this.eventType = ;
        this.date = LocalDateTime.now();
        // this.serverId = ;
        // this.serverInstanceId = ;
        // this.nSeq = ;
        // this.playload = ;
    }
}
