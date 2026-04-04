# Exercise 8 — Multi-Step Payment Processing

## Detailed Description

A system processes an order payment by executing sequential financial steps.

## Required Classes

- `PaymentFlow`

## Attributes

- `orderAmount`
- `taxAmount`
- `finalAmount`

## Methods

- `execute()`
- `calculateTaxes()`
- `chargePayment()`

## Business Rules

- The order amount must be positive
- A 10% tax calculation must occur before charging the payment
- Intermediate steps must not handle failures
- Any failure must interrupt the flow
- Only the `execute()` method decides the final outcome

## Expected Inputs

- Order amount

## Expected Outputs

- Payment confirmation with the final amount
- A message explaining why the payment failed

## Technical Goal

Propagate exceptions to the correct decision point
