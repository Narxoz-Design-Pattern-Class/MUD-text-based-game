package com.example.mud.factory.abstractfactory;

import com.example.mud.entities.IGameEntity;

/**
 * MUDAbstractFactoryDemo demonstrates the usage of the Abstract Factory pattern.
 * It shows how switching between different themed factories changes the family of created objects.
 */
public class MUDAbstractFactoryDemo {
    public static void main(String[] args) {
        // Use the Fantasy-themed factory
        MUDAbstractFactory fantasyFactory = new FantasyMUDFactory();
        IGameEntity fantasyRoom = fantasyFactory.createRoom();
        IGameEntity fantasyNPC  = fantasyFactory.createNPC();
        fantasyRoom.describe();
        fantasyNPC.describe();

        System.out.println("---------------------------");

        // Switch to the Sci-Fi-themed factory
        MUDAbstractFactory sciFiFactory = new SciFiMUDFactory();
        IGameEntity sciFiRoom = sciFiFactory.createRoom();
        IGameEntity sciFiNPC  = sciFiFactory.createNPC();
        sciFiRoom.describe();
        sciFiNPC.describe();
    }
}
