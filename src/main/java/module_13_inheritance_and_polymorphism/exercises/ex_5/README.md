# Exercise 5 — Polymorphism with Geometric Shapes

## Detailed Description

A system needs to calculate the area of different geometric shapes stored in a single collection.

---

## Required Classes

- `Shape`
- `Rectangle`
- `Circle`

---

## Attributes

- **Shape**
    - `color`

- **Rectangle**
    - `width`
    - `height`

- **Circle**
    - `radius`

---

## Methods

- Calculate area

---

## Business Rules

- All shapes must be stored in a list of the superclass type
- The area calculation must respect the actual type of the shape
- No manual type checking must be used

---

## Expected Inputs

- List of shapes

---

## Expected Output

- Calculated area of each shape

---

## Technical Goal

- Introduce polymorphism
- Practice method dispatch at runtime
