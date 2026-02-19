# Exercise 3 — Multichannel Payment Platform

## Detailed Description

An e-commerce platform accepts different payment methods:

- Credit card
- Instant Payment
- Bank Invoice

Each payment method has its own fee calculation rules.

An order must be completed without knowing the implementation details of the payment method.

---

## Functional Rules

- Credit card → 2.5% fee
- Instant → 0% fee
- Bank Invoice → Fixed fee of 3.00

---

## Expected Input

- Order amount
- Payment type

---

## Expected Output

- Final amount including fees

---

## Technical Objective

- Contract-based polymorphism
- Full decoupling of the main class
