# Description of the Code Developed in Class to Learn **Interface**

## Problem Statement

A Brazilian car rental company applies the following pricing rules:

### 1. Rental Time Charging Rule

- For rentals lasting **up to 12 hours**, the total amount is calculated based on an **hourly rate**.
- For rentals lasting **more than 12 hours**, the total amount is calculated based on a **daily rate**.

---

### 2. Tax Rule (Brazil)

After calculating the rental amount, a tax must be applied according to the following rules:

- **20% tax** for rental amounts **up to 100.00**
- **15% tax** for rental amounts **above 100.00**

---

## Program Requirements

The system must:

### Input Data

The program should read the following rental data:

- Car model
- Rental start date and time
- Rental end date and time
- Price per hour
- Price per day

---

### Processing

The program must calculate:

- **Rental amount** (based on duration and charging rules)
- **Tax amount** (according to Brazilian tax rules)
- **Total payment amount** (rental amount + tax)

---

### Output

The program must generate and display a **payment invoice** containing:

- Rental amount
- Tax amount
- Total payment amount

---

## Objective

The purpose of this exercise is to apply the concept of **Interface** by separating the tax calculation rule from the main business logic, ensuring proper decoupling and better design structure.
