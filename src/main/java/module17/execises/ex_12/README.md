# Exercise 12 — Instructor Enrollment Control

## Detailed Description

An instructor teaches multiple courses. Each course has a list of enrolled students.  
A student may be enrolled in more than one course.

The system must calculate the actual total number of distinct students under the instructor.

---

## Required Classes

- `Student`
- `Course`

---

## Attributes

### `Student`

- `Integer id`

### `Course`

- `String name`
- `Set<Student> students`

---

## Methods

### `Student`

- `equals(Object obj)`
- `hashCode()`

---

## Functional Rules

- A student's identity is defined solely by the `id`.
- The final total must eliminate duplicate students across courses.
- Use set union operations to combine enrollments.

---

## Expected Input

- Lists of students per course.

---

## Expected Output

- Total number of distinct students.

---

## Technical Objective

- Union operations using `Set`
- Proper equality contract implementation (`equals` and `hashCode`)
```