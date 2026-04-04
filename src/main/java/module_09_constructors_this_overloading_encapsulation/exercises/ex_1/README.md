# Exercise 1 — Product Registration with Mandatory Constructor

## Detailed Description

Implement a product registration system that requires the user to provide a **name** and **price** when creating the object.  
The **quantity** is optional and should default to zero if not provided.  
The system should display the product data and allow increments and decrements in stock.

## Required Classes

- **Product**

## Attributes

- `name` (String)
- `price` (double)
- `quantity` (int)

## Methods

- Mandatory constructor with parameters `name` and `price`.
- Optional constructor with parameters `name`, `price`, and `quantity`.
- `addProducts(int qty)`
- `removeProducts(int qty)`
- `totalValueInStock()`
- `toString()`

## Rules

- Product cannot be created without a name and price.
- Quantity defaults to zero if not provided.
- Stock can only be increased or decreased through specific methods.

## Expected Inputs

- Product name
- Price
- Quantity (optional)
- Quantity to add
- Quantity to remove

## Expected Outputs

- Updated product data after each operation.

## Technical Objective

Reinforce **custom constructors**, **constructor overloading**, and the use of **mandatory attributes**.
