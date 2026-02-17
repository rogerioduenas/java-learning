# Description of the Code Developed in Class to Learn **Interface**

## Problem Statement

A company wants to automate the processing of its contracts.

Contract processing consists of generating the installments to be paid for a given contract, based on the desired number of months for payment.

---

## Business Rules

### 1. Contract Data

The system must read the following contract information:

- Contract number
- Contract date
- Total contract value

After that, the program must read:

- Number of months for installment payment

---

### 2. Installment Generation Rule

- The total contract value must be divided into installments according to the number of months informed.
- The **first installment** is due **one month after the contract date**.
- The **second installment** is due **two months after the contract date**.
- This pattern continues until all installments are generated.

Each installment must contain:

- Due date
- Installment amount

---

### 3. Online Payment Service Rule (PayPal)

The company uses an online payment service to process installments.

Currently, the contracted service is **PayPal**, which applies:

- **1% simple interest per month** on each installment
- **2% payment fee** on the updated installment amount

These charges must be applied during installment calculation.

---

## Program Requirements

The system must:

1. Read contract data.
2. Read the number of months for installment payment.
3. Generate all installments according to:
    - Monthly due dates
    - Interest and payment fee rules
4. Display the installment data on the screen.

---

## Objective

The purpose of this exercise is to apply the concept of **Interface**, allowing the payment service (e.g., PayPal) to be implemented separately from the contract processing logic, ensuring proper decoupling and better system design.
