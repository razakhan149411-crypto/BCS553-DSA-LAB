# Lab 8: Classes and Objects

**Name:** MOHD RAZA  
**Roll No:** 2410303281  
**Student ID:** BCS2024381  
**Course:** BCS553 - Applied Data Structure & Algorithms Lab  
**University:** Invertis University, Bareilly (B.Tech CSE)

## Aim
Create classes with fields and methods and make objects from them.

## Theory
- A **class** is a blueprint. An **object** is one real instance made from that blueprint with the `new` keyword.
- **Fields** (variables) store data. **Methods** (functions) define behaviour.
- Every object has its own copy of the fields: two `Student` objects keep different roll numbers and names.
- Fields are accessed with the dot operator: `s.roll = 5;`.
- A method can return a value, for example `boolean isLong()` returns `pages > 300`.
- A Java file can hold many classes, but only the class with `main` is the starting point.

## Tasks
### Task 1: Student class: set and show roll and name.
File: `task1/Main.java`

Output:
```
Roll: 5
Name: Rohan
```

### Task 2: Two Student objects.
File: `task2/Main.java`

Output:
```
Roll: 5
Name: Rohan
Roll: 8
Name: Meera
```

### Task 3: Book class with an isLong() method.
File: `task3/Main.java`

Output:
```
true
false
```

## How to run
```
cd task1
java Main.java
```
Take a screenshot of the output of each task and save it in its task folder.
