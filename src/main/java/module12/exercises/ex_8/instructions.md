# Exercise 8 — Order with Client, Items, and Status

## Detailed Description

A system must register orders placed by clients, including their status and items.

## Required Classes

- `Order`
- `OrderStatus` (enum)
- `Client`
- `OrderItem`
- `Product`

## Attributes

- **Order**: `moment`, `status`, `client`, `items`
- **Client**: `name`, `email`
- **OrderItem**: `quantity`, `product`
- **Product**: `name`, `price`

## Methods

- Add item
- Calculate total
- Generate order summary

## Business Rules

- An order must be associated with a client
- The order status must be represented by an `enum`
- The order summary must be formatted using `StringBuilder`

## Expected Inputs

- Client, order, and item data

## Expected Outputs

- Complete order summary

## Technical Goal

- Integrate enum usage, composition, and output formatting
