# Exercise 3 — Savings Account with Method Overriding

## Detailed Description

A banking system has regular accounts and savings accounts, which follow different rules for the withdrawal operation.

---

## Required Classes

- `Account`
- `SavingsAccount`

---

## Attributes

- **Account**
    - `number`
    - `holder`
    - `balance`

---

## Methods

- Withdraw amount

---

## Business Rules

- Regular accounts charge a **10% withdrawal fee**
- Savings accounts **do not charge any withdrawal fee**
- The withdrawal behavior of the savings account must **override** the one defined in the superclass

---

## Expected Inputs

- Account data
- Withdrawal amount

---

## Expected Output

- Account balance after the withdrawal

---

## Technical Goal

- Reinforce method overriding
- Practice the use of `@Override`
