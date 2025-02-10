package com.example.mud.factory.abstractfactory;

import com.example.mud.entities.IGameEntity;

/**
 * MUDAbstractFactory defines the interface for creating families of related game entities.
 * Each method corresponds to a specific product type in the family.
 */
public interface MUDAbstractFactory {

    /**
     * Creates a Room entity.
     */
    IGameEntity createRoom();

    /**
     * Creates an NPC entity.
     */
    IGameEntity createNPC();
}
