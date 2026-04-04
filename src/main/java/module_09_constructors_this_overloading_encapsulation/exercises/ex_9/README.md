# Exercise 9 — Inventory System with Internal State Validation

## Detailed Description

Create a system in which all attributes undergo strict validation within the class. No invalid data can enter the object.

## Required Class

- **InventoryItem**

### Attributes

- `name` (String — private)
- `unitPrice` (double — private)
- `quantity` (int — private)

### Methods

- Default constructor
- Getters and setters with validation
- `increase(int q)`
- `decrease(int q)`
- `getTotalValue()`
- `toString()`

## Rules

- Name cannot be empty
- Negative prices are not allowed
- Quantity cannot go below zero

## Expected Inputs

- Item description
- Unit price
- Initial quantity
- Values for increase and decrease

## Expected Outputs

- Updated inventory reports

## Technical Objective

Reinforce consistent state, strong encapsulation, and internal validation.
