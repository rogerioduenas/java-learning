## EXERCISE 10 — Production Sequence Generation

### Detailed Description

A production line uses a system that automatically generates sequential identifiers for produced batches.

The system must generate a sequence of numbers representing the next batches that will be manufactured.

---

### Required Classes

#### ProductionBatch

**Attributes**

- `Long batchNumber`

**Methods**

- constructor
- getter

---

### Operating Rules

The sequence starts from an initial value.

Each batch increments the previous number.

The system must generate only a limited number of identifiers.

---

### Expected Inputs

Initial batch number.

Number of batches to generate.

---

### Expected Outputs

Batch identifier sequence:

1001
1002
1003
1004
...

---

### Technical Objective

Use of stream creation through iterative generation (`Stream.iterate`) and sequence limitation.