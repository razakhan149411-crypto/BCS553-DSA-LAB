# Lab 1: Reading Array Values

**Name:** MOHD RAZA  
**Roll No:** 2410303281  
**Student ID:** BCS2024381  
**Course:** BCS553 - Applied Data Structure & Algorithms Lab  
**University:** Invertis University, Bareilly (B.Tech CSE)

## Aim
Store marks in an array and read the first value, last value and total.

## Theory
- An **array** stores a fixed number of values of the same type in continuous memory.
- Indexes start at **0**, so the last index is `length - 1`.
- `marks.length` gives the number of elements.
- Reading `marks[i]` takes constant time **O(1)**. Visiting every element with a loop takes **O(n)**.
- To find a total, start `sum = 0` and add each element inside the loop.
- Data used: `{45, 67, 80, 52, 90}`, so first = 45, last = 90, sum = 334.

## Tasks
### Task 1: Print first and last element.
File: `task1/Main.java`

Output:
```
First: 45
Last: 90
```

### Task 2: Print every element with a loop.
File: `task2/Main.java`

Output:
```
45
67
80
52
90
```

### Task 3: Calculate the sum.
File: `task3/Main.java`

Output:
```
Sum: 334
```

## How to run
```
cd task1
java Main.java
```
Take a screenshot of the output of each task and save it in its task folder.
