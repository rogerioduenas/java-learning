## EXERCISE 5 — Department and Employee System

### Detailed Description

A company needs to manage employees and their respective departments.

---

### Required Classes

- Department
- Employee
- DepartmentDao
- EmployeeDao
- DaoFactory

---

### Attributes

#### Department

- `Long id`
- `String name`

#### Employee

- `Long id`
- `String name`
- `Double salary`
- `Department department`

---

### Methods

- full CRUD for both entities

---

### Operating Rules

An employee must be associated with a department.

Queries must return complete data, including relationships.

---

### Expected Inputs

- employee and department data

---

### Expected Outputs

lists with relationships

---

### Technical Objective

Object-relational mapping and relationships.