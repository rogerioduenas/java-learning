# Exercise 6 — Passing the Current Object

## Detailed Description

Implement a system where an object sends itself as a parameter to another object responsible for generating a report.

## Required Classes

- **Order**
- **OrderReport**

## Attributes

- **Order:** `id`, `totalValue`
- **OrderReport:** no mandatory attributes

## Methods

- **In Order:** `generateReport()`
- **In OrderReport:** `print(Order order)`

## Rules

- `generateReport()` must call `new OrderReport().print(this)`
- The report must display the data of the sent order

## Expected Inputs

- ID
- Total value

## Expected Outputs

- Order report

## Technical Objective

Reinforce the use of `this` as an argument and object-to-object communication.
