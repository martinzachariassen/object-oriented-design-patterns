# Pizza Shop with Factory Method Design Pattern

## Table of Contents
1. [Introduction](#introduction)
2. [Design Overview](#design-overview)
3. [Key Components](#key-components)
4. [How It Works](#how-it-works)
5. [Benefits of the Factory Method Pattern](#benefits-of-the-factory-method-pattern)
6. [Limitations of the Factory Method Pattern](#limitations-of-the-factory-method-pattern)
7. [Code Structure](#code-structure)
8. [References](#references)


## Introduction
This project demonstrates the **Factory Method Design Pattern** by simulating a pizza shop. The Factory Method is used to create various types of pizzas without specifying their exact classes, ensuring flexibility and scalability in the code.


## Design Overview
The Factory Method Pattern is a creational design pattern that provides an interface for creating objects, allowing subclasses to alter the type of objects that will be created.

In this project:
- A pizza shop can create different types of pizzas (e.g., Margherita, Pepperoni, Veggie) based on customer orders.
- The creation logic is encapsulated in a factory, promoting loose coupling between the client code and the product creation logic.


## Key Components
#### 1. **Pizza Interface**
Defines the contract for all pizza types, ensuring consistency in behavior.

#### 2. **Concrete Pizza Classes**
Specific types of pizzas (`MargheritaPizza`, `PepperoniPizza`, `VeggiePizza`) implement the `Pizza` interface.

#### 3. **Abstract Factory Class**
Defines the method for creating pizzas (`createPizza`) and the ordering process (`orderPizza`).

#### 4. **Concrete Factory Class**
Implements the creation logic for specific pizza types based on the order.

#### 5. **Pizza Shop Simulation**
A `main` class demonstrates how the Factory Method Pattern works in practice.


## How It Works
1. The `PizzaFactory` defines the `createPizza` method, which subclasses override to provide specific pizza creation logic.
2. The `orderPizza` method in the factory handles the common steps (preparing, baking, boxing).
3. The `SimplePizzaFactory` is the concrete factory that decides which `Pizza` subclass to instantiate based on the input type.
4. When the `PizzaShop` simulation runs, customers place orders, and the factory creates and prepares the appropriate pizza type.


## Benefits of the Factory Method Pattern
- **Encapsulation of Creation Logic**: The creation logic is centralized in the factory, reducing redundancy.
- **Flexibility and Scalability**: Adding a new pizza type only requires creating a new class and updating the factory.
- **Adherence to SOLID Principles**:
    - **Open/Closed Principle**: The system is open to extension but closed to modification.
    - **Single Responsibility Principle**: Each class has a well-defined purpose.
- **Loose Coupling**: The client code depends on abstractions, not concrete implementations.


## Limitations of the Factory Method Pattern
- **Increased Complexity**:
    - The introduction of factory classes and methods can make the design more complex compared to simple instantiation using the `new` keyword.
    - For small-scale projects, this additional abstraction may feel unnecessary and over-engineered.
- **Overhead for New Subclasses**:
    - Every new type of product (e.g., pizza) requires creating a new concrete class, which can increase the number of files and the overall project size.
- **Difficulties in Debugging**:
    - With the creation logic abstracted into the factory, debugging issues related to object creation may take more effort.
- **Tight Coupling with the Factory**:
    - While the factory decouples client code from the concrete product, it can introduce coupling between the factory and the concrete classes, especially if the factory logic becomes too rigid.
- **Not Always Intuitive for Beginners**:
    - Understanding and implementing factory methods may be challenging for developers new to design patterns, leading to potential misuse or misunderstanding of the pattern.


## Code Structure
```editorconfig
FactoryMethod/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Margherita.java         # Concrete pizza class for Margherita
│   │   │   ├── Pepperoni.java          # Concrete pizza class for Pepperoni
│   │   │   ├── Pizza.java              # Interface for all pizzas
│   │   │   ├── PizzaFactory.java       # Abstract factory class
│   │   │   ├── PizzaShop.java          # Main simulation class
│   │   │   ├── PizzaType.java          # Enum for pizza types
│   │   │   ├── SimplePizzaFactory.java # Concrete factory class
│   │   │   ├── VeggiePizza.java        # Concrete pizza class for Veggie
│   │   └── resources/                  # Additional resources (if any)
│   └── test/                           # Unit tests for the project
├── README.md                           # Project documentation
```


## References
- [Factory Method Design Pattern - Refactoring Guru](https://refactoring.guru/design-patterns/factory-method)
- [Java Documentation: Abstract Classes vs Interfaces](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)
