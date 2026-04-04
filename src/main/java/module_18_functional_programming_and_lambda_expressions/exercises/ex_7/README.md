## EXERCISE 7 — Energy Consumption Statistics

### Detailed Description

An energy company stores the monthly consumption of several clients.

The system needs to generate statistics for analysis.

---

### Required Classes

#### EnergyUsage

**Attributes**

- `String client`
- `Double consumption`

**Methods**

- constructor
- getters

---

### Operating Rules

The system must calculate:

- average consumption
- highest consumption
- number of clients analyzed

---

### Expected Inputs

List of consumption records.

---

### Expected Outputs

Average consumption
Highest consumption
Total clients


---

### Technical Objective

Use of terminal stream operations (`average`, `max`, `count`, or equivalents).