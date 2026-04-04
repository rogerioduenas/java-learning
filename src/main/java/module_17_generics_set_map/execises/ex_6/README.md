# Exercise 6 — Value Transfer System Between Structures

## Detailed Description

An accounting application needs to copy numeric values from one structure to another that may be more generic.

---

## Required Classes

- `TransferService`

---

## Methods

### `TransferService`

```java
static void copy(List<? extends Number> source, List<? super Number> destiny)
```

---

## Functional Rules

- The destination list may be more generic than the source list.
- Apply proper reading and writing rules according to generics constraints.

---

## Technical Objective

- GET/PUT Principle (PECS)
```