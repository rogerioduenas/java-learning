## EXERCISE 3 — Collective Tuition Fee Adjustment

### Detailed Description

A school has a list of students enrolled in courses.

From time to time it is necessary to apply tuition fee adjustments for all students in a class.

The system must automatically apply a percentage increase to the existing monthly fees.

---

### Required Classes

#### Student

**Attributes**

- `String name`
- `String course`
- `Double monthlyFee`

**Methods**

- constructor
- getters
- monthly fee update method

---

### Operating Rules

The system receives a list of students.

An adjustment percentage is provided.

All monthly fees must be updated.

After the adjustment, the complete list must be displayed.

---

### Expected Inputs

List of students.

Adjustment percentage.

---

### Expected Outputs

List of students with updated monthly fee.

Name - Course - Monthly Fee

---

### Technical Objective

Use of `Consumer` to apply operations to all elements of a collection.