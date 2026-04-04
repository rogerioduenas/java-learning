# Exercise 9 — Worker with Contracts

## Detailed Description

A system must register workers associated with a department and multiple hourly contracts.

## Required Classes

- `Worker`
- `WorkerLevel` (enum)
- `Department`
- `Contract`

## Attributes

- **Worker**: `name`, `level`, `baseSalary`, `department`, `contracts`
- **Department**: `name`
- **Contract**: `date`, `valuePerHour`, `hours`

## Methods

- Add contract
- Calculate monthly income
- Display worker data

## Business Rules

- A worker can have multiple contracts
- The worker level must be represented by an `enum`
- Monthly income must consider only contracts from the specified month and year
- Output must be built using `StringBuilder`

## Expected Inputs

- Worker data, contracts, and month/year

## Expected Outputs

- Calculated income and worker summary

## Technical Goal

- Apply enum usage, composition, and list-based calculations
