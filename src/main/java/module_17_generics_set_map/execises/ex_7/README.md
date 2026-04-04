# Exercise 7 — Generic Repository with Identifier

## Detailed Description

Create a reusable repository capable of storing entities identified by a unique code.

---

## Required Classes

- `Repository<ID, T>`
- Identifiable entity

---

## Attributes

### `Repository<ID, T>`

- `Map<ID, T> storage`

---

## Methods

### `Repository<ID, T>`

```java
void save(ID id, T entity)

T findById(ID id)

Collection<T> findAll()
```

---

## Functional Rules

- Duplicate identifiers must not be allowed.
- The repository must ensure uniqueness of the identifier.

---

## Technical Objective

- Generics with multiple type parameters `<ID, T>` integrated with `Map`