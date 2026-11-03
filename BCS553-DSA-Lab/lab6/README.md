# Lab 6: Binary Search on a Sorted Array

**Name:** MOHD RAZA  
**Roll No:** 2410303281  
**Student ID:** BCS2024381  
**Course:** BCS553 - Applied Data Structure & Algorithms Lab  
**University:** Invertis University, Bareilly (B.Tech CSE)

## Aim
Search a sorted array by repeatedly halving the search range.

## Theory
- **Binary search** needs a **sorted** array.
- Keep `low` and `high`, find `mid = (low + high) / 2`. If `a[mid]` equals the key, stop. If the key is bigger, search the right half (`low = mid + 1`). Otherwise search the left half (`high = mid - 1`).
- Each step halves the range, so time is **O(log n)**. Space is O(1) for the loop version.
- Data used: `{10, 20, 30, 40, 50}`. Key 40 gives index 3, key 35 gives -1 and key 10 gives index 0.

## Tasks
### Task 1: Search key 40.
File: `task1/Main.java`

Output:
```
3
```

### Task 2: Search key 35 (not present).
File: `task2/Main.java`

Output:
```
-1
```

### Task 3: Search key 10 (first element).
File: `task3/Main.java`

Output:
```
0
```

## How to run
```
cd task1
java Main.java
```
Take a screenshot of the output of each task and save it in its task folder.
