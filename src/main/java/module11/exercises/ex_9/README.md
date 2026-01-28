## Exercise 9 — Calculating Future and Past Dates

### Detailed Description

A system needs to calculate dates relative to a base date.

### Required Classes

#### `DateCalculator`

**Attributes**
- None

**Methods**
- Calculate a future date
- Calculate a past date

### Behavior Rules

- Must operate exclusively with `LocalDate`
- All calculations must be immutable

### Expected Input

- A base date
- A number of days

### Expected Output

- Newly calculated dates

### Technical Objective

- Consolidate the use of `plusDays` and `minusDays`
