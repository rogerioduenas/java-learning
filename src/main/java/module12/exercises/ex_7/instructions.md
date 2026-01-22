# Exercise 7 — Order with Items

## Detailed Description

A system must register orders composed of multiple items.

## Required Classes

- `Order`
- `OrderItem`
- `Product`

## Attributes

- **Order**: `moment`, `items`
- **OrderItem**: `quantity`, `product`
- **Product**: `name`, `price`

## Methods

- Add item to the order
- Calculate total
- Display order summary

## Business Rules

- An order can contain multiple items
- Each item is associated with a product
- The order total must be calculated based on its items
- The order summary must be built using `StringBuilder`

## Expected Inputs

- Product data and quantities

## Expected Outputs

- Order summary with total amount

## Technical Goal

- Reinforce composition and data aggregation
