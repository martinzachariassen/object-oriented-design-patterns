# Builder Design Pattern with Director in Java

## Table of Contents
1. [Introduction](#introduction)
2. [Design Overview](#design-overview)
3. [Key Components](#key-components)
4. [How It Works](#how-it-works)
5. [Benefits of Using the Director](#benefits-of-using-the-director)
6. [Limitations of the Director Approach](#limitations-of-the-director-approach)
7. [Code Structure](#code-structure)
8. [References](#references)


## Introduction
This project demonstrates the **Builder Design Pattern with a Director** in Java. The Builder Pattern simplifies the creation of complex objects by separating the construction process from the representation. The addition of a **Director** introduces a layer that manages the construction process and ensures it follows specific rules and sequences.


## Design Overview
The Builder Pattern with a Director is a **creational design pattern** that allows:
- Step-by-step construction of complex objects.
- Reusable construction logic encapsulated in the Director.
- The creation of multiple variations of a product (e.g., different car types) using the same builder.

In this project:
- A `Car` class is built using a nested `Builder` class.
- A `Director` manages the sequence of builder calls for constructing specific types of cars.


## Key Components
### 1. **Product (`Car`)**
Represents the object being constructed. The `Car` class has:
- Required attributes (`make`, `model`).
- Optional attributes (`color`, `engine`, `sunroof`).

### 2. **Builder (`Car.Builder`)**
A static nested class inside the `Car` class that:
- Provides methods to set optional attributes.
- Constructs the final `Car` object with a `build()` method.

### 3. **Director**
The `Director` class encapsulates the construction logic and:
- Ensures that the builder methods are called in the correct order.
- Provides predefined configurations for different types of cars (e.g., Luxury Car, Standard Car).


## How It Works
1. The client creates a `Builder` instance with required attributes (`make` and `model`).
2. The client passes the builder to the `Director`, which:
    - Calls the builder's methods to set optional attributes.
    - Ensures that the construction follows specific rules for each car type.
3. The client calls the builder’s `build()` method to create the final `Car` object.


## Benefits of Using the Director
1. **Encapsulation of Construction Logic**:
    - The `Director` abstracts the sequence of method calls, making the construction process reusable and consistent.

2. **Reusable Configurations**:
    - The Director allows predefined configurations for different product variations (e.g., Luxury Car vs. Standard Car).

3. **Cleaner Client Code**:
    - The client only interacts with the Director and Builder, avoiding direct involvement in the construction process.

4. **Flexibility**:
    - The Builder can be reused with or without the Director, depending on the use case.


## Limitations of the Director Approach
1. **Additional Complexity**:
    - Adding a Director introduces another layer of abstraction, which might be overkill for simple objects.

2. **Limited Scalability**:
    - If the number of product variations grows significantly, the Director may require extensive logic or multiple methods, reducing maintainability.

3. **Coupling**:
    - The Director is tightly coupled to the Builder, reducing flexibility in dynamically defining construction steps.


## Code Structure
```editorconfig
BuilderWithDirectorPattern/
├── src/
│   ├── Car.java                 # Implementation of the Car class and its nested Builder class
│   ├── Director.java            # Encapsulates the construction logic for different car types
│   ├── Main.java                # Test program to demonstrate the Director and Builder usage
├── README.md                    # Project documentation
```

## References
- [Builder Design Pattern - Refactoring Guru](https://refactoring.guru/design-patterns/builder)
- [Java Nested Classes Documentation](https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html)
