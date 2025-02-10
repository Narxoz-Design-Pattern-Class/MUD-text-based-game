package com.example.mud.factory.method;

import com.example.mud.entities.IGameEntity;

/**
 * MUDFactoryMethodDemo demonstrates the usage of the Factory Method pattern.
 * It shows how to create game entities using the factory without directly instantiating them.
 */
public class MUDFactoryMethodDemo {
    public static void main(String[] args) {
        // Create an instance of the concrete factory
        MUDGameEntityFactory factory = new ConcreteMUDGameEntityFactory();

        // Create a Room entity using the factory
        IGameEntity room = factory.createEntity("room", "A small stone chamber");
        room.describe();

        // Create an NPC entity using the factory
        IGameEntity npc = factory.createEntity("npc", "Goblin Guard");
        npc.describe();

        // Uncommenting the following line would throw an exception for an unknown type.
        // factory.createEntity("item", "Ancient Sword");
    }
}
