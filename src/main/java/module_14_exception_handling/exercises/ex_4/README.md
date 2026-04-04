# Exercise 4 — Inventory Control with Invalid Withdrawals

## Detailed Description

A system manages the available quantity of products in stock and allows withdrawals.

## Required Classes

- `Stock`

## Attributes

- `productName`
- `quantityAvailable`

## Methods

- `withdraw(int amount)`

## Business Rules

- It is not allowed to withdraw a quantity greater than the available stock
- It is not allowed to withdraw negative values
- The stock quantity must never become negative

## Expected Inputs

- Withdrawal amount

## Expected Outputs

- Remaining stock quantity **or**
- A message explaining why the withdrawal failed

## Technical Goal

Protect the internal state of the class against invalid operations
