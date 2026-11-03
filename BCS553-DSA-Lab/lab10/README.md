# Lab 10: Parent and Child Classes

**Name:** MOHD RAZA  
**Roll No:** 2410303281  
**Student ID:** BCS2024381  
**Course:** BCS553 - Applied Data Structure & Algorithms Lab  
**University:** Invertis University, Bareilly (B.Tech CSE)

## Aim
Reuse code with inheritance using extends and super.

## Theory
- **Inheritance** lets a **child (sub) class** reuse the fields and methods of a **parent (super) class**. It models an *is-a* relationship (a Dog is an Animal).
- Syntax: `class Dog extends Animal`.
- `super(...)` calls the parent constructor and must be the **first statement** in the child constructor.
- A child object can use all non-private parent members, e.g. `d.sound()`.
- Java allows a class to extend only **one** class (single inheritance).

## Tasks
### Task 1: Dog inherits sound() from Animal.
File: `task1/Main.java`

Output:
```
Some sound
```

### Task 2: Student calls super(name) of Person.
File: `task2/Main.java`

Output:
```
Name: Neha
```

### Task 3: Teacher inherits greet() from Person.
File: `task3/Main.java`

Output:
```
Hello, Kiran
```

## How to run
```
cd task1
java Main.java
```
Take a screenshot of the output of each task and save it in its task folder.
