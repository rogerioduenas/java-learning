# Exercise 7 — Notification System with Abstract Method

## Detailed Description

A system needs to send notifications through different channels, each with its own sending logic.

---

## Required Classes

- `Notification` (abstract)
- `EmailNotification`
- `SmsNotification`

---

## Attributes

- **Notification**
    - `recipient`

- **EmailNotification**
    - `emailAddress`

- **SmsNotification**
    - `phoneNumber`

---

## Methods

- Send notification

---

## Business Rules

- The sending method must be abstract in the superclass
- Each notification type must implement its own sending logic
- Notifications must be handled polymorphically

---

## Expected Inputs

- Notification type and recipient data

---

## Expected Outputs

- Sending confirmation

---

## Technical Goal

- Practice abstract methods
- Reinforce polymorphism
