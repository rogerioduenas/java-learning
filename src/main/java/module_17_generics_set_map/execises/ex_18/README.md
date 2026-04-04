# Exercise 18 — Dynamic Score Ranking System

## Detailed Description

A system maintains an automatic ranking of players ordered by score.

---

## Required Classes

- `Player`

---

## Attributes

### `Player`

- `String name`
- `Integer score`

---

## Main Data Structure

- `TreeSet<Player>`

---

## Functional Rules

- Sort by score in descending order.
- In case of a tie, sort by name in alphabetical order.
- The ordering must be defined using a custom `Comparator`.

---

## Technical Objective

- Use of `Comparator` with `TreeSet`
- Custom sorting logic implementation
```