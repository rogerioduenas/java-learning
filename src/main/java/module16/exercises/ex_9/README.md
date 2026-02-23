# Exercise 9 — Conflict of Calculation Rules

## Detailed Description

A financial calculator must compute interest on both a monthly and annual basis.

For this purpose, two distinct interfaces were defined:

- `MonthlyInterestCalculator`
- `AnnualInterestCalculator`

Both interfaces contain a default method:

```
double calculate(double amount)
```

Each interface defines its own default interest calculation logic.

When creating a concrete class called `FinancialCalculator` that implements both interfaces simultaneously, a conflict occurs because both interfaces define the same default `calculate` method.

The concrete class must explicitly resolve this conflict.

---

## Required Classes

- `MonthlyInterestCalculator`
- `AnnualInterestCalculator`
- `FinancialCalculator`

---

## Methods

### `MonthlyInterestCalculator`

- `default double calculate(double amount)`

**Rule:**

- 2% interest per month

---

### `AnnualInterestCalculator`

- `default double calculate(double amount)`

**Rule:**

- 12% interest per year

---

### `FinancialCalculator`

- `double calculate(double amount)`  
  Must override the method due to the conflict.

  It may:
    - Choose one implementation
    - Or combine both

- `double calculateMonthly(double amount)`

- `double calculateAnnual(double amount)`

These methods must explicitly call the default implementation of each interface using:

```
InterfaceName.super.calculate(amount)
```

---

## Functional Rules

- When implementing two interfaces with identical default methods, the concrete class is required to override the method.
- The override may:
    - Choose one implementation
    - Or combine both
- The use of `InterfaceName.super.method()` is mandatory to access specific interface implementations.

---

## Expected Input

- Base amount (`double`)

---

## Expected Output

- Amount with monthly interest
- Amount with annual interest

---

## Technical Objective

- Understand default method conflicts
- Mandatory method overriding
- Explicit use of `Interface.super.method()`
- Understanding ambiguity resolution in multiple inheritance via interfaces