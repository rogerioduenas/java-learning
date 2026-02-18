# Exercise 1 — Vehicle Rental Billing System

## Detailed Description

An international vehicle rental company needs to automate the generation of rental invoices.  
Each country has its own tax calculation rules.

The system must calculate:

- Base rental amount per day
- Tax according to the country's rules
- Total amount

The tax calculation must allow changing tax rules without modifying the core rental logic.

---

## Required Classes

- `CarRental`
- `Vehicle`
- `Invoice`
- `RentalService`
- `TaxService`
- `BrazilTaxService`
- `USATaxService`

---

## Attributes

### `Vehicle`

- `model`

### `CarRental`

- `startDate`
- `finishDate`
- `vehicle`
- `invoice`

### `Invoice`

- `basicPayment`
- `tax`

### `RentalService`

- `pricePerDay`
- `taxService`

---

## Methods

### `RentalService`

- `processInvoice(CarRental rental)`

### `TaxService`

- `calculateTax(double amount)`

### `Invoice`

- `getTotalPayment()`

---

## Functional Rules

### Brazil

- Fixed tax rate of 20%

### USA

- Fixed tax rate of 10%

The rental calculation logic must not depend on a concrete tax implementation.

---

## Expected Input

- Vehicle model
- Start date
- End date
- Price per day
- Country

---

## Expected Output

- Basic payment
- Tax
- Total payment

---

## Technical Objective

- Applying interfaces as contracts
- Low coupling
- Dependency injection via constructor
