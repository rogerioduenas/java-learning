# Exercise 1 — Generic Record Storage System

## Detailed Description

A company wants to create a reusable component capable of storing any type of record (customers, products, contracts, etc.) and allowing retrieval of the first inserted element, as well as listing all stored records in an organized way.

The system must work independently of the stored type.

---

## Required Classes

- `StorageService<T>`
- `Program`

---

## Attributes

### `StorageService<T>`

- `List<T> items`

---

## Methods

### `StorageService<T>`

- `void add(T item)`
- `T getFirst()`
- `List<T> getAll()`

---

## Functional Rules

- The service must store elements of any type.
- It must be reusable across different domains without modifying its implementation.
- If there are no elements stored, an appropriate exception must be thrown.

---

## Expected Input

- Data from any domain (e.g., numbers, names, entity objects)

---

## Expected Output

- Complete listing of records
- The first inserted element

---

## Technical Objective

- Creation of a simple generic class