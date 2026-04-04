## EXERCISE 4 — Client System (DAO)

### Detailed Description

A company needs to manage its clients, including registration, update, and search operations.

---

### Required Classes

- Client
- ClientDao (interface)
- ClientDaoImpl
- DaoFactory
- Program

---

### Attributes

#### Client

- `Long id`
- `String name`
- `String email`

---

### Methods

- insert client
- update client
- delete client
- find client by id
- list all clients

---

### Operating Rules

Email must be unique.

Updates must be persisted in the database.

---

### Expected Inputs

- client data

---

### Expected Outputs

client data and client list

---

### Technical Objective

Introduction to the DAO pattern.