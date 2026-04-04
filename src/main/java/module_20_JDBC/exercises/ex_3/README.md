## EXERCISE 3 — Order Management

### Detailed Description

An order system must allow registering orders and removing them when canceled.

---

### Required Classes

- DB
- DBException
- DBIntegrityException
- Order
- Program

---

### Attributes

#### Order

- `Long id`
- `String clientName`
- `Double total`

---

### Methods

- insert order
- delete order
- list orders

---

### Operating Rules

Orders must be persisted.

Deletion must remove the record from the database.

Listing must reflect the current state.

---

### Expected Inputs

- order data
- id for deletion

---

### Expected Outputs

order list

---

### Technical Objective

Use of `DELETE` and full JDBC flow handling.