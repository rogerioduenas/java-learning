# Exercise 1 — Local Registration Date Record

## Detailed Description

A system needs to record a user’s registration date considering only the local context, without time and without time zone.

## Required Classes

- **User**

- **RegistrationService**

## Attributes

- `User` id
- `name`
- `registrationDate` (LocalDate)

## Methods

- `createUser()`
- `getFormattedRegistrationDate()`

## Rules

- The date must be obtained from the system at the moment of registration

- It must not contain time or time zone information

- The date must be displayed in the format dd/MM/yyyy

## Expected Inputs

- User name and ID

Expected Outputs

- Registration date formatted as text

## Technical Objective

Reinforce the use of **LocalDate.now()** and **DateTimeFormatter** for purely local date data.