# Abstract Factory Demo (Week 1 - MUD Game)

## **Overview**
This module demonstrates the **Abstract Factory Pattern**, a **Creational Pattern** used to create *families* of related objects without specifying their concrete classes.

## **Why Abstract Factory?**
- Ensures **consistent object families**: Prevents mismatched components (e.g., a futuristic NPC inside a medieval room).
- Provides **runtime flexibility**: You can switch themes (`FantasyMUDFactory` → `SciFiMUDFactory`) dynamically.
- Decouples **client code from concrete classes**, making theme changes effortless.

## **Implementation Details**
- `IGameEntity` → Common interface for game entities.
- `Room`, `NPC` → Concrete entity classes implementing `IGameEntity`.
- `MUDAbstractFactory` → Interface defining methods to create **related** entities (`createRoom()`, `createNPC()`).
- `FantasyMUDFactory` → Implements `MUDAbstractFactory` for a **fantasy** theme.
- `SciFiMUDFactory` → Implements `MUDAbstractFactory` for a **sci-fi** theme.
- `MUDAbstractFactoryDemo` → Demonstrates switching between themed factories.

## **How to Run**
### **1. Compile the Code**
Navigate to the project root (`src/`) and run:
```sh
javac -d out com/example/mud/entities/*.java com/example/mud/factory/abstractfactory/*.java
