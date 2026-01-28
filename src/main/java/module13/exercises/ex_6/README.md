# Exercise 6 — Deliveries Using an Abstract Class

## Detailed Description

The system has decided that generic deliveries should no longer exist; only specific delivery types are allowed.

---

## Required Classes

- `Delivery` (abstract)
- `ExpressDelivery`
- `PromotionalDelivery`

---

## Attributes

- **Delivery**
    - `id`
    - `destination`
    - `baseCost`

---

## Methods

- Calculate final cost

---

## Business Rules

- The base class must not be instantiable
- All deliveries must inherit from the abstract class
- Cost calculation must work through polymorphism

---

## Expected Inputs

- Delivery data

---

## Expected Outputs

- Calculated final costs

---

## Technical Goal

- Apply abstract classes to enforce full inheritance
