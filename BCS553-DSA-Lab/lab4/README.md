# Lab 4: Selection Sort

**Name:** MOHD RAZA  
**Roll No:** 2410303281 
**Student ID:** BCS2024381  
**Course:** BCS553 - Applied Data Structure & Algorithms Lab  
**University:** Invertis University, Bareilly (B.Tech CSE)

## Aim
Sort an array using selection sort, starting with finding the minimum.

## Theory
- **Selection sort** splits the array into a sorted part (left) and an unsorted part (right).
- In each pass it **selects the smallest** element of the unsorted part and swaps it into the next position of the sorted part.
- Time: **O(n^2)** in every case (it always scans the unsorted part). It makes at most `n - 1` swaps, fewer than bubble sort.
- It is **not stable**, but sorts **in place**.
- First step on `{64, 25, 12, 22, 11}`: smallest is 11 at index 4, so the array becomes `11 25 12 22 64`.

## Tasks
### Task 1: Find the index of the smallest value.
File: `task1/Main.java`

Output:
```
4
```

### Task 2: Full selection sort.
File: `task2/Main.java`

Output:
```
11
12
22
25
64
```

### Task 3: Only the first step of selection sort.
File: `task3/Main.java`

Output:
```
11
25
12
22
64
```

## How to run
```
cd task1
java Main.java
```
Take a screenshot of the output of each task and save it in its task folder.
