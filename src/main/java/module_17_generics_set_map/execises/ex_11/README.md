# Exercise 11 — Unique Visitor Control in Corporate Event

## Detailed Description

A company organized an event and recorded participant entries throughout the day.  
The same participant may have entered and exited multiple times.

The system must process the records and report how many distinct participants were present at the event.

---

## Required Classes

- `VisitLog`
- `Program`

---

## Attributes

### `VisitLog`

- `String participantId`
- `Instant timestamp`

---

## Methods

### `VisitLog`

- `equals(Object obj)`
- `hashCode()`

---

## Functional Rules

- Two records belong to the same participant if they share the same identifier.
- The timestamp must not influence the unique identification of a participant.
- The system must correctly eliminate duplicates.

---

## Expected Input

- File containing participant identifier and entry timestamp.

---

## Expected Output

- Total number of distinct participants.

---

## Technical Objective

- Use of `Set`
- Proper implementation of `equals` and `hashCode`
```