# Exercise 13 — Ordered Product Catalog System

## Detailed Description

A store wants to maintain an automatically ordered product catalog sorted by product name.

---

## Required Classes

- `Product`

---

## Attributes

### `Product`

- `String name`
- `Double price`

---

## Methods

### `Product`

- `compareTo(Product other)`
- `equals(Object obj)`
- `hashCode()`

---

## Functional Rules

- The catalog must remain automatically ordered.
- Products with the same name must be considered equal.
- The natural ordering must be based on the product name.

---

## Expected Input

- Registration of multiple products.

---

## Expected Output

- Automatically ordered listing of products.

---

## Technical Objective

- Use of `TreeSet`
- Natural ordering implementation (`Comparable`)
- Consistency between `compareTo`, `equals`, and `hashCode`