# Exercise 17 — Transaction History System

## Detailed Description

A fintech records financial transactions.  
The system must prevent duplicate transactions that share the same unique identifier.

---

## Required Classes

- `Transaction`

---

## Attributes

### `Transaction`

- `String transactionId`
- `Double amount`

---

## Main Data Structure

- `Set<Transaction>`

---

## Functional Rules

- The identity of a transaction is defined solely by `transactionId`.
- Transactions with the same `transactionId` must be considered equal.
- The system must guarantee uniqueness using proper equality rules.

---

## Technical Objective

- Ensuring uniqueness through correct implementation of `equals` and `hashCode`
- Use of `Set` to prevent duplicates