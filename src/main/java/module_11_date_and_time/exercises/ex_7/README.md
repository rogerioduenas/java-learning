## Exercise 7 — Reading Custom Date and Time Input

### Detailed Description

A form receives date and time as text and needs to produce a local date-time object.

### Required Classes

#### `DateTimeInputService`

**Attributes**
- None

**Methods**
- Convert text input into a `LocalDateTime`

### Behavior Rules

- Input format must be `dd/MM/yyyy HH:mm`
- Must not involve any time zone handling

### Expected Input

- Text containing date and time

### Expected Output

- The corresponding `LocalDateTime`

### Technical Objective

- Consolidate custom parsing of `LocalDateTime`
