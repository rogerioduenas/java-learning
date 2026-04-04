# Exercise 10 — Academic Record with Overloading and Encapsulation

## Detailed Description

Implement an academic record system where a student can be created with different levels of information using constructor overloading. All attributes must be private.

## Required Class

- **AcademicRecord**

### Attributes

- `studentName` (String — private)
- `registrationId` (int — private)
- `gpa` (double — private)

### Methods

- Full constructor
- Constructor without GPA (assumes 0.0)
- Constructor without parameters (uses default values)
- Getters/setters with validation
- `toString()`

## Rules

- Name cannot be empty
- `registrationId` cannot be changed after creation
- Name cannot be changed after creation
- GPA must be between 0.0 and 10.0

## Expected Inputs

- Name
- ID
- Initial GPA (optional)

## Expected Outputs

- Complete academic record data

## Technical Objective

Reinforce constructor overloading, encapsulation, validation, and consistent state.
