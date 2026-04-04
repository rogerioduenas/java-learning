## EXERCISE 2 — Delivery Order Filtering

### Detailed Description

A logistics company maintains a list of orders that need to be shipped.

Each order has:

- client
- destination city
- order value
- delivery priority

The system must allow automatically removing orders that do not meet certain operational criteria defined by the company.

---

### Required Classes

#### DeliveryOrder

**Attributes**

- `String client`
- `String destinationCity`
- `Double orderValue`
- `Integer priorityLevel`

**Methods**

- constructor
- getters

---

### Operating Rules

The system must allow applying rules such as:

- remove orders with value below a minimum
- remove orders from certain cities
- remove orders with very low priority

The filtering must be performed directly on the existing list.

---

### Expected Inputs

List of orders.

Filtering criteria:

- minimum value
- prohibited city
- minimum priority

---

### Expected Outputs

List of remaining orders after filtering.

---

### Technical Objective

Use of `Predicate` applied to collections for element filtering.