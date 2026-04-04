# Exercise 7 — Loan System with Simple Interest

## Detailed Description

A bank operates in multiple countries.  
Each country has a different monthly interest rate.

The standard payment calculation must be available directly within the interface.

---

## Required Classes

- `LoanService`
- `InterestService`
- `BrazilInterestService`
- `JapanInterestService`

---

## Methods

### `InterestService`

- `getInterestRate()`
- `default calculatePayment(double amount, int months)`

---

## Functional Rules

- Payment = `amount + (amount * rate * months)`

---

## Technical Objective

- Use of default methods in interfaces
```