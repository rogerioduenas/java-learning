# Exercise 6 — User System with Invalid Credentials

## Detailed Description

A system validates user credentials before allowing access to a protected feature.

## Required Classes

- `User`
- `AuthenticationService`

## Attributes

### User
- `email`
- `password`

### AuthenticationService
- List of users

## Methods

### AuthenticationService
- `authenticate(String email, String password)`

## Business Rules

- Non-existent users must not be authenticated
- Incorrect passwords must prevent access
- The system must not stop after an invalid attempt

## Expected Inputs

- User email and password

## Expected Outputs

- Access confirmation **or**
- Authentication failure message

## Technical Goal

Isolate failures without compromising the main flow
