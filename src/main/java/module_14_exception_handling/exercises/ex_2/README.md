# Exercise 2 — Medical Appointment System with Inconsistent Times

## Detailed Description

A medical clinic schedules appointments by providing a date, start time, and end time. The system must ensure the temporal consistency of each appointment.

## Required Classes

- `Appointment`

## Attributes

- `patientName`
- `startTime`
- `endTime`

## Methods

- `calculateDuration()`

## Business Rules

- The end time must be later than the start time
- Appointments with zero or negative duration are not allowed
- An invalid appointment must not be created

## Expected Inputs

- Appointment data

## Expected Outputs

- The appointment duration in minutes **or**
- A message indicating a time inconsistency

## Technical Goal

Use immediate failures to protect domain invariants
