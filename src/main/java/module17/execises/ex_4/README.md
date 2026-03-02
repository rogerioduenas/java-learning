# Exercise 4 — Universal Printing Report

## Detailed Description

An auditing module must be able to print any list of data received, regardless of its type.

---

## Required Classes

- `ReportService`

---

## Methods

### `ReportService`

```java
static void printList(List<?> list)
```

---

## Functional Rules

- The method must accept lists of any type.
- It must not allow insertion of new elements into the list.

---

## Technical Objective

- Use of unbounded wildcard `<?>`