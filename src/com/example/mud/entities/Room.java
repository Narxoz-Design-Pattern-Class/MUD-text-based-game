package com.example.mud.entities;

/**
 * Room represents a simple room entity in the game.
 */
public class Room implements IGameEntity {
    private final String description;

    public Room(String description) {
        this.description = description;
    }

    @Override
    public void describe() {
        System.out.println("Room: " + description);
    }
}
