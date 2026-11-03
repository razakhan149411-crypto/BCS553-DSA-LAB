# Lab 11: Method Overriding

**Name:** MOHD RAZA  
**Roll No:** 24103033281  
**Student ID:** BCS2024381  
**Course:** BCS553 - Applied Data Structure & Algorithms Lab  
**University:** Invertis University, Bareilly (B.Tech CSE)

## Aim
Change inherited behaviour in the child class and see polymorphism.

## Theory
- **Overriding:** the child class provides its own version of a parent method with the **same name and parameters**.
- `@Override` asks the compiler to check that the method really overrides a parent method.
- **Runtime polymorphism:** a parent reference can hold a child object (`Shape s = new Square()`). The method that runs is decided by the **actual object**, not the variable type.
- Areas: Square side 4 = 16, Rectangle 4 x 5 = 20, Square side 3 (through a Shape variable) = 9.

## Tasks
### Task 1: Square overrides area().
File: `task1/Main.java`

Output:
```
Area: 16
```

### Task 2: Rectangle overrides area().
File: `task2/Main.java`

Output:
```
Area: 20
```

### Task 3: Shape variable holding a Square object.
File: `task3/Main.java`

Output:
```
Area: 9
```

## How to run
```
cd task1
java Main.java
```
Take a screenshot of the output of each task and save it in its task folder.
