# MUD Design Patterns Project - 12-Week Roadmap

src/
└── com/
    └── example/
        └── mud/
            ├── controller/
            │   └── MUDController.java        // The simple controller that handles commands, runs the main loop
            ├── entities/
            │   ├── IGameEntity.java         // Base interface for all in-game entities (Room, NPC, Item, etc.)
            │   ├── Room.java               // Concrete class implementing IGameEntity
            │   ├── NPC.java                // Concrete class implementing IGameEntity
            │   ├── Item.java               // Another entity implementing IGameEntity
            │   ├── Door.java               // Optional entity for locked/unlocked passage
            │   ├── Monster.java            // Extends NPC for hostile creatures
            │   ├── Merchant.java           // Extends NPC for trading logic
            │   ├── Container.java          // Implementing IGameEntity, e.g. a chest or crate
            │   └── ... (any other entities)
            ├── factory/
            │   ├── method/
            │   │   ├── MUDGameEntityFactory.java     // Abstract class for Factory Method
            │   │   ├── ConcreteMUDGameEntityFactory.java // Concrete implementation deciding entity creation
            │   │   └── ... (any other related classes)
            │   └── abstractfactory/
            │       ├── MUDAbstractFactory.java       // Interface for creating themed families (createRoom, createNPC)
            │       ├── FantasyMUDFactory.java         // Concrete factory for fantasy-themed entities
            │       ├── SciFiMUDFactory.java           // Concrete factory for sci-fi-themed entities
            │       └── ... (any additional themes or expansions)
            ├── player/
            │   └── Player.java               // The player class, holding inventory, currentRoom, etc.
            ├── MUDMain.java                  // An optional main entry point that sets up rooms, items, etc. 



## Overview

Welcome to the MUD Design Patterns Project! In this course, we will gradually build a text-based multiplayer game (MUD) by introducing and integrating design patterns week by week. While the game context makes the concepts tangible and engaging, our primary goal is to understand **why** and **when** to apply each design pattern to create flexible, maintainable, and scalable software.

## Course Roadmap

Over the course of 12 weeks, we will introduce two design patterns each week. Each set of patterns is chosen to either **add new capabilities** or **refactor and improve** the existing code base—ensuring that the project evolves smoothly. Below is a brief summary of the topics:

### **Week 1: Creational Patterns – Game Entity Creation**
- **Patterns:** Factory Method & Abstract Factory  
- **Focus:**  
  - **Factory Method:** Centralize object creation for entities (e.g., rooms, NPCs) without hardcoding classes.
  - **Abstract Factory:** Create families of related objects (themes) to easily switch between styles (e.g., Fantasy vs. Sci-Fi).
- **Primary Role:** New features—establishing a flexible foundation.

### **Week 2: Advanced Creational Patterns**
- **Patterns:** Builder & Prototype  
- **Focus:**  
  - **Builder:** Construct complex game entities (like multi-room dungeons or intricate NPCs) step-by-step.
  - **Prototype:** Enable cloning of objects to efficiently generate multiple similar entities.
- **Primary Role:** New features—enhancing object construction.

### **Week 3: Centralized Management & Integration**
- **Patterns:** Singleton & Adapter  
- **Focus:**  
  - **Singleton:** Create a single, global GameServer (or WorldManager) to manage state.
  - **Adapter:** Integrate external systems (e.g., chat or authentication) without altering core logic.
- **Primary Role:** Singleton is used for refactoring; Adapter adds new integration capabilities.

### **Week 4: Structural Organization of the Game World**
- **Patterns:** Bridge & Composite  
- **Focus:**  
  - **Bridge:** Decouple the abstraction of a game entity from its implementation.
  - **Composite:** Organize game elements (rooms, zones, items) into hierarchies.
- **Primary Role:** Composite adds new grouping features; Bridge refactors to enhance decoupling.

### **Week 5: Enhancing and Simplifying Subsystems**
- **Patterns:** Decorator & Facade  
- **Focus:**  
  - **Decorator:** Dynamically add responsibilities (e.g., enchantments or special abilities) to game entities.
  - **Facade:** Provide a simplified interface to complex subsystems (like networking or persistence).
