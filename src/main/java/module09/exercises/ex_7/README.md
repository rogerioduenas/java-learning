# Exercise 7 — Access Control with Different Modifiers

## Detailed Description

Implement a module with classes in different packages, demonstrating the correct use of `private`, `public`, `protected`, and default (package-private) modifiers.

## Required Classes

- **Vehicle** (package A)
- **Car** (package A)
- **Truck** (package B — extends Vehicle)

## Attributes

- `brand` (public)
- `model` (protected)
- `year` (default / package-private)
- `secretCode` (private)

## Methods

- Getters and setters for allowed attributes
- `toString()`

## Rules

- Demonstrate which attributes each class can access, considering different packages.
- `secretCode` can only be manipulated within the `Vehicle` class.

## Expected Inputs

- Complete vehicle data

## Expected Outputs

- Print the accessible attributes for each class

## Technical Objective

Reinforce access modifiers and visibility across packages.
