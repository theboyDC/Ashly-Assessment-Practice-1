# Assessment 000 - Java Fundamentals & Problem Solving (Syntax)

## Learning Outcomes Assessed

- Understanding of basic Java syntax
- Conditional statements
- Methods and return types
- Basic loops
- Simple algorithms (problem-solving)

---

## Project Structure

```
fundamentals-assessment/
├── src/
│   ├── main/
│   │   └── java/za/co/wethinkcode/
│   │       └── Fundamentals.java          # <-- This is where you write your solutions
│   └── test/
│       └── java/za/co/wethinkcode/
│           └── FundamentalsTest.java      # <-- These are the tests you must make pass
├── answers.txt                            # <-- Write your long-format answers here
└── README.md                              # <-- Assessment instructions (this file)
```

---

## Assessment Structure

This assessment has two sections:

- [Coding Assessment](#coding-assessment) — fix and complete methods in `Fundamentals.java`
- [Comprehension Questions](#comprehension-question-section) — written responses in `answers.txt`

You can answer them in any order.

---

## Scoring & Weighting

| Component                   | Weight  |
| --------------------------- | ------- |
| Coding Section (unit tests) | **40%** |
| Comprehension Section       | **60%** |

### Coding Section

Your coding score is determined by the number of tests you pass.

Let:
- T = total number of coding tests
- P = number of tests you pass

```
Coding Score = (P / T) × 40%
```

### Comprehension Section

Your comprehension score is determined by the quality and correctness of your written responses in `answers.txt`.

Let:
- Q = total marks available across all comprehension questions
- C = marks earned

```
Comprehension Score = (C / Q) × 60%
```

### Final Score & Pass Mark

```
Final Score = Coding Score + Comprehension Score
```

To pass, your Final Score must be **60% or higher**.

---

## How to Run Your Tests

To compile and run all your tests:

```bash
mvn clean compile test
```

---

## Coding Assessment

This assessment consists of four Java methods inside the `Fundamentals` class. Each method has a partially written implementation. Your task is to **fix the bugs**, **complete the missing logic**, and **ensure all tests pass**.

---

### Question 1 — `isPrime(int n)`

This method must:

- Return `true` if `n` is a prime number, `false` otherwise
- Handle edge cases: numbers less than 2 are not prime

The code contains syntax errors, a logical error in the loop bound, and a wrong return value. Fix all of them.

```java
public static boolean isPrime(int n) {}
```

---

### Question 2 — `sumArray(int[] arr)`

This method must:

- Return the sum of all elements in the array
- Return `0` if the array is null or empty

Fix the null check, the loop bound, and the compound assignment error.

```java
public static int sumArray(int[] arr) {}
```

---

### Question 3 — `categoriseScore(int score)`

This method must return a grade string based on the score:

| Score         | Grade           |
| ------------- | --------------- |
| 90 – 100      | `"Distinction"` |
| 75 – 89       | `"Merit"`       |
| 50 – 74       | `"Pass"`        |
| 0 – 49        | `"Fail"`        |
| Outside 0–100 | `"Invalid"`     |

Fill in the blank conditions and ensure the ranges do not overlap.

```java
public static String categoriseScore(int score) {}
```

---

### Question 4 — `countVowels(String s)`

Complete the method body so that it:

- Returns the number of vowels (`a e i o u`, upper or lower case) in the string
- Returns `0` for a null or empty string

No starter code is provided — write the full method body.

```java
public static int countVowels(String s) {}
```

---

## Comprehension Question Section

Please answer these in `answers.txt`. **Do not remove the comments and do not change the format.**

---

### Comprehension Question 1 — IDEs (5 Points)

Your team lead at a Johannesburg startup is putting together an onboarding guide for new developers joining the team. They have asked you to write the section on development environment setup — specifically, why the team uses an IDE rather than a plain text editor.

Write that section of the onboarding guide. Make sure it covers what an IDE is, what makes it valuable to a developer on a daily basis, and which IDEs are commonly used.

---

### Comprehension Question 2 — Version Control (5 Points)

You are doing a code review with a teammate who has just introduced a change that broke a feature that was working perfectly last week. Your tech lead turns to you and says: "This is exactly why we use version control properly — walk them through it."

Walk your teammate through how version control works and how it would have helped in this situation. Your explanation should touch on how changes are tracked over time, the difference between a local and remote repository, and what `git add` does and why it is a necessary step.

---

### Comprehension Question 3 — Build Tools (10 Points)

You have just joined a new team and noticed that nobody compiles or runs the project the same way. Your tech lead asks you to write an internal document making the case for why the team should standardise on Maven.

Write that internal document. It should cover what a build tool is, what problem it solves, what Maven brings to the project specifically, and what key commands the team would be using day to day.

---

### Comprehension Question 4 — Constructors (5 Points)

A teammate who has been learning Java for a few weeks has noticed that some classes have a method with the same name as the class itself, and sometimes there are multiple versions of it. They have no idea what these are or why there would ever be more than one.

Explain constructors to your teammate. Cover what a constructor does, the difference between a default and a parameterised constructor, and when you would define your own.

---

### Comprehension Question 5 — Object-Oriented Programming (10 Points)

Your team is building a student records system. A teammate who is new to Java has suggested storing everything in arrays at the top of the program — student names in one array, their marks in another, their IDs in another.

Using this system as your example, explain object-oriented programming and make the case for why it is a better approach. Your explanation should cover what OOP is, what a class is and how it acts as a blueprint, and the difference between an object and an instance.

---

Good luck — think carefully about your loops, conditions, types, and syntax!