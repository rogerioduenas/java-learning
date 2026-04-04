## Exercise 10 — Calculating Duration Between Two Moments

### Detailed Description

The system needs to calculate how much time has elapsed between two distinct moments.

### Required Classes

#### `DurationService`

**Attributes**
- None

**Methods**
- Calculate the duration between two `Instant` values
- Calculate the duration between two `LocalDateTime` values

### Behavior Rules

- Must use `Duration`
- The final unit must vary depending on the type (days, hours, or minutes)

### Expected Input

- Two `Instant` values **or**
- Two `LocalDateTime` values

### Expected Output

- A numeric duration value

### Technical Objective

- Reinforce the concept of duration and the use of `Duration.between`
