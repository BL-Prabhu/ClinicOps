# 📘 Use Case 10: Appointment Booking Considering Specialization

## 🎯 Goal

To book an appointment for a patient with a doctor based on the required specialization and slot availability.

---

## 🚀 Objective

This use case enhances appointment booking by:

* Matching patients with the right specialist
* Filtering doctors based on specialization
* Ensuring slot availability before booking

---

## 👤 Actor

**Front Desk Executive**

---

## 📌 Assumptions

* All doctors are available for both shifts
* Each doctor has **16 slots per day**:

  * Morning: 9:00 AM – 12:30 PM (8 slots)
  * Evening: 4:00 PM – 7:30 PM (8 slots)
* Appointments are booked in **serial order**
* Specialization is mandatory for booking

---

## 🔄 Flow

1. Front Desk Executive selects **Book Appointment**
2. System asks for:

  * Patient details (or existing patient)
  * Required **Specialization**
3. System filters doctors based on specialization
4. System checks for first available slot
5. If multiple doctors match:

  * One doctor is selected
6. Appointment is booked
7. Slot is marked as occupied

---

## ⚙️ Key Functionalities

### 1. 🏥 Specialization-Based Booking

* User selects specialization (Enum)
* Example:

  ```
  CARDIOLOGIST, NEUROLOGIST, ORTHOPEDIC
  ```

---

### 2. 🔍 Filtered Doctor Search

* Only doctors matching specialization are considered
* Improves accuracy of treatment

---

### 3. ✅ Combined Condition Check

A doctor is selected only if:

```
Specialization matches AND Slot is available
```

---

### 4. 📅 Slot Allocation

* First available slot is assigned
* Prevents skipping slots

---

### 5. 📦 Appointment Object

* Stores:

  * Patient reference
  * Doctor reference
  * Slot timing

---

## 🏗️ System Changes

### 1. 🖥️ FrontDeskMenu Updates

* Added specialization input
* Updated booking logic to include filtering

---

### 2. 🔎 Enhanced Search Logic

* Stream API used for filtering:

```java
doctorList.stream()
    .filter(doc -> doc.getSpecialization() == requiredSpecialization)
    .filter(doc -> doc.hasAvailableSlot())
    .findFirst();
```

---

### 3. 📊 Enum Usage

* Specialization handled using Enum
* Compared using:

```java
doc.getSpecialization() == requiredSpecialization
```

---

## 📌 Example

### Input:

```id="n4k2qp"
Patient: Ravi
Specialization: CARDIOLOGIST
```

### Output:

```id="m8z1xy"
Appointment Booked Successfully!
Doctor: Dr. Mehta (Cardiologist)
Time: 10:00 AM
```

---

## 🧪 Scenario Handling

### ✔ Matching Doctor Available

* Appointment booked successfully

### ❌ No Doctor with Required Specialization

```id="v3p9rs"
No doctors available for selected specialization.
```

---

### ❌ All Slots Full

```id="b7k4lm"
No slots available. Please try later.
```

---

## 📚 Concepts Learned

* ✅ Stream API (filter, findFirst, anyMatch)
* ✅ Enum Comparison using `==`
* ✅ Functional Programming in Java
* ✅ Logical AND conditions
* ✅ Improved Search Efficiency

---

## 🆚 Improvement Over UC9

| Feature         | UC9              | UC10          |
| --------------- | ---------------- | ------------- |
| Specialization  | ❌ Not considered | ✅ Implemented |
| Doctor Matching | Random           | Filtered      |
| Accuracy        | Basic            | High          |
| Stream API      | ❌                | ✅             |

---

## 🏁 Conclusion

UC10 significantly improves the system by ensuring:

* Patients are matched with the correct specialist
* Efficient and accurate appointment booking
* Better healthcare service quality

This sets the stage for advanced features like:

* Priority booking
* Emergency handling
* Specialist availability tracking

---
