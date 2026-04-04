# Exercise 8 — Generic Ranking System

## Detailed Description

A platform needs to rank any type of entity that has a comparison criterion.

---

## Required Classes

- `RankingService<T extends Comparable<T>>`

---

## Methods

### `RankingService<T extends Comparable<T>>`

```java
List<T> sort(List<T> list)
```

---

## Functional Rules

- Sorting must depend on the object’s own comparison logic (`compareTo`).

---

## Technical Objective

- Generic class with bounded type restriction