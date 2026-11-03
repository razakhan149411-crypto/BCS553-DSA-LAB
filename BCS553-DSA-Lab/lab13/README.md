# Lab 13: Recursion on Arrays

**Name:** MOHD RAZA  
**Roll No:** 2410303281  
**Student ID:** BCS2024381  
**Course:** BCS553 - Applied Data Structure & Algorithms Lab  
**University:** Invertis University, Bareilly (B.Tech CSE)

## Aim
Use an index parameter to process an array recursively.

## Theory
- To process an array recursively, pass the array and the **current index** `i`.
- **Base case:** the index has gone past the end (`i == a.length`), or it is the last element for max.
- **Recursive case:** use `a[i]` and solve the problem for `i + 1`. Sum: `a[i] + sum(a, i+1)`.
- Max: compare `a[i]` with the maximum of the remaining elements.
- Reverse print: start from the last index and move down with `i - 1` until `i < 0`.
- Data `{3, 6, 9, 12, 15}` gives sum 45 and max 15.

## Tasks
### Task 1: Recursive sum of an array.
File: `task1/Main.java`

Output:
```
45
```

### Task 2: Recursive maximum.
File: `task2/Main.java`

Output:
```
15
```

### Task 3: Print the array in reverse.
File: `task3/Main.java`

Output:
```
15
12
9
6
3
```

## How to run
```
cd task1
java Main.java
```
Take a screenshot of the output of each task and save it in its task folder.
