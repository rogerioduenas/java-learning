## Exercise 3 — Global Timestamp Storage for an Action

### Detailed Description

A system action must be stored globally for auditing purposes, regardless of the user’s location.

### Required Classes

#### `AuditLog`

**Attributes**
- `action`
- `timestamp` (`Instant`)

**Methods**
- Register an action
- Display the timestamp using the standard ISO format

### Behavior Rules

- The timestamp must be obtained in UTC
- The output must follow the ISO `Instant` standard

### Expected Input

- Action description

### Expected Output

- ISO-8601 text containing date, time, and `Z`

### Technical Objective

- Reinforce the use of `Instant.now()` as a global time reference
