# Exercise 10 — Complete Order Report

## Description

A system must generate a complete textual report of a placed order.

## Required Classes

- `Order`
- `OrderStatus` (enum)
- `Client`
- `OrderItem`
- `Product`

## Attributes

### Order
- `moment`
- `status`
- `client`
- `items`

### Client
- `name`
- `email`

### OrderItem
- `quantity`
- `product`

### Product
- `name`
- `price`

## Required Methods

- Add item to the order
- Calculate total order value
- Generate order summary report

## Business Rules

- The report must contain:
    - Client data
    - Order status
    - Ordered items
    - Total order value
- The report must be assembled **exclusively using `StringBuilder`**

## Expected Input

- Complete order data

## Expected Output

- A detailed textual order report

## Technical Objective

- Practice the use of:
    - Enums
    - Object composition
    - Textual report generation using `StringBuilder`
