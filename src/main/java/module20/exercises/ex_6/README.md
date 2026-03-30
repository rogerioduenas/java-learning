## EXERCISE 6 — Order System with Items

### Detailed Description

A system must manage orders and their items.

---

### Required Classes

- Order
- Item
- OrderDao
- DaoFactory

---

### Attributes

#### Order

- `Long id`
- `String customerName`

#### Item

- `Long id`
- `String name`
- `Integer quantity`
- `Double price`

---

### Methods

- insert order with items
- find complete order

---

### Operating Rules

An order can have multiple items.

Queries must return all associated items.

---

### Expected Inputs

- order and item data

---

### Expected Outputs

complete order

---

### Technical Objective

One-to-many (1:N) relationship and aggregation.