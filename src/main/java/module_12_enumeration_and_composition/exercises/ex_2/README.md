# Exercise 2 — Product Registration with Category

## Detailed Description

A system must register products and associate them with a fixed category.

## Required Classes

- `Product`
- `ProductCategory` (enum)

## Attributes

### Product
- `id`
- `name`
- `price`
- `category` (`ProductCategory`)

## Methods

- Create a product
- Display product data

## Business Rules

- The product category must be represented by an enumeration
- The product price cannot be negative

## Expected Input

- Product ID
- Product name
- Product price
- Product category

## Expected Output

- Product information displayed in the terminal

## Technical Objective

- Reinforce the use of `enum` as a safer alternative to Strings
