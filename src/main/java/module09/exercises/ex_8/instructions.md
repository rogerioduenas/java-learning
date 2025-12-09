# Exercise 8 — Bank with Withdrawal Rules and Strict Encapsulation

## Detailed Description

Reformulate the teacher's exercise: implement a banking system with accounts that have an immutable number, a mutable holder, and a balance managed only through deposits and withdrawals with a fixed fee.

## Required Class

- **BankAccount**

### Attributes

- `number` (int — immutable)
- `holder` (String — private)
- `balance` (double — private)

### Methods

- Constructor with number, holder, and optional initial deposit
- Getter for `number` and `balance`
- Getter/setter for `holder`
- `deposit(double amount)`
- `withdraw(double amount)` (includes fixed fee)

## Rules

- A fixed fee is applied to every withdrawal.
- The balance can be negative.
- The account number never changes.

## Expected Inputs

- Account number
- Holder
- Initial deposit (optional)
- Deposit amounts
- Withdrawal amounts

## Expected Outputs

- Account state after each operation

## Technical Objective

Reinforce encapsulation, overloaded constructors, and partial immutability.
