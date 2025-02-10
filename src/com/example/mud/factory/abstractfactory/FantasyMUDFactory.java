package com.example.mud.factory.abstractfactory;

import com.example.mud.entities.IGameEntity;
import com.example.mud.entities.Room;
import com.example.mud.entities.NPC;

/**
 * FantasyMUDFactory produces game entities with a fantasy theme.
 */
public class FantasyMUDFactory implements MUDAbstractFactory {

    @Override
    public IGameEntity createRoom() {
        // Creates a fantasy-themed room
        return new Room("A grand hall filled with flickering torches");
    }

    @Override
    public IGameEntity createNPC() {
        // Creates a fantasy-themed NPC
        return new NPC("Orc Warrior");
    }
}
