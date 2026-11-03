# Lab 12: Recursive Factorial, Sum and Power

**Name:** MOHD RAZA  
**Roll No:** 2410303281  
**Student ID:** BCS2024381  
**Course:** BCS553 - Applied Data Structure & Algorithms Lab  
**University:** Invertis University, Bareilly (B.Tech CSE)

## Aim
Solve small problems by a method calling itself.

## Theory
- **Recursion** means a method calls itself on a smaller version of the problem.
- Every recursive method needs a **base case** (stops the calls) and a **recursive case** (moves toward the base case).
- Calls are stored on the **call stack**. A missing base case ends with `StackOverflowError`.
- Factorial: `n! = n * (n-1)!`, base `0! = 1`. So 5! = **120**.
- Sum: `sum(n) = n + sum(n-1)`, base `sum(0) = 0`. So sum(10) = **55**.
- Power: `power(b, e) = b * power(b, e-1)`, base `e = 0` gives 1. So 2^5 = **32**.

## Tasks
### Task 1: factorial(5).
File: `task1/Main.java`

Output:
```
120
```

### Task 2: sum(10).
File: `task2/Main.java`

Output:
```
55
```

### Task 3: power(2, 5).
File: `task3/Main.java`

Output:
```
32
```

## How to run
```
cd task1
java Main.java
```
Take a screenshot of the output of each task and save it in its task folder.
