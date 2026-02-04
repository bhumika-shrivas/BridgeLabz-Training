# Java Functional Programming

### 📅 Day 1 – Java Lambdas & Method References
*(Date: 27-01-2026)*

## 🔹 Lambda Expressions
- **Smart Home Lighting**: Used lambdas to trigger light patterns (motion, time, voice) without multiple classes.
- **E-Commerce Sorting**: Dynamic product sorting (price, rating, discount) using lambda + `Comparator`.
- **Notification Filtering**: Filtered hospital alerts using lambdas with `Predicate`.

## 🔹 Method References
- **Patient ID Printing**: Printed IDs using method references instead of lambdas.
- **Name Uppercasing**: Converted employee names using `String::toUpperCase`.
- **Invoice Creation**: Generated invoices using constructor references.

🔗 *Code Link:* [Lambda & Method Reference](https://github.com/bhumika-shrivas/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Practice/src/com/lambdaexpression)

## 🔹 Functional Interfaces
- **Temperature Alert System**: Used `Predicate<Double>` to trigger alerts beyond thresholds.
- **String Length Checker**: Used `Function<String, Integer>` to validate message size.
- **Background Job Execution**: Used `Runnable` for asynchronous task execution.

## 🔹 Static Methods in Interfaces
- **Password Strength Validator**: Centralized password policy using static interface methods.
- **Unit Conversion Tool**: Common conversions (km↔miles, kg↔lbs) via static utilities.
- **Date Format Utility**: Standardized date formatting for invoice generation.

## 🔹 Default Methods in Interfaces
- **Payment Gateway Integration**: Added `refund()` without breaking existing providers.
- **Data Export Feature**: Introduced `exportToJSON()` alongside CSV and PDF exports.
- **Smart Vehicle Dashboard**: Extended functionality for electric vehicles using default methods.

## 🔹 Marker Interfaces
- **Data Serialization**: Marked classes for backup using `Serializable`.
- **Object Cloning**: Enabled prototype cloning using `Cloneable`.
- **Sensitive Data Tagging**: Custom marker interface to flag classes for encryption.

🔗 *Code Link:* [Functional Interface](https://github.com/bhumika-shrivas/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Practice/src/com/functionalinterface)

---
