# 🛒 Checkout Processor Refactor: From "God Class" to SOLID Architecture

## 📖 Overview
This repository demonstrates the evolution of a monolithic, tightly coupled Java class (a "God Class") into a clean, modular, and highly scalable system. It serves as a practical exploration of Object-Oriented Programming (OOP) fundamentals, the SOLID principles, and enterprise-grade design patterns.

## 🚀 The Journey: What Was Fixed

### 1. Eliminating the "God Class" (Single Responsibility Principle)
**The Problem:** The original `CheckoutProcessor` handled business math, discount logic, API routing for payments, SQL database interactions, and email notifications all in one 50-line method. 
**The Solution:** Extracted each domain into its own dedicated service. The processor now acts strictly as a coordinator, not a doer.

### 2. Curing "Primitive Obsession"
**The Problem:** Passing loosely related primitive data types (`String itemName`, `int quantity`, `double price`) around as a group.
**The Solution:** Encapsulated these variables into a cohesive `Order` object with its own behavior (e.g., calculating its own total), protecting its data via encapsulation (getters).

### 3. Implementing the Strategy Pattern (Open/Closed Principle)
**The Problem:** Hardcoded `if/else` and `switch` statements for User Discounts and Payment Gateways meant the core class had to be modified every time a new feature was added.
**The Solution:** Created `DiscountStrategy` and `PaymentStrategy` interfaces. New payment methods or user tiers can now be added by creating a new class, without ever touching existing code.

### 4. Dependency Injection (Dependency Inversion Principle)
**The Problem:** The processor was using the `new` keyword to instantiate its own dependencies, tightly coupling it to specific implementations (like a SQL database or Stripe API).
**The Solution:** Dependencies are now injected via the constructor as abstract interfaces. This makes the `CheckoutProcessor` entirely agnostic to the external tools it uses, unlocking the ability to easily mock dependencies for lightning-fast Unit Testing.

### 5. Achieving Stateless Services
**The Problem:** Storing the `Order` in the processor's constructor glued the service to a single transaction.
**The Solution:** Removed state from the service layer. The processor is now instantiated once with its permanent tools, and `Order` objects are passed through the `processOrder()` method, allowing the same processor instance to handle millions of unique transactions.

## 🛠️ Technologies & Concepts
* **Language:** Java
* **Core Concepts:** OOP (Encapsulation, Polymorphism), Interface-Driven Design
* **Design Patterns:** Strategy Pattern, Dependency Injection (Constructor Injection)