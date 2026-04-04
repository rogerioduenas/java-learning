# Exercise 5 — Reservation System with Date Conflicts

## Detailed Description

A system manages reservations of a single resource over time.

## Required Classes

- `Reservation`

## Attributes

- `resourceName`
- `startDate`
- `endDate`

## Methods

- `updatePeriod(LocalDate newStart, LocalDate newEnd)`

## Business Rules

- The end date must be later than the start date
- Updates with invalid periods must be rejected
- An invalid reservation must not change the current state

## Expected Inputs

- Dates for update

## Expected Outputs

- Updated reservation data **or**
- A message explaining the business rule error

## Technical Goal

Create and use a domain-specific error
