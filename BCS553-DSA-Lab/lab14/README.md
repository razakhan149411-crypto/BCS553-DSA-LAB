# Lab 14: Sorted Check, Search and Fibonacci

**Name:** MOHD RAZA  
**Roll No:** 2410303281  
**Student ID:** BCS2024381  
**Course:** BCS553 - Applied Data Structure & Algorithms Lab  
**University:** Invertis University, Bareilly (B.Tech CSE)

## Aim
More recursion: check if sorted, find an index and compute Fibonacci numbers.

## Theory
- **isSorted:** if any `a[i] > a[i+1]` return false, otherwise check the next index. Reaching the last element returns true.
- **Recursive search:** return the index when `a[i] == key`, return -1 when the index reaches the end.
- **Fibonacci:** `fib(n) = fib(n-1) + fib(n-2)`, with `fib(0) = 0` and `fib(1) = 1`. The series is 0, 1, 1, 2, 3, 5, 8, 13, so fib(7) = **13**.
- The simple Fibonacci recursion repeats the same sub-problems and takes about **O(2^n)** time. Memoization or loops reduce it to O(n).

## Tasks
### Task 1: isSorted on `{2, 4, 6, 8, 10}`.
File: `task1/Main.java`

Output:
```
true
```

### Task 2: findIndex of 80.
File: `task2/Main.java`

Output:
```
2
```

### Task 3: fib(7).
File: `task3/Main.java`

Output:
```
13
```

## How to run
```
cd task1
java Main.java
```
Take a screenshot of the output of each task and save it in its task folder.