- **Primary Role:** Decorator introduces new capabilities; Facade refactors the interaction with subsystems.

### **Week 6: Optimization and Access Control**
- **Patterns:** Flyweight & Proxy  
- **Focus:**  
  - **Flyweight:** Share common state among many similar objects to optimize memory usage.
  - **Proxy:** Control and manage access to resource-intensive objects.
- **Primary Role:** Flyweight adds optimization features; Proxy refactors direct access with an intermediary.

### **Week 7: Handling Player Actions and Requests**
- **Patterns:** Command & Chain of Responsibility  
- **Focus:**  
  - **Command:** Encapsulate player actions (e.g., move, attack) as objects for flexibility and potential undo features.
  - **Chain of Responsibility:** Decouple request processing by routing commands through a chain of handlers.
- **Primary Role:** Command adds new action encapsulation; Chain of Responsibility refactors action handling.

### **Week 8: Scripting and Data Traversal**
- **Patterns:** Interpreter & Iterator  
- **Focus:**  
  - **Interpreter:** Implement a mini scripting language for game events and quests.
  - **Iterator:** Standardize traversal over collections (like players in a room or inventory items).
- **Primary Role:** Interpreter introduces scripting capabilities; Iterator refactors collection access.

### **Week 9: Event Coordination and Notifications**
- **Patterns:** Mediator & Observer  
- **Focus:**  
  - **Mediator:** Centralize communication among disparate game objects (e.g., in combat or chat).
  - **Observer:** Automatically update components in response to state changes.
- **Primary Role:** Mediator adds coordination features; Observer refactors event handling.

### **Week 10: Dynamic Behavior and Algorithm Selection**
- **Patterns:** State & Strategy  
- **Focus:**  
  - **State:** Allow game entities (especially NPCs) to change behavior dynamically based on internal state.
  - **Strategy:** Enable switching between different algorithms for behaviors such as pathfinding or combat.
- **Primary Role:** State refactors complex conditionals; Strategy can be used to both add new behaviors and refactor existing logic.

### **Week 11: Standardizing Processes and Cross-Cutting Operations**
- **Patterns:** Template Method & Visitor  
- **Focus:**  
  - **Template Method:** Define a skeleton for recurring routines (e.g., daily resets or quest flows) that can be customized.
  - **Visitor:** Perform operations across various game entities (e.g., saving state or diagnostics) without modifying their classes.
- **Primary Role:** Template Method refactors routine processes; Visitor adds new cross-cutting operations.

### **Week 12: Capturing and Restoring State**
- **Pattern:** Memento  
- **Focus:**  
  - **Memento:** Implement a mechanism to capture and restore game state (supporting features like undo/redo or save/load).
- **Primary Role:** Primarily adds new capability for state management, with some light refactoring to integrate with existing code.

## Project Structure

The project is organized into the following main packages:

src/ └── com/ └── example/ └── mud/ ├── entities/ // Core game entities (e.g., Room, NPC) └── factory/
├── method/ // Factory Method implementation and demo └── abstractfactory/ // Abstract Factory implementation and demo

Each week’s design patterns will be integrated into this evolving project, allowing you to see firsthand how a well-designed architecture adapts to new requirements without major rewrites.

## How to Use This Repository

1. **Week 1 Focus:**  
   - Study the provided examples for Factory Method and Abstract Factory.
   - Use the demo classes to run and observe the patterns in action.

2. **Building the Project Gradually:**  
   - As you progress through the course, additional patterns will be added into new packages or integrated with existing ones.
   - The project structure is designed to support incremental development and refactoring.

3. **Compilation and Execution:**  
   - Navigate to the `src` directory and compile the Java files, preserving the package structure.
   - Run the demo classes using the `java` command with the appropriate class paths.

## Next Steps

- **Week 1:** Learn the basics of object creation with Factory Method and Abstract Factory.
- **Future Weeks:** Integrate additional patterns (Builder, Prototype, Singleton, etc.) to evolve the project into a fully functional, maintainable MUD.

## License

*Specify your license here (e.g., MIT License).*
