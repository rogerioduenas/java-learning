# Exercise 4 — Imported Product Using `super`

## Detailed Description

Imported products follow special pricing rules, based on the price of a regular product with additional charges applied.

---

## Required Classes

- `Product`
- `ImportedProduct`

---

## Attributes

- **Product**
    - `name`
    - `price`

- **ImportedProduct**
    - `customsFee`

---

## Methods

- Generate price tag

---

## Business Rules

- The base price must be reused from the superclass
- The import fee must be added to the base price
- The superclass implementation must be explicitly called

---

## Expected Inputs

- Imported product data

---

## Expected Output

- Formatted price tag

---

## Technical Goal

- Reinforce the use of the `super` keyword in overridden methods
