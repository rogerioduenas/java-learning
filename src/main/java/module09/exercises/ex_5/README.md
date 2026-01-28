# Exercise 5 — Class with Immutable and Mutable Attributes

## Detailed Description

Create a class representing a book.  
The ISBN is immutable after creation, while the title and price can be modified.

## Required Classes

- **Book**

## Attributes

- `isbn` (String — immutable)
- `title` (String — private)
- `price` (double — private)

## Methods

- Constructor that receives all attributes
- Getter for all attributes
- Setter only for `title` and `price`
- `toString()`

## Rules

- ISBN cannot be changed after the constructor
- Price must be positive

## Expected Inputs

- ISBN
- Title
- Price

## Expected Outputs

- Book data before and after allowed modifications

## Technical Objective

Reinforce partial immutability, encapsulation, and state control.
