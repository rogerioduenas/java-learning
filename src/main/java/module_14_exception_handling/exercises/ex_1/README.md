# Exercise 1 — Order System with Invalid Items

## Detailed Description

An order system must allow the registration of items with a name, quantity, and unit price. While building an order, consistency rules must be enforced to ensure that the final order is valid.

## Required Classes

- `Order`
- `OrderItem`

## Attributes

### Order
- List of items

### OrderItem
- `productName`
- `quantity`
- `unitPrice`

## Methods

### Order
- `addItem(OrderItem item)`
- `calculateTotal()`

## Business Rules

- The item quantity must be greater than zero
- The unit price must be positive
- Invalid items must not be added to the order
- The order must continue accepting new items even after an invalid attempt

## Expected Inputs

- Order item data

## Expected Outputs

- A summary containing all items and the total order value

## Technical Goal

Apply business rule validation with controlled flow interruption
