# Exercise 3 — Installment Payment System

## Detailed Description

A system processes installment payments based on a total amount and the number of installments.

## Required Classes

- `InstallmentPayment`

## Attributes

- `totalAmount`
- `numberOfInstallments`

## Methods

- `calculateInstallmentValue()`

## Business Rules

- The total amount must be positive
- The number of installments must be greater than zero
- Invalid values must not be used for division

## Expected Inputs

- Total amount
- Number of installments

## Expected Outputs

- A summary containing the total amount, number of installments, and the value of each installment
- A message explaining why the calculation could not be performed

## Technical Goal

Interrupt processing when preconditions are not met
