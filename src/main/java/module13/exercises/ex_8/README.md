# Exercise 8 — Internal Reservation System

## Detailed Description

A company needs to manage reservations of internal resources.  
Reservations can be **common** or **priority**, and each type follows different cost rules.

The system must be designed using **abstraction, inheritance, and polymorphism**.

---

## Required Classes

### `Reservation` (abstract)

### `CommonReservation`

### `PriorityReservation`

---

## Attributes

### `Reservation`
- `resourceName`
- `duration`
- `costPerHour`

### `PriorityReservation`
- `extraCost`

---

## Methods

- Calculate the total cost of the reservation

---

## Business Rules

- Every reservation has a base cost that depends on its duration and hourly rate
- Priority reservations have an additional cost on top of the base cost
- Each reservation type is responsible for calculating its own total cost
- The calculation must be performed **polymorphically**
- The base class must define an abstract method for cost calculation

---

## Expected Input

- A list of reservations (common and priority)

---

## Expected Output

- The total cost of each reservation

---

## Technical Objective

Practice **abstract classes**, **method overriding**, and **polymorphism** by modeling different business rules within the same domain.
