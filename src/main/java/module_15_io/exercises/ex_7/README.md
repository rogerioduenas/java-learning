# Exercise 7 — Text File Normalization

## Detailed Description

A system receives text files with inconsistent formatting and must generate a normalized version by removing empty lines and unnecessary spaces.

---

## Required Classes

- `TextNormalizer`
- `NormalizationService`

---

## Attributes

### `TextNormalizer`

- `sourcePath`
- `targetPath`

---

## Methods

### `NormalizationService`

- `normalize(...)`

---

## Functional Requirements

- The original file must not be modified.
- The normalized file must be saved separately.

---

## Expected Input

- Source file path

## Expected Output

- Normalized file

---

## Technical Objective

- Reading and rewriting text files
