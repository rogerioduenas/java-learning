## EXERCISE 8 — Reservation System

### Detailed Description

A hotel needs to manage room reservations.

---

### Required Classes

- Reservation
- ReservationDao
- DaoFactory

---

### Attributes

#### Reservation

- `Long id`
- `String guestName`
- `Integer roomNumber`
- `Date checkIn`
- `Date checkOut`

---

### Methods

- insert reservation
- cancel reservation
- list reservations

---

### Operating Rules

Overlapping reservations are not allowed.

---

### Expected Inputs

- reservation data

---

### Expected Outputs

reservation list

---

### Technical Objective

Validation and persistence.