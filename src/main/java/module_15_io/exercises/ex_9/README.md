# Exercise 9 — Automatic Output File Generation

## Detailed Description

An internal control system must generate output files based on processed data, ensuring that the final path exists.

---

## Required Classes

- `OutputContent`
- `OutputService`

---

## Attributes

### `OutputContent`

- `content`

---

## Methods

### `OutputService`

- `writeOutput(...)`

---

## Functional Requirements

- Non-existent directories must be created automatically.
- Writing must be safe and consistent.

---

## Expected Input

- Processed content

## Expected Output

- Created output file

---

## Technical Objective

- Safe file writing using `java.nio.file`
