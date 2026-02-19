# Exercise 2 — Contract Processing with Online Payment Service

## Detailed Description

A company generates monthly installments for contracts signed with clients.  
Each installment is subject to:

- Monthly simple interest

The payment service may vary (PayPal, Stripe, etc.).

---

## Required Classes

- `Contract`
- `Installment`
- `ContractService`
- `OnlinePaymentService`
- `PaypalService`
- `StripeService`

---

## Attributes

### `Contract`

- `number`
- `date`
- `totalValue`
- `installments`

### `Installment`

- `dueDate`
- `amount`

### `ContractService`

- `onlinePaymentService`

---

## Methods

### `ContractService`

- `processContract(Contract contract, int months)`

### `OnlinePaymentService`

- `paymentFee(double amount)`

---

## Functional Rules

- Each installment = total value divided by the number of months.
- Apply monthly interest rate.
- The first installment is due one month after the contract date.
- The payment service implementation must be interchangeable.

---

## Expected Input

- Contract number
- Contract date
- Total value
- Number of installments
- Selected payment service

---

## Expected Output

- List of installments with due date and final amount

---

## Technical Objective

- Interface as a contract
- Inversion of Control (IoC)
- Dependency injection
