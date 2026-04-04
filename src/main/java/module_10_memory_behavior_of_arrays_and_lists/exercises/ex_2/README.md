# Exercise 2 — Advanced Boarding House System (Array of Reference Types + Business Rules)

## Detailed Description

Build a complete room management system.  
The boarding house has **10 rooms (0 to 9)**, all initially empty.  
The user informs how many students will rent rooms and then provides the **name**, **email**, and **room number** for each student.

In addition to registration, the system must allow checking whether a room is occupied and display a general report.

## Required Classes

- **Rent**

## Attributes

- `name` (String)
- `email` (String)

## Methods

- `toString()` → returns `"name, email"`

## Rules

- The array of **10 positions** must start with **all positions set to null**.
- The user can only choose **available rooms**.
- After registration, the system must allow:
    - checking whether a specific room is occupied;
    - listing all occupied rooms in **ascending order**.

## Expected Inputs

- Number of students.
- For each student: name, email, room number.

## Expected Outputs

- A list containing **only the occupied rooms**.
- Individual room occupancy queries.

## Technical Objective

Reinforce the use of **arrays of objects**, handling **null positions**, and implementing room allocation logic.
