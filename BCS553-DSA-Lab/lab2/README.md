# Lab 2: Largest, Smallest and Count

**Name:** MOHD RAZA   
**Roll No:** 2410303281  
**Student ID:** BCS2024381  
**Course:** BCS553 - Applied Data Structure & Algorithms Lab  
**University:** Invertis University, Bareilly (B.Tech CSE)

## Aim
Find the largest value, the smallest value and count marks above 60.

## Theory
- **Traversal pattern for largest/smallest:** assume the first element is the answer, then compare each next element and update the answer when a better one is found.
- **Counting pattern:** keep a counter and increase it (`count++`) whenever the condition is true.
- All three programs visit each element once, so time is **O(n)** and extra space is **O(1)**.
- Data used: `{45, 67, 80, 52, 90}` gives largest 90, smallest 45 and 3 marks above 60 (67, 80, 90).

## Tasks
### Task 1: Largest value.
File: `task1/Main.java`

Output:
```
Largest: 90
```

### Task 2: Smallest value.
File: `task2/Main.java`

Output:
```
Smallest: 45
```

### Task 3: Count of marks greater than 60.
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
