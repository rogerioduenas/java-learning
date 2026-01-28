# Exercise 6 — Order with Status

## Description

The system must register orders and track their current state.

---

## Required Classes

- `Order`
- `OrderStatus` (enum)

---

## Attributes

### Order
- `id`
- `moment`
- `status` (`OrderStatus`)

---

## Methods

- Create an order
- Change the order status
- Display order data

---

## Business Rules

- The order status must be represented using an **enum**
- The order timestamp must be obtained **at the moment of creation**

---

## Expected Inputs

- Order ID
- Initial order status

---

## Expected Output

- Order summary

---

## Technical Objective

- Practice using **enumerations** to control state