# Lab 9: Constructors

**Name:** MOHD RAZA  
**Roll No:** 2410303281  
**Student ID:** BCS2024381  
**Course:** BCS553 - Applied Data Structure & Algorithms Lab  
**University:** Invertis University, Bareilly (B.Tech CSE)

## Aim
Initialise objects with default and parameterised constructors.

## Theory
- A **constructor** is a special method with the **same name as the class** and **no return type**. It runs automatically when `new` is used.
- A **default (no-argument) constructor** sets standard values, for example `width = 10`.
- A **parameterised constructor** receives values: `Box(int width)`.
- `this.width = width;` uses **`this`** to separate the field from the parameter with the same name.
- A constructor can set the starting state of an object, such as `count = 0` in a Counter.

## Tasks
### Task 1: Box with a default constructor.
File: `task1/Main.java`

Output:
```
Width: 10
```

### Task 2: Box with a parameterised constructor.
File: `task2/Main.java`

Output:
```
Width: 25
```

### Task 3: Counter with increment().
File: `task3/Main.java`

Output:
```
Count: 3
```

## How to run
```
cd task1
java Main.java
```
Take a screenshot of the output of each task and save it in its task folder.
