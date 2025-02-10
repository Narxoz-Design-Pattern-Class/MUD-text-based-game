package com.example.mud.factory.method;

import com.example.mud.entities.IGameEntity;

/**
 * MUDGameEntityFactory is an abstract class demonstrating the Factory Method pattern.
 * It defines an abstract method for creating game entities.
 */
public abstract class MUDGameEntityFactory {

    /**
     * Factory Method to create a game entity.
     *
     * @param type  the type of entity to create (e.g., "room", "npc")
     * @param param additional information (e.g., description or name)
     * @return a new instance of IGameEntity
     */
    public abstract IGameEntity createEntity(String type, String param);
}
