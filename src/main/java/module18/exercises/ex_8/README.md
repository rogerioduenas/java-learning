## EXERCISE 8 — Subscription File Processing

### Detailed Description

A digital platform maintains a file containing user subscriptions.

Each line contains:

name,subscription_value

The system must process the file and generate reports.

---

### Required Classes

#### Subscription

**Attributes**

- `String name`
- `Double value`

**Methods**

- constructor
- getters

---

### Operating Rules

The system must:

- calculate the average subscription value
- list the names of clients whose value is below the average
- sort the names in descending order

---

### Expected Inputs

CSV file containing subscriptions.

---

### Expected Outputs

Average value: X
Clients below average:
NAME
NAME
NAME

---

### Technical Objective

Use of streams applied to data read from a file and sorting with a pipeline.