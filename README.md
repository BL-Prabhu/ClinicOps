# ClinicOps

## Use Case 3: Refactored Doctor Management

### Overview
This use case improves UC2 by applying OOP concepts and removing code duplication.

---

## Problem in UC2
- Limited to 3 doctors
- Repetitive code (violates DRY)
- Hard to scale
- No proper data structure

---

## Solution in UC3
- Created Doctor class (Encapsulation)
- Used ArrayList for dynamic storage
- Auto-generated unique IDs (D0001)
- Cleaner and maintainable code

---

## Features
- Register doctor
- Display all doctors
- Unlimited doctor entries

---

## Concepts Used
- OOP (Encapsulation)
- Constructor
- ArrayList
- String formatting
- Static memory persistence

---

## How to Run

Compile:
javac com/clinicops/**/*.java

Run:
java com.clinicops.ClinicApp

---

## Git Branch
feature/UC3-refactor-doctor-management

---

## Author
Prabhu Nagamani