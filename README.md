# 🏥 ClinicOps – Complete System (UC1 to UC15)

## 📌 Overview
ClinicOps is a console-based clinic management system built using Core Java.
It includes doctor management, patient handling, appointment booking, CSV import, and logging.

---

## 🎯 Objective
Build a scalable system using:
- OOP concepts
- Collections & Streams
- File handling (CSV)
- Logging & Security

---

## 📚 Use Cases

### UC1: Project Setup
- Create project structure
- Main class setup

### UC2: Doctor Entity
- Fields: id, name, specialization, experience

### UC3: Add Doctor
- Add doctor using ArrayList

### UC4: Display Doctors
- Print doctor list

### UC5: Enums
- Specialization Enum
- Shift Enum

### UC6: CSV Import
- Load doctors from CSV (OpenCSV)

### UC7: Patient Registration
- Auto ID (P0001)
- Mobile validation (Regex)

### UC8: Appointment Entity
- Link Patient + Doctor + Slot

### UC9: Appointment Booking
- Book first available slot
- Random doctor selection

### UC10: Specialization-Based Booking
- Filter doctors by specialization
- Use Stream API

### UC11: Shift-Aware Booking
- Filter by:
    - Specialization
    - Shift
    - Availability

### UC12: Logging Infrastructure
- Create AuditLogger
- Store logs in list

### UC13: Functional Logging
- Log successful operations

### UC14: Error & Security Logging
- Log invalid inputs
- Track repeated failures

### UC15: Log4j Integration
- Use log4j for logging
- Levels: INFO, WARN, ERROR

---

## 🏗️ Project Structure

com.clinicops
│
├── model
│   ├── Doctor.java
│   ├── Patient.java
│   ├── Appointment.java
│   ├── Shift.java
│   └── Specialization.java
│
├── menu
│   ├── AdminMenu.java
│   └── FrontDeskMenu.java
│
├── util
│   ├── ScannerHelper.java
│   ├── FileHandler.java
│
└── Main.java

---

## ⚙️ Technologies Used
- Core Java
- OpenCSV (JAR)
- Log4j2 (JAR)

---

## 📦 Required JARs
(Add manually since not Maven project)

- opencsv.jar
- log4j-api.jar
- log4j-core.jar

---

## ▶️ How to Run

Compile:
javac -cp ".;lib/*" com/clinicops/Main.java

Run:
java -cp ".;lib/*" com.clinicops.Main

---

## 📊 Features
- Doctor & Patient Management
- Smart Appointment Booking
- CSV Import
- Logging System
- Security Tracking

---

## 🚀 Learning Outcome
- OOP Concepts
- Collections & Streams
- File Handling
- Regex Validation
- Logging (Log4j)

---

## 👨‍💻 Author
ClinicOps Project