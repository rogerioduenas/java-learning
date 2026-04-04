## Exercise 4 — Converting a Global Instant to the System Local Date

### Detailed Description

A global instant stored in the system must be displayed as the local date of the server.

### Required Classes

#### `DateConverter`

**Attributes**
- None

**Methods**
- Convert an `Instant` to a `LocalDate`

### Behavior Rules

- The system default time zone must be used
- The result must not include any time component

### Expected Input

- An `Instant` in UTC

### Expected Output

- The corresponding `LocalDate`

### Technical Objective

- Reinforce global → local conversion using `ZoneId.systemDefault()`
