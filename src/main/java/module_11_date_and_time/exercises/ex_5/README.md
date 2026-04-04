## Exercise 5 — Displaying Local Dates Across Different Time Zones

### Detailed Description

The same global instant must be displayed as a local date in different regions.

### Required Classes

#### `TimeZoneService`

**Attributes**
- None

**Methods**
- Convert an `Instant` to a `LocalDate` given a `ZoneId`

### Behavior Rules

- Must accept any valid time zone identifier
- The local date may change depending on the time zone

### Expected Input

- An `Instant`
- A time zone identifier

### Expected Output

- The local date corresponding to the provided time zone

### Technical Objective

- Consolidate the explicit use of `ZoneId.of(...)`
