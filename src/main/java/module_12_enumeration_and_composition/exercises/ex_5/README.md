# Exercise 5 — Post with Comments

## Description

The system must represent **user posts** that can have **associated comments**.

Each post contains its own data and manages a collection of comments related to it.

---

## Required Classes

- `Post`
- `Comment`

---

## Attributes

### Post
- `title`
- `content`
- `likes`
- `moment`
- `comments`

### Comment
- `text`

---

## Methods

- Add a comment to a post
- Display the complete post with its comments

---

## Business Rules

- A post **can contain multiple comments**
- Comments **exist only within the context of a post**
- The post display must be built using **`StringBuilder`**

---

## Expected Inputs

- Post data
- Comment texts

---

## Expected Output

- A formatted post displaying all its comments

---

## Technical Objective

- Practice **composition (has-many relationship)**
- Practice using **`StringBuilder` for list-based output**
