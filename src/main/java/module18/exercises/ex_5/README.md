## EXERCISE 5 — Sales Revenue Analysis

### Detailed Description

A company has records of sales made by its sellers.

Each sale has:

- seller name
- sale value

The system must generate commercial indicators based on this data.

---

### Required Classes

#### Sale

**Attributes**

- `String seller`
- `Double value`

**Methods**

- constructor
- getters

---

### Operating Rules

The system must:

- select sales above a minimum value
- extract only the values of those sales
- calculate the total revenue

---

### Expected Inputs

List of sales.

Minimum value.

---

### Expected Outputs

Total sales considered: X

Total revenue: Y

---

### Technical Objective

Use of a stream pipeline with `filter`, `map`, and `reduce`.