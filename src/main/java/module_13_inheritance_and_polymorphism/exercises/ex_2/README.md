# Exercise 2 — Outsourced Employee with Inheritance

## Detailed Description

A company needs to register regular employees and outsourced employees, which follow different payment calculation rules.

---

## Required Classes

### `Employee`

### `OutsourcedEmployee`

---

## Attributes

- **Employee**
    - `name`
    - `hours`
    - `valuePerHour`

- **OutsourcedEmployee**
    - `additionalCharge`

---

## Methods

- Calculate payment

---

## Business Rules

- Outsourced employees inherit the data from regular employees
- The base payment is calculated as:  
  **hours × value per hour**
- An outsourced employee receives an additional **10% bonus** over the additional charge

---

## Expected Inputs

- Employee data
- Additional outsourced employee data

---

## Expected Output

- All employee data plus the calculated payment value

---

## Technical Goal

- Apply inheritance
- Reuse code through polymorphism
