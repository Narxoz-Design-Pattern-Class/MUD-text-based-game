# Factory Method Demo (Week 1 - MUD Game)

## **Overview**
This module demonstrates the **Factory Method Pattern**, a **Creational Pattern** used to create game entities without exposing their concrete instantiation.

## **Why Factory Method?**
- Avoids **direct object instantiation** (`new Room()`, `new NPC()`) throughout the code.
- Enables **easy extension**: New entity types can be added by modifying only the factory.
- Promotes **loose coupling**: The client code (`MUDFactoryMethodDemo`) depends only on the factory, not on specific entity implementations.

## **Implementation Details**
- `IGameEntity` → Defines a common interface for game entities.
- `Room`, `NPC` → Concrete classes implementing `IGameEntity`.
- `MUDGameEntityFactory` → Abstract factory class defining a **factory method**.
- `ConcreteMUDGameEntityFactory` → Implements the **factory method** to create `Room` or `NPC` objects.
- `MUDFactoryMethodDemo` → Demonstrates the pattern by creating different game entities using the factory.

## **How to Run**
### **1. Compile the Code**
Navigate to the project root (`src/`) and run:
```sh
javac -d out com/example/mud/entities/*.java com/example/mud/factory/method/*.java
