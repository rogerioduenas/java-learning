# Exercise 20 — Integrated Commercial Relationship System

## Detailed Description

A company needs a system capable of managing customer relationships and purchases.

The system must:

- Maintain a **unique customer registry**
- Track **purchases made by customers**
- Generate a **consolidated report of the total amount spent per customer**
- Maintain a **sorted ranking of customers based on total spending**

---

## Required Classes

- `Customer`
- `Order`

---

## Attributes

### `Customer`

- `String name`
- `String id`

### `Order`

- `Customer customer`
- `Double amount`

---

## Main Data Structures

- `Set<Customer>` — ensures a **unique customer registry**
- `Map<Customer, Double>` — stores the **total amount spent per customer**
- `TreeSet<Customer>` — maintains a **ranking of customers sorted by total spending**

---

## Functional Rules

- Each customer is uniquely identified by their **id**.
- If the same customer makes multiple purchases, the **amounts must be aggregated**.
- The ranking must **update correctly whenever a new purchase is registered**.
- The ranking must always reflect the **customers who spent the most**.

---

## Technical Objective

- Integration of **Set**, **Map**, and **TreeSet**
- Correct implementation of **`equals()` and `hashCode()`**
- Maintaining **data consistency across collections**
- Implementing **custom ordering based on total spending**