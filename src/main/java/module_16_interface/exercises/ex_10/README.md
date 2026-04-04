# Exercise 10 — Product Ranking System

## Detailed Description

An online store needs to display a ranking of the most relevant products.

Each product has:

- Name
- Price
- Quantity sold

The system must allow products to be sorted according to multiple priority criteria.

The sorting must strictly follow this rule:

1. Higher quantity sold first (descending order)
2. If tied, lower price first (ascending order)
3. If still tied, sort by name in alphabetical order

The `Product` class must implement `Comparable<Product>`.

---

## Required Classes

- `Product`

---

## Attributes

### `Product`

- `name`
- `price`
- `quantitySold`

---

## Methods

### `Product`

- `compareTo(Product other)`

The logic must:

- Compare quantity sold (descending)
- If equal, compare price (ascending)
- If still equal, compare name (alphabetical order)

---

## Functional Rules

- It is not allowed to use an external `Comparator`.
- The logic must be implemented directly inside the `compareTo` method.
- The sorting must work correctly with `Collections.sort()` or `Arrays.sort()`.

---

## Expected Input

List of products containing:

- Name
- Price
- Quantity sold

---

## Expected Output

- List sorted according to the defined criteria

---

## Technical Objective

- Implementation of `Comparable`
- Multi-criteria chained sorting
- Proper comparison of primitive types and `String`
- Practical application of sorting in a real-world domain