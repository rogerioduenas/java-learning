# Exercise 4 — Configuration File Backup

## Detailed Description

A system must create automatic backups of configuration files before critical changes are made.

---

## Required Classes

- `ConfigurationFile`
- `BackupService`

---

## Attributes

### `ConfigurationFile`

- `filePath`

### `BackupService`

- `backupDirectory`

---

## Methods

### `BackupService`

- `createBackup(...)`

---

## Functional Requirements

- The backup must be an exact copy of the original file.
- The backup file name must include date and time.
- Copy failures must be logged.

---

## Expected Input

- Configuration file path

## Expected Output

- Created backup file

---

## Technical Objective

- File copying using `java.nio.file`
