# Design Patterns

This tutorial explains the concepts of 23 design patterns using the Java language.

## 1. Introduction to Design Patterns
Design patterns represent the best practices and are generally adopted by experienced object-oriented software developers.

In 1994, the concept of design patterns in software development was first introduced in the book **Design Patterns - Elements of Reusable Object-Oriented Software**, co-authored by *Erich Gamma*, *Richard Helm*, *Ralph Johnson*, and *John Vlissides*. The four authors are collectively known as the **GoF** (Gang of Four).

## 2. Types of Design Patterns
According to the reference book *Design Patterns - Elements of Reusable Object-Oriented Software*, there are **23** design patterns in total. These patterns can be divided into three categories: **Creational Patterns**, **Structural Patterns**, and **Behavioral Patterns**.

| No. | Pattern | Includes |
|-----|---------|----------|
| 1 | Creational Patterns | Factory Pattern<br> Abstract Factory Pattern<br> Singleton Pattern<br> Builder Pattern<br> Prototype Pattern |
| 2 | Structural Patterns | Adapter Pattern<br> Bridge Pattern<br> Composite Pattern<br> Decorator Pattern<br> Facade Pattern<br> Flyweight Pattern<br> Proxy Pattern |
| 3 | Behavioral Patterns | Chain of Responsibility Pattern<br> Command Pattern<br> Interpreter Pattern<br> Iterator Pattern<br> Mediator Pattern<br> Memento Pattern<br> Observer Pattern<br> State Pattern<br> Strategy Pattern<br> Template Pattern<br> Visitor Pattern |

## 3. Characteristics of Different Patterns

### Creational Patterns (5)

- *Factory Pattern, Abstract Factory Pattern, Singleton Pattern, Builder Pattern, Prototype Pattern*

Creational design patterns provide a way to hide the creation logic while creating objects, rather than instantiating objects directly with the `new` operator. This gives the program more flexibility in deciding which objects need to be created for a given instance.

### Structural Patterns (7)

- *Adapter Pattern, Bridge Pattern, Composite Pattern, Decorator Pattern, Facade Pattern, Flyweight Pattern, Proxy Pattern*

Structural patterns focus on the composition and relationships between objects, aiming to solve how to build flexible and reusable class and object structures.

### Behavioral Patterns (11)

- *Chain of Responsibility Pattern, Command Pattern, Interpreter Pattern, Iterator Pattern, Mediator Pattern, Memento Pattern, Observer Pattern, State Pattern, Strategy Pattern, Template Pattern, Visitor Pattern*

Behavioral patterns focus on communication and interaction between objects, aiming to address the assignment of responsibilities among objects and the encapsulation of algorithms.

## 4. Advantages of Design Patterns

- Provide a shared design vocabulary and set of concepts, enabling developers to communicate better and understand each other's design intent.
- Provide proven solutions that improve the maintainability, reusability, and flexibility of software.
- Promote code reuse and avoid duplicate design and implementation.
- By following design patterns, errors and problems in the system can be reduced and code quality improved.

## 5. Six Principles of Design Patterns

#### Overall Principle — Open Closed Principle

    A software entity, such as classes, modules and functions, should be open for extension but closed for modification.

When a program needs to be extended, the original code must not be modified; instead, the original code should be extended to achieve a plug-and-play effect. In one sentence: this is to make the program extensible, easy to maintain, and easy to upgrade.

To achieve such an effect, we need to use interfaces, abstract classes, and so on.

#### 1. Single Responsibility Principle

    A class should have only one reason to change.

There should not be more than one reason for a class to change; that is, each class should implement a single responsibility, otherwise the class should be split up.

#### 2. Liskov Substitution Principle

    All places that reference a base class must be able to transparently use objects of its subclasses.

Wherever a base class can appear, a subclass must be able to appear as well. The Liskov Substitution Principle is the cornerstone of inheritance-based reuse. Only when a derived class can replace a base class without affecting the functionality of the software unit can the base class truly be reused, and the derived class can add new behavior on top of the base class.

The Liskov Substitution Principle is a supplement to the Open-Closed Principle. The key step in implementing the Open-Closed Principle is abstraction, and the inheritance relationship between a base class and its subclasses is the concrete realization of abstraction. Therefore, the Liskov Substitution Principle is a specification of the concrete steps for realizing abstraction. Under the Liskov Substitution Principle, subclasses should try not to override or overload the methods of the parent class, because the parent class represents a well-defined structure that interacts with the outside world through this standardized interface, and subclasses should not break it arbitrarily.

#### 3. Dependence Inversion Principle

    1. High-level modules should not depend on low-level modules; both should depend on abstractions.
    2. Abstractions should not depend on details; details should depend on abstractions.

Program to interfaces and depend on abstractions rather than concretions. When writing code that uses a concrete class, do not interact with the concrete class itself, but with the interface above it.

#### 4. Interface Segregation Principle

    1. Clients should not depend on interfaces they do not need.
    2. Dependencies between classes should be established on the smallest possible interfaces.

Each interface should not contain methods that subclasses do not use but are forced to implement; if it does, the interface should be split. Using multiple segregated interfaces is better than using a single interface (one that aggregates the methods of multiple interfaces into one).

#### 5. Law of Demeter (Least Knowledge Principle)

    Only talk to your direct friends, do not talk to "strangers".

A class should know as little as possible about the classes it depends on. No matter how complex the dependent class is, its logic should be encapsulated inside methods and exposed to the outside through public methods. In this way, when the dependent class changes, the impact on this class is minimized.

Another way to express the Least Knowledge Principle is: only communicate with direct friends. As long as there is a coupling relationship between classes, they are considered friends. Coupling is divided into dependency, association, aggregation, composition, and so on. Classes that appear as member variables, method parameters, and method return values are called direct friends, while local variables and temporary variables are not direct friends. We require that unfamiliar classes should not appear in a class as local variables.

#### 6. Composite Reuse Principle

    Try to use object composition/aggregation instead of inheritance to achieve software reuse.

Composition or aggregation can incorporate existing objects into new objects, making them part of the new object, so the new object can call upon the functionality of the existing objects.

## References
https://zhuanlan.zhihu.com/p/128145128
https://www.jianshu.com/p/3268264ae581
https://liaoxuefeng.com/books/java/design-patterns/index.html
https://www.runoob.com/design-pattern/design-pattern-intro.html


**Read this in other language: [English](README.md), [中文](README_zh.md)**