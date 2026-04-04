# Exercise 3 — Daily Financial Report Generation

## Detailed Description

A financial system records daily transactions in a text file.

The objective is to generate a new file containing the total amount transacted during the day.

---

## Required Classes

- `Transaction`
- `TransactionReader`
- `DailyReportGenerator`

---

## Attributes

### `Transaction`

- `description`
- `amount`

### `DailyReportGenerator`

- `outputDirectory`

---

## Methods

### `TransactionReader`

- `readTransactions()`

### `DailyReportGenerator`

- `generateSummary(...)`

---

## Functional Requirements

- The output file must be created automatically.
- The report must contain only the final total.

---

## Expected Input

- Transaction file path

## Expected Output

- Daily report file

---

## Technical Objective

- File creation
