## EXERCISE 9 — Financial Transaction Validation

### Detailed Description

A financial system processes a list of transactions.

Each transaction has:

- identifier
- amount

The system must verify security conditions before approving a batch of transactions.

---

### Required Classes

#### Transaction

**Attributes**

- `String id`
- `Double amount`

**Methods**

- constructor
- getters

---

### Operating Rules

The system must verify:

- if there is any transaction above a limit
- if all transactions have a positive value
- if no transaction has a value equal to zero

---

### Expected Inputs

List of transactions.

Maximum limit.

---

### Expected Outputs

Validation report:

There is a transaction above the limit: true/false
All are positive: true/false
None is zero: true/false

---

### Technical Objective

Use of verification operations (`anyMatch`, `allMatch`, `noneMatch`) in streams.