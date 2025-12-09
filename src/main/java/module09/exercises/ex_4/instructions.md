# Exercise 4 — Full Encapsulation of Sensitive Attributes

## Detailed Description

Implement a pharmacy product class with all attributes private.  
Manipulation should occur only through getters and setters with proper validations.

## Required Classes

- **Medicine**

## Attributes

- `name` (String — private)
- `price` (double — private)
- `quantity` (int — private)

## Methods

- Getters and setters with the following rules:
    - Price cannot be negative
    - Name cannot be empty
- `addStock(int q)`
- `removeStock(int q)`
- `toString()`

## Rules

- Invalid data should not be allowed in the object.
- Quantity cannot be changed via setter — only through stock methods.

## Expected Inputs

- Name
- Price
- Initial quantity

## Expected Outputs

- Formatted medicine data

## Technical Objective

Reinforce encapsulation, JavaBeans conventions, and internal state validation.
