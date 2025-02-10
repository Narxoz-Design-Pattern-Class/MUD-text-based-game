package com.example.mud.entities;

/**
 * NPC (Non-Player Character) represents a character in the game.
 */
public class NPC implements IGameEntity {
    private final String name;

    public NPC(String name) {
        this.name = name;
    }

    @Override
    public void describe() {
        System.out.println("NPC: " + name);
    }
}
