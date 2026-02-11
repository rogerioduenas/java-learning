# Exercise 1 — System Access Log Reader

## Detailed Description

An internal system records user access events in a text file, where each line represents a single access entry.

The objective is to process this file and display all entries in an ordered and safe manner, properly handling potential read failures.

---

## Required Classes

- `AccessLog`
- `AccessLogService`
- `LogReader`

---

## Attributes

### `AccessLog`

- `timestamp`
- `userId`
- `resourceAccessed`

### `LogReader`

- `filePath`

---

## Methods

### `LogReader`

- `readAll()`

### `AccessLogService`

- `parseLines(...)`
- `listLogs(...)`

---

## Functional Requirements

- The file must be read line by line.
- Each line represents a valid access entry.
- Read failures must be handled properly.
- The system must not crash if the file does not exist.

---

## Expected Input

- Log file path

## Expected Output

- List of access entries displayed in the console

---

## Technical Objective

- Sequential file reading
