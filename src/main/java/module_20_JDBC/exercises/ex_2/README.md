## EXERCISE 2 — Stock Update

### Detailed Description

A company needs to control product inventory. The system must allow registering products, updating the stock quantity, and querying a specific product.

---

### Required Classes

- DB
- DBException
- DBIntegrityException
- Product
- Program

---

### Attributes

#### Product

- `Long id`
- `String name`
- `Integer quantity`

---

### Methods

- insert product
- update quantity
- find product by id

---

### Operating Rules

Negative quantity is not allowed.

Updates must be reflected in the database.

Queries must return the most recent data.

---

### Expected Inputs

- product data
- id for search
- new quantity

---

### Expected Outputs

updated product
search result

---

### Technical Objective

Use of `UPDATE`, parameterized `SELECT`, and data handling.