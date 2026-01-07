# Exercise 6 — Employee Manager (Lists)

## Detailed Description

Create a system to register employees using a **List**.  
After registration, the system must allow searching for an employee by **ID** and applying a **percentage salary increase**.  
The system must interact with the user via the terminal, ensuring data consistency and allowing new attempts when invalid input is provided.

## Required Classes

- **Employee**

## Attributes

- `id` (Integer)
- `name` (String)
- `salary` (Double)

## Methods

- `increaseSalary(double percentage)`
- Required getters
- `toString()`

## Rules

- The employee list must start **empty**.
- IDs **must not be duplicated**.
- If the user provides an existing ID during registration, the system must request a **new ID**.
- Employee search must be **sequential**, iterating through the list.
- Searching by ID must return the **employee object**, allowing direct manipulation.
- When requesting a salary increase:
    - If the provided ID does not exist, the system must display an **error message** and allow the user to try again.
    - If the ID exists, the increase must be applied and the process finished.

## Expected Inputs

- Number of employees to be registered

For each employee:
- ID
- Name
- Salary

- ID of the employee who will receive the increase
- Percentage increase

## Expected Outputs

- Updated list of employees.

## Technical Objective

Practice the use of **List**, insertion, search, and **object manipulation**.
