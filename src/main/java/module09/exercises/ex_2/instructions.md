# Exercise 2 — Differentiating Local Variables with `this`

## Detailed Description

Implement a class that receives parameters with the same names as the class attributes.  
The student must correctly use `this` to differentiate between internal attributes and local variables in the constructor.

## Required Classes

- **Employee**

## Attributes

- `name` (String)
- `salary` (double)

## Methods

- Constructor with parameters having the same names as the attributes.
- `calculateAnnualIncome()`
- `toString()`

## Rules

- The constructor must use `this` explicitly.
- Attributes should be initialized exclusively through the constructor.

## Expected Inputs

- Name
- Monthly salary

## Expected Outputs

- Annual income calculated
- Complete display of the employee data

## Technical Objective

Reinforce the use of the keyword `this` to differentiate class attributes from local variables.
