# Exercise 6 — Directory File Audit

## Detailed Description

An audit system must list all files and folders from a given directory, separating them by type.

---

## Required Classes

- `DirectoryAudit`
- `AuditService`

---

## Attributes

### `DirectoryAudit`

- `directories`
- `files`

---

## Methods

### `AuditService`

- `scanDirectory(...)`

---

## Functional Requirements

- Only valid paths must be processed.
- The system must not fail if the directory is empty.

---

## Expected Input

- Directory path

## Expected Output

- Organized listing of folders and files

---

## Technical Objective

- Directory listing using `java.nio.file`
