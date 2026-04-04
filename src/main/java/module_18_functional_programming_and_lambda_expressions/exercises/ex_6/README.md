## EXERCISE 6 — Industrial Sensor Monitoring

### Detailed Description

A factory monitors sensors that record equipment temperatures.

The system needs to identify critical readings.

---

### Required Classes

#### SensorReading

**Attributes**

- `String equipment`
- `Double temperature`

**Methods**

- constructor
- getters

---

### Operating Rules

The system must:

- select readings above a temperature limit
- sort the readings from highest to lowest
- display the equipment with overheating risk

---

### Expected Inputs

List of readings.

Temperature limit.

---

### Expected Outputs

List of critical readings sorted.

Equipment - Temperature

---

### Technical Objective

Combined use of streams, `filter`, and `sorted`.