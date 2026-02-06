# Exercise 9 — Independent Task Execution

## Detailed Description

A system executes multiple tasks sequentially, where each task may fail independently.

## Required Classes

- `Task`
- `TaskExecutor`

## Attributes

### Task
- `id`

### TaskExecutor
- List of tasks

## Methods

### TaskExecutor
- `executeAll()`

## Business Rules

- A failure must not prevent the execution of subsequent tasks
- Each task must report its own result
- Only tasks with even identifiers must be executed

## Expected Inputs

- A set of tasks

## Expected Outputs

- Individual result for each task

## Technical Goal

Isolate failures within execution loops