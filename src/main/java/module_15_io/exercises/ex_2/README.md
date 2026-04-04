# Exercise 2 — Active Contracts Processing

## Detailed Description

A company stores contracts in a text file, where each line represents a single contract.

The system must read the file, identify active contracts, and generate a report containing only those active contracts.

---

## Required Classes

- `Contract`
- `ContractRepository`
- `ContractReportService`

---

## Attributes

### `Contract`

- `id`
- `clientName`
- `startDate`
- `endDate`

---

## Methods

### `ContractRepository`

- `loadContracts()`

### `ContractReportService`

- `filterActiveContracts(...)`
- `generateReport(...)`

---

## Functional Requirements

- The file may contain expired contracts.
- Only contracts valid at the current date must be considered.

---

## Expected Input

- Contract file path

## Expected Output

- Textual report containing active contracts

---

## Technical Objective

- File reading and textual content interpretation
