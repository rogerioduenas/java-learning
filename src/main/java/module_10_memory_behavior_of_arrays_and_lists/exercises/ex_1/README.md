# Exercise 1 — Product Inventory Control System (Array of Reference Types)

## Detailed Description

Build a system that stores a collection of products using an array of objects.  
The program starts by reading an integer value **N** and then reads **N** products (name, price, quantity).  
After storing the data, the system must display the **total inventory value**, which is the sum of the stock value of all products.

## Required Classes

- **Product**

## Attributes

- `name` (String)
- `price` (Double)
- `quantity` (Integer)

## Methods

- `totalValue()` → returns `price × quantity`
- `toString()` → returns the product name and the formatted total value

## Rules

- The array must be created with **exactly size N**.
- Each position must store a **valid Product object**.
- There must be **no null positions** in the array.
- The program must sum the total value of each product using `totalValue()`.

## Expected Inputs

- An integer number **N**.
- For each product: name, price, quantity.

## Expected Outputs

- A list of all products with the total value per item.
- The global total inventory value.

## Technical Objective

Reinforce the use of **arrays of reference types**, instantiating and storing objects on the **heap**.
