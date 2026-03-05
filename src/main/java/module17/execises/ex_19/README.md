# Exercise 19 — Session Management Through Actions

## Detailed Description

A server must maintain control of active user sessions based on received commands (logs).  
Each session is identified by a **unique token**. The system must process a list of operations to **create, access, or expire** user sessions.

---

## Required Classes

- `Session`

---

## Attributes

### `Session`

- `String username`
- `String action` (CREATE, ACCESS, or EXPIRE)

---

## Main Data Structure

- `Map<String, Session>`

**Key:** `token`  
**Value:** `Session`

---

## Functional Rules

### CREATE

- Check if the token already exists in the `Map`.
- Existing sessions **must not be overwritten**.
- If the token already exists, print an **error message**.
- If the token does not exist, create the session and store it in the `Map`.

### ACCESS

- Check if the provided token exists in the `Map`.
- If it exists, **grant access** and display the **username**.
- If it does not exist, print **"Invalid token"**.

### EXPIRE

- Remove the session associated with the token from the `Map`.
- After this operation, the user **must no longer have access**.

---

## Expected Operations

The system must process commands and perform operations using:

- `sessions.putIfAbsent(token, session)`
- `sessions.get(token)`
- `sessions.remove(token)`

---

## Expected Output

- Print a **log message for each operation executed**.
- At the end, display the **sessions that remain active**.

---

## Technical Objective

- Practical use of `Map<String, T>` for fast lookups
- Understanding the difference between `put()` and `putIfAbsent()`
- Entry retrieval and removal using a unique key
- Decision flow (`switch` / `case`) applied to collection processing