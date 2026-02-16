# Exercise 10 — Essential File Monitoring

## Detailed Description

A system must verify whether essential files exist before starting its execution.

---

## Required Classes

- `RequiredFile`
- `FileValidationService`

---

## Attributes

### `RequiredFile`

- `path`

---

## Methods

### `FileValidationService`

- `validateExistence(...)`

---

## Functional Requirements

- Missing files must generate a controlled error.
- No processing should occur if an essential file is missing.

---

## Expected Input

- List of required file paths

## Expected Output

- Validation confirmation or error

---

## Technical Objective

- File existence verification using `java.nio.file`
