# Exercise 5 — Restricted Total Calculation by Numeric Type

## Detailed Description

A financial system needs to calculate the total of a list of numeric values, which may include integers, decimals, or other numeric types.

---

## Required Classes

- `FinanceService`

---

## Methods

### `FinanceService`

```java
static double sum(List<? extends Number> list)
```

---

## Functional Rules

- The method must accept any numeric subtype.
- Only read operations are allowed (no insertion).

---

## Technical Objective

- Covariance — `? extends Number`