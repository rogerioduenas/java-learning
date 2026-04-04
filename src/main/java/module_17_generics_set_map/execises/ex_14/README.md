# Exercise 14 — Vote Consolidation in an Election

## Detailed Description

A system receives records containing the candidate’s name and the number of votes per ballot box.  
It is necessary to consolidate the total number of votes per candidate.

---

## Required Classes

- `Program`

---

## Main Data Structure

- `Map<String, Integer>`

---

## Functional Rules

- If the candidate already exists in the map, add the votes to the current total.
- Otherwise, insert a new record into the map.

---

## Expected Input

- CSV file containing candidate name and number of votes.

---

## Expected Output

- Final report with total votes per candidate.

---

## Technical Objective

- Use of `Map` for value aggregation