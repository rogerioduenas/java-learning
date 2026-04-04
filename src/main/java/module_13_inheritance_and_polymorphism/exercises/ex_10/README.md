## Exercise 10 — Event System with Multiple Types

### Detailed Description

A system needs to calculate the cost of events, which can be either in-person or online.

### Required Classes

- `Event` (abstract)
- `OnlineEvent`
- `InPersonEvent`

### Attributes

- `Event`: `title`, `baseCost`
- `OnlineEvent`: `platformFee`
- `InPersonEvent`: `locationCost`

### Methods

- Calculate total cost

### Business Rules

- Each type of event has its own cost calculation rules
- The cost calculation must be encapsulated in the subclasses
- The system must calculate the total cost of all events using polymorphism

### Expected Inputs

- List of events

### Expected Outputs

- Cost of each event
- Overall total cost

### Technical Goal

Consolidate inheritance, abstract classes, abstract methods, method overriding, and polymorphism.
