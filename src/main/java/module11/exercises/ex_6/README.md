## Exercise 6 — Reading a Date in a Custom Format

### Detailed Description

A system receives a date entered by the user in the Brazilian format and needs to convert it into an internal model.

### Required Classes

#### `InputParser`

**Attributes**
- None

**Methods**
- Convert text input into a `LocalDate`

### Behavior Rules

- The input format must be `dd/MM/yyyy`
- The date must be validated before use

### Expected Input

- Text containing a date

### Expected Output

- A `LocalDate` object

### Technical Objective

- Reinforce the use of `DateTimeFormatter.ofPattern` together with `LocalDate.parse`
