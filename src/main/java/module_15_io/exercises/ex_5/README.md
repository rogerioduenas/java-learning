# Exercise 5 — Sales Order Consolidation

## Detailed Description

Orders are recorded in a CSV file.  
The system must generate a summary containing only the total amount per order, in a new file located in a specific subfolder.

---

## Required Classes

- `Order`
- `OrderItem`
- `OrderProcessor`

---

## Attributes

### `OrderItem`

- `productName`
- `unitPrice`
- `quantity`

---

## Methods

### `OrderProcessor`

- `readOrders(...)`
- `generateSummaryFile(...)`

---

## Functional Requirements

- The output subfolder must be created automatically.
- The original file must never be modified.
- Values must be calculated correctly.

---

## Expected Input

- Path to the orders CSV file

## Expected Output

- `summary.csv` file

---

## Technical Objective

- Reading and writing CSV files using `java.nio.file`
