# Exercise 8 — Client Data Import

## Detailed Description

A system must import clients from a text file and register only valid records.

---

## Required Classes

- `Client`
- `ClientImporter`

---

## Attributes

### `Client`

- `name`
- `email`

---

## Methods

### `ClientImporter`

- `importClients(...)`

---

## Functional Requirements

- Invalid lines must be ignored.
- The system must continue running even if isolated errors occur.

---

## Expected Input

- Client file path

## Expected Output

- Import report

---

## Technical Objective

- Error handling during file reading
