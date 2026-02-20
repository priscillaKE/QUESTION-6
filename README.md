# QUESTION-6

## Contents
- `src/leapmonth.java` - Java program that checks whether a given month is a leap month.

## What the program does
- Prompts for `year` and `month`.
- Validates month range (1 to 12).
- Uses leap-year boolean logic:
  - Divisible by 4
  - Not divisible by 100
  - Or divisible by 400
- Reports leap month status (February in a leap year).

## Compile and run
```powershell
cd src
javac leapmonth.java
java leapmonth
```

## Sample
Input:
- Year: 2024
- Month: 2

Output:
- Month 2 in year 2024 is a leap month.
