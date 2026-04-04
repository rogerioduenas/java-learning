# Exercise 7 — Car Rental with Controlled Unavailability

## Detailed Description

A system manages car rentals over date periods, ensuring that a car is never left incorrectly unavailable in case of a failure.

## Required Classes

- `Car`
- `Rental`
- `RentalService`

## Attributes

### Car
- `id`
- `rented`

### Rental
- `car`
- `startDate`
- `endDate`

### RentalService
- List of cars
- List of rentals

## Methods

### RentalService
- `rent(String carId, LocalDate startDate, LocalDate endDate)`
- `returnCar(String carId)`

## Business Rules

- A car cannot be rented if it is already rented
- When starting a rental, the car must be marked as unavailable
- During the process, a simulated failure may occur
- If a failure occurs, the car must return to the available state
- The system must not stop after an invalid attempt
- The car state must always remain consistent

## Expected Inputs

- Car identifier
- Start date
- End date

## Expected Outputs

- Rental confirmation **or**
- Error message indicating:
    - Car unavailable
    - Failure during rental

## Technical Goals

- Practice exception handling
- Ensure resource release in any scenario
- Simulate a logical resource lock
- Prevent invalid state after failure
