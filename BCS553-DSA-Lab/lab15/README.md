# Lab 15: Subsets and Arrangements

**Name:** MOHD RAZA  
**Roll No:** 2410303281  
**Student ID:** BCS2024381  
**Course:** BCS553 - Applied Data Structure & Algorithms Lab  
**University:** Invertis University, Bareilly (B.Tech CSE)

## Aim
Generate subsets and permutations with backtracking.

## Theory
- **Backtracking** builds an answer step by step: **choose**, **explore**, then **undo** the choice to try another option.
- **Subsets:** for each element there are two choices, skip it or include it. A set of `n` elements has **2^n** subsets (3 elements give 8).
- **Permutations (arrangements):** at each position try every unused letter, mark it used, recurse, then mark it unused again. `n` letters give **n!** arrangements ("abc" gives 6, "xy" gives 2).
- Both programs use recursion with a base case that prints a complete answer.

## Tasks
### Task 1: Print all subsets of `{1, 2, 3}`.
File: `task1/Main.java`

Output:
```
{}
{3}
{2}
{2, 3}
{1}
{1, 3}
{1, 2}
{1, 2, 3}
```

### Task 2: All arrangements of "abc".
File: `task2/Main.java`

Output:
```
abc
acb
bac
bca
cab
cba
```

### Task 3: All arrangements of "xy".
File: `task3/Main.java`

Output:
```
xy
yx
```

## How to run
```
cd task1
java Main.java
```
Take a screenshot of the output of each task and save it in its task folder.
