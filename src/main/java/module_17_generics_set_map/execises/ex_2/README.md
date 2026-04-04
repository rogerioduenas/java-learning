# Exercise 2 — Generic Service for Finding the Maximum Element

## Detailed Description

A financial consulting company needs a reusable service capable of determining the largest element within a list of comparable entities (products, contracts, proposals, etc.).

---

## Required Classes

- `MaxService`
- Comparable domain entity

---

## Attributes

- No mandatory attributes beyond the entity’s own data.

---

## Methods

### `MaxService`

```java
static <T extends Comparable<T>> T max(List<T> list)
```

---

## Functional Rules

- The list must not be empty.
- The comparison must be delegated to the object itself (via `compareTo`).

---

## Expected Input

- List of comparable objects.

---

## Expected Output

- The object considered the largest according to its comparison rule.

---

## Technical Objective

- Use of bounded type parameter `<T extends Comparable<T>>`