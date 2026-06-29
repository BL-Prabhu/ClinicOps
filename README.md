# 📘 Use Case 9: Appointment Booking by System

## 🎯 Goal

To automatically book an appointment for a patient with an available doctor based on slot availability.

---

## 🚀 Objective

This use case introduces an automated appointment booking system that:

* Assigns doctors dynamically
* Manages time slots
* Prevents double booking
* Ensures efficient scheduling

---

## 👤 Actor

**Front Desk Executive**

---

## 📌 Assumptions

* Doctor specialization is NOT considered
* All doctors are available for both shifts
* Appointments are booked in **serial order only**
* Total **16 slots per doctor per day**:

    * Morning: 9:00 AM onwards (8 slots, every 30 mins)
    * Evening: 4:00 PM onwards (8 slots, every 30 mins)
* Once a slot is booked, it cannot be reused

---

## 🔄 Flow

1. Front Desk Executive selects **Book Appointment**
2. System retrieves list of doctors
3. System checks for **first available slot**
4. If multiple doctors are available:

    * One doctor is selected randomly
5. System books the slot
6. Slot is marked as **occupied**
7. Appointment is confirmed

---

## ⚙️ Key Functionalities

### 1. 📅 Slot Management

* Each doctor has predefined time slots:

  ```
  09:00, 09:30, 10:00 ... 12:30
  16:00, 16:30 ... 19:30
  ```
* Slots are stored and tracked per doctor

---

### 2. 🧠 Availability Check

* Before booking:

    * System checks if slot is already booked
* Prevents:

  ```
  Double Booking ❌
  ```

---

### 3. 🎲 Random Doctor Assignment

* If multiple doctors available:

    * System selects randomly using:

  ```java
  Random rand = new Random();
  ```
* Ensures fair distribution of appointments

---

### 4. 📦 Appointment Object (Composition)

* Appointment contains:

    * Patient object
    * Doctor object
    * Time slot

* Example:

  ```java
  private Patient patient;
  private Doctor doctor;
  private String slot;
  ```

---

### 5. 🧾 Stateful Doctor Object

* Each doctor maintains:

    * List of booked slots
* Encapsulates schedule within doctor

---

### 6. 🔗 Cross-Module Communication

* Front Desk accesses doctor list from Admin module
* Achieved via:

    * Static getter method

---

## 🏗️ System Changes

### 1. 📄 Appointment Class (`Appointment.java`)

* New class created
* Stores:

    * Patient reference
    * Doctor reference
    * Slot timing

---

### 2. 👨‍⚕️ Doctor Class Update

* Added:

    * List of booked slots
* Methods:

    * Check availability
    * Book slot

---

### 3. 🖥️ FrontDeskMenu Updates

* Added method:

    * `bookAppointment()`
* Handles:

    * Slot assignment
    * Doctor selection
    * Appointment creation

---

## 📌 Example

### Input:

```id="k2m9qs"
Patient: Ravi Kumar
```

### Output:

```id="a9z4lx"
Appointment Booked Successfully!
Doctor: Dr. Sharma
Time: 09:30 AM
```

---

## 🧪 Scenario Handling

### ✔ Slot Available

* Appointment booked successfully

### ❌ All Slots Full

```id="s8x1pt"
No slots available. Please try later.
```

---

## 📚 Concepts Learned

* ✅ Object Composition
* ✅ Stateful Objects
* ✅ Random Class Usage
* ✅ Encapsulation
* ✅ Inter-Class Communication
* ✅ Scheduling Logic

---

## 🏁 Conclusion

UC9 enhances the system by introducing intelligent appointment booking.
It ensures:

* Efficient doctor utilization
* No slot conflicts
* Scalable scheduling system

This lays the foundation for future enhancements like:

* Doctor specialization filtering
* Online booking
* Appointment rescheduling

---
