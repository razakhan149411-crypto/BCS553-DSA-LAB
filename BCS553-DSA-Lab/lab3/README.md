# Lab 3: Bubble Sort

**Name:** MOHD RAZA  
**Roll No:** 2410303281 
**Student ID:** BCS2024381  
**Course:** BCS553 - Applied Data Structure & Algorithms Lab  
**University:** Invertis University, Bareilly (B.Tech CSE)

## Aim
Sort an array using bubble sort, starting with a single pass.

## Theory
- **Bubble sort** repeatedly compares **neighbouring** elements and swaps them if they are in the wrong order.
- After each pass the largest remaining value reaches its final place at the end, like a bubble rising.
- For `n` elements, `n - 1` passes are needed, and the inner loop gets shorter each pass (`length - 1 - pass`).
- **Swap** needs a temporary variable: `temp = a[j]; a[j] = a[j+1]; a[j+1] = temp;`.
- Time: **O(n^2)** worst and average case. It is **stable** and sorts **in place** (O(1) extra space).
- One pass on `{5, 1, 4, 2, 8}` gives `1 4 2 5 8`.

## Tasks
### Task 1: One pass of bubble sort.
File: `task1/Main.java`

Output:
```
1
4
2
5
8
```

### Task 2: Full bubble sort.
File: `task2/Main.java`

Output:
```
1
2
4
5
8
```

### Task 3: Bubble sort on a 3 element array.
File: `task3/Main.java`

Output:
```
3
7
9
```

## How to run
```
cd task1
java Main.java
```
Take a screenshot of the output of each task and save it in its task folder.
