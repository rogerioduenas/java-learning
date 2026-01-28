# Exercise 2 — Event logging with local date and time

## Description

An internal event needs to store the date and time when it occurred, without worrying about time zones.

---

## Required classes

### Event

#### Attributes
- `name`
- `eventDateTime` (`LocalDateTime`)

#### Methods
- Create the event using the current system date and time
- Return the formatted event date and time

---

## Rules
- Must use the **local system date and time**
- The output format must be:  
  **`dd/MM/yyyy HH:mm:ss`**

---

## Expected input
- Event name

---

## Expected output
- Text containing:
    - the event name
    - the formatted event date and time

---

## Technical goal
Reinforce the use of `LocalDateTime.now()` and custom date-time formatting.
