# ClinicOps

## Project Overview
ClinicOps is a console-based Java application for managing clinic operations.  
It replaces manual records with a simple digital system.

---

## Use Case 2: Doctor Data Entry

Admin can:
- Add details of 3 doctors
- View all registered doctors

---

## Features

### Admin Menu
1. Doctors' Entry
2. Bulk Entry (CSV) - Coming Soon
3. View Audit Logs - Coming Soon
4. Display All Doctors
5. Logout

---

## Doctor Details

Each doctor includes:
- Name (cannot be empty)
- Specialization (cannot be empty)
- Experience (must be number)
- Shift (Morning / Evening / Both)

---

## Project Structure

com.clinicops
- ClinicApp.java
- util
  - ScannerHelper.java
- menu
  - AdminMenu.java
  - FrontDeskMenu.java

---

## How to Run

Compile: