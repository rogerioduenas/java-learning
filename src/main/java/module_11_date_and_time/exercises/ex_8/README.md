## Exercise 8 — Extracting Information from a Local Date

### Detailed Description

A report needs to extract specific pieces of information from a stored date.

### Required Classes

#### `DateInfoService`

**Attributes**
- None

**Methods**
- Retrieve the day of the month
- Retrieve the day of the week
- Retrieve the month
- Retrieve the year

### Behavior Rules

- Must work exclusively with `LocalDate`
- No time zone conversion is allowed

### Expected Input

- A `LocalDate`

### Expected Output

- Individual date values (day, month, year, day of week)

### Technical Objective

- Reinforce the use of `getDayOfMonth`, `getDayOfWeek`, `getMonth`, and `getYear`
