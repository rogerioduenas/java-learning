# Exercise 9 — Generic Filter by Criterion

## Detailed Description

Create a service capable of filtering elements from any list based on an external criterion.

---

## Required Classes

- `FilterService`

---

## Methods

### `FilterService`

```java
static <T> List<T> filter(List<T> list, Predicate<T> condition)
```

---

## Technical Objective

- Generic method with functional parameter
```