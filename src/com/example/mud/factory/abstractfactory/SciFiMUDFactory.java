package com.example.mud.factory.abstractfactory;

import com.example.mud.entities.IGameEntity;
import com.example.mud.entities.Room;
import com.example.mud.entities.NPC;

/**
 * SciFiMUDFactory produces game entities with a sci-fi theme.
 */
public class SciFiMUDFactory implements MUDAbstractFactory {

    @Override
    public IGameEntity createRoom() {
        // Creates a sci-fi-themed room
        return new Room("A high-tech corridor with neon lighting");
    }

    @Override
    public IGameEntity createNPC() {
        // Creates a sci-fi-themed NPC
        return new NPC("Android Scout");
    }
}
