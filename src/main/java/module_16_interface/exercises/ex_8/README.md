# Exercise 8 — Performance Evaluation System

## Detailed Description

Employees can be evaluated based on:

- Punctuality
- Productivity

Each criterion provides a score.  
The final evaluation must combine criteria implemented independently.

---

## Required Classes

- `Evaluation`
- `PunctualityService`
- `ProductivityService`
- `Employee`

---

## Expected Input

- Base score value (e.g., 100 points)
- Punctuality data: hours of delay (e.g., 2 hours)
- Productivity data: delivered items vs. goal (e.g., 80 deliveries out of a goal of 100)

---

## Expected Output

- Individual score for each criterion
- Final average (or total) performance score

### Example Output

```
Employee: Alex | Punctuality: 80/100 | Productivity: 90/100 | Final Score: 85.0
```

---

## Business Rules

### Punctuality

- Initial score: 100
- Deduct 10 points for each hour of delay

### Productivity

- Score = `(deliveredItems / goal) * 100`

---

## Technical Objective

- Use of multiple interfaces as independent contracts