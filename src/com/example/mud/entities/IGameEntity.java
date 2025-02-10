package com.example.mud.entities;

/**
 * IGameEntity defines the common interface for all game entities.
 * Every entity must be able to describe itself.
 */
public interface IGameEntity {
    /**
     * Outputs a textual description of the entity.
     */
    void describe();
}
