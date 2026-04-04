## Exercise 10 — Order Processing with Domain Error and System Error

### Detailed Description

A system processes customer orders before confirming them.  
During processing, an order may fail due to **invalid order conditions** or **unexpected system failures**.

---

### Required Classes

- `Order`
- `OrderService`
- `DomainError`

---

### Attributes

**Order**
- `id`
- `status`

**OrderService**
- list of processed orders

---

### Methods

**OrderService**
- `process(Order order)`

---

### Business Rules

- Orders with status `CANCELLED` must not be processed
- Orders with status `COMPLETED` must not be processed again
- Violations of these rules must throw a `DomainError`
- Any other exception must be treated as an unexpected system failure
- Unexpected failures must not expose technical details
- The system must not terminate after any failure

---

### Expected Inputs

- Order to be processed

---

### Expected Outputs

- Processing confirmation  
  or
- Domain error message  
  or
- Generic error message

---

### Technical Goal

Explicit separation between domain errors and unexpected system failures, ensuring system stability
