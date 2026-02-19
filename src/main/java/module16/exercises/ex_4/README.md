# Exercise 4 — Multifunction Office Device

## Detailed Description

A company has developed a device capable of:

- Printing documents
- Scanning files
- Sending fax messages

Some devices support only one of these features, while others support multiple functionalities.

---

## Required Classes

- `Printer`
- `Scanner`
- `Fax`
- `SimplePrinter`
- `OfficeScanner`
- `ComboDevice`

---

## Methods

### `Printer`

- `print()`

### `Scanner`

- `scan()`

### `Fax`

- `sendFax()`

---

## Functional Rules

- `ComboDevice` must implement all functionalities.
- No functionality should depend on multiple inheritance.
- Each feature must be defined through interfaces.

---

## Expected Input

- Device usage commands

## Expected Output

- Operation confirmations

---

## Technical Objective

- Implementation of multiple interfaces
- Clear distinction between contract (interface) and inheritance
