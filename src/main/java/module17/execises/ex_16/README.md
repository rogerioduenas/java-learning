# Exercise 16 — Customer Intersection Analysis

## Detailed Description

Two company branches maintain separate customer databases.  
The company wants to determine:

- Customers who made purchases in both branches
- Customers exclusive to each branch

---

## Required Classes

- `Customer`

---

## Main Data Structures

- Two `Set<Customer>` collections

---

## Functional Rules

- A customer is identified by their CPF.
- Apply set intersection to find customers present in both branches.
- Apply set difference to identify customers exclusive to each branch.

---

## Expected Output

- Three reports:
    - Common customers
    - Customers exclusive to Branch A
    - Customers exclusive to Branch B

---

## Technical Objective

- Set intersection and difference operations
- Proper implementation of `equals` and `hashCode`