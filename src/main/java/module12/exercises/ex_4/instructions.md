# Exercise 4 — Employee with Professional Level

## Detailed Description

A system must register employees with a professional level and an associated department.

## Required Classes

- `Employee`
- `Department`
- `EmployeeLevel` (enum)

## Attributes

### Employee
- `name`
- `salary`
- `level` (`EmployeeLevel`)
- `department`

### Department
- `name`

## Methods

- Create an employee
- Display complete employee data

## Business Rules

- The professional level must be represented by an enumeration
- The employee must have an associated department

## Expected Input

- Employee name
- Employee salary
- Professional level
- Department

## Expected Output

- Complete employee data

## Technical Objective

- Combine `enum` and composition in the same context
