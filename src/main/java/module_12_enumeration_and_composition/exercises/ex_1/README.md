# Exercise 1 — User Level Classification

## Detailed Description

A system needs to register users and classify them according to their access level, using a fixed set of predefined values.

## Required Classes

- `User`
- `UserLevel` (enum)

## Attributes

### User
- `id`
- `name`
- `level` (`UserLevel`)

## Methods

- Create a user
- Retrieve user data

## Business Rules

- The user level must be represented by an enumeration
- Only predefined levels are allowed

## Expected Input

- User ID
- User name
- User level

## Expected Output

- User data displayed in the terminal

## Technical Objective

- Introduce the basic use of enumerations (`enum`)
