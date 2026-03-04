# Exercise 15 — Inventory Control by Product

## Detailed Description

A company controls the total amount invested in inventory per product.  
Each product is identified by its name and price.

The system must correctly verify whether a product is already present in the inventory when attempting to query it.

---

## Required Classes

- `Product`

---

## Attributes

### `Product`

- `String name`
- `Double price`

---

## Main Data Structure

- `Map<Product, Double>`

---

## Functional Rules

- Products with the same name and price represent the same logical item.
- Lookup operations must work correctly even when using different object instances with identical data.
- Proper equality and hashing behavior must be ensured.

---

## Technical Objective

- Use of `Map` with a custom key
- Correct implementation of `equals` and `hashCode`