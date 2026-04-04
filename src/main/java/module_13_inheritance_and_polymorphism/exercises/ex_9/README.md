# Exercise 9 — Subscription Plans

## Detailed Description

A system manages subscription plans with specific billing rules.

## Required Classes

- `Subscription`
- `BasicSubscription`
- `PremiumSubscription`
- `TrialSubscription`

## Attributes

- `Subscription`: `userName`, `monthlyFee`
- `PremiumSubscription`: `bonusServices`
- `TrialSubscription`: `trialDays`

## Methods

- Calculate monthly fee

## Business Rules

- Basic subscriptions charge the base monthly fee
- Premium subscriptions include an additional cost
- Trial subscriptions do not generate any charge
- The calculation must vary according to the actual subscription type

## Expected Inputs

- List of subscriptions

## Expected Outputs

- Charged amount per user

## Technical Objective

- Reinforce method overriding and runtime polymorphism
