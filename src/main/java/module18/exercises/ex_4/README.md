## EXERCISE 4 — Simplified Product Report Generation

### Detailed Description

An inventory system needs to generate a simplified version of a product report.

The original list contains several pieces of information, but the report requested by the sales department only needs:

- product name
- uppercase version

The report must be produced from the original list.

---

### Required Classes

#### Product

**Attributes**

- `String name`
- `Double price`
- `Integer stockQuantity`

**Methods**

- constructor
- getters

---

### Operating Rules

The system receives a list of products.

A new list containing only the names must be generated.

The names must be converted to uppercase.

---

### Expected Inputs

List of products.

---

### Expected Outputs

List of names in uppercase.

---

### Technical Objective

Use of `Function` to transform elements of a collection into another type of result.