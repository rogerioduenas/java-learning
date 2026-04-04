# Exercise 3 — Evaluation Service with Flexible Comparison

## Detailed Description

A company wants a service capable of finding the best candidate in a list, even if the comparison rule is defined in a superclass of the entity.

---

## Required Classes

- `EvaluationService`
- Comparable base class
- Derived class

---

## Methods

### `EvaluationService`

```java
static <T extends Comparable<? super T>> T best(List<T> list)
```

---

## Functional Rules

- The method must accept types whose `compareTo` implementation is defined in a superclass.
- The list must not be empty.

---

## Technical Objective

- Use of `Comparable<? super T>`