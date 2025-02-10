package com.example.mud.factory.method;

import com.example.mud.entities.IGameEntity;
import com.example.mud.entities.Room;
import com.example.mud.entities.NPC;

/**
 * ConcreteMUDGameEntityFactory implements the factory method to create game entities.
 * It chooses which concrete class to instantiate based on the 'type' parameter.
 */
public class ConcreteMUDGameEntityFactory extends MUDGameEntityFactory {

    @Override
    public IGameEntity createEntity(String type, String param) {
        if (type.equalsIgnoreCase("room")) {
            return new Room(param);
        } else if (type.equalsIgnoreCase("npc")) {
            return new NPC(param);
        }
        throw new IllegalArgumentException("Unknown entity type: " + type);
    }
}
