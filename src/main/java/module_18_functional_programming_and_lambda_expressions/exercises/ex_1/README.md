# Exercise 1 — Supplier Proposal Ranking System

## Detailed Description

A company receives proposals from multiple suppliers to provide a specific product.  
Each proposal includes a **total price** and a **delivery time in days**.

The system must allow the proposals to be **sorted using different criteria**, depending on the analysis requested by the purchasing team.

The user may request:

- Sorting by **lowest price**
- Sorting by **shortest delivery time**
- Sorting by **best cost-benefit** (price divided by delivery time)

The sorting logic **must not be fixed inside the proposal class**, since the criterion may change depending on the analysis.

---

## Required Classes

- `Proposal`

---

## Attributes

### `Proposal`

- `String supplierName`
- `Double totalPrice`
- `Integer deliveryDays`

---

## Methods

### `Proposal`

- Constructor
- Getters
- Textual representation of the proposal

---

## Main Data Structure

- `List<Proposal>`

---

## Functional Rules

- The system receives a **list of supplier proposals**.
- The user selects the **sorting criterion**.
- The list must be **sorted dynamically according to the selected criterion**.
- After sorting, **all proposals must be displayed**.

---

## Expected Input

A list of proposals containing:

- Supplier name
- Total price
- Delivery time

## Expected Output

Sorted list of proposals in the following format:
- Supplier - Price - Delivery Time

---

## Technical Objective

- Use of **`Comparator`**
- Use of **lambda expressions**
- Implementation of **dynamic list sorting**