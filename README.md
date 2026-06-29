# 📘 Use Case 11: Shift-Aware Appointment Booking

## 🎯 Goal

To book appointments by considering **doctor specialization, shift availability, and slot availability**, ensuring accurate scheduling.

---

## 🚀 Objective

This use case enhances the appointment system by:

* Preventing booking outside a doctor’s shift
* Improving filtering logic
* Ensuring correct doctor-slot assignment

---

## 👤 Actor

**Front Desk Executive**

---

## 📌 Assumptions

* Each doctor is assigned a **specific shift**:

  * Morning Shift OR Evening Shift
* Each doctor has **8 slots per shift**:

  * Morning: 9:00 AM – 12:30 PM
  * Evening: 4:00 PM – 7:30 PM
* Appointments are booked in **serial order**
* Specialization is mandatory

---

## 🔄 Flow

1. Front Desk Executive selects **Book Appointment**
2. System takes:

  * Patient details
  * Required specialization
3. System filters doctors based on:

  * Specialization
  * Shift compatibility
  * Slot availability
4. First matching doctor is selected
5. Appointment is booked
6. Slot is marked as occupied

---

## ⚙️ Key Functionalities

### 1. 🕒 Shift Mapping Logic

* Each doctor has an assigned shift
* System checks if a slot belongs to that shift

#### Example:

```id="x1a9p3"
Morning Doctor → Can only take slots between 9:00 AM – 12:30 PM
Evening Doctor → Can only take slots between 4:00 PM – 7:30 PM
```

* Prevents:

  ```
  Invalid Shift Booking ❌
  ```

---

### 2. 🔍 Tri-Filter Search Logic

Doctor selection now uses **three filters**:

```id="m5k2qz"
Specialization → Shift Compatibility → Slot Availability
```

---

### 3. ✅ Combined Condition Check

A doctor is selected only if:

* Specialization matches
* Slot belongs to doctor’s shift
* Slot is available

---

### 4. 📅 Slot Validation

* Slot must:

  * Belong to correct shift
  * Be unoccupied

---

## 🏗️ System Changes

### 1. 👨‍⚕️ Doctor Class Update

* Added method:

```java id="q8v4ld"
boolean isSlotInShift(String slot)
```

* Checks if given time belongs to doctor’s shift

---

### 2. 🔎 Updated Stream Logic

```java id="c3z7np"
doctorList.stream()
    .filter(doc -> doc.getSpecialization() == requiredSpecialization)
    .filter(doc -> doc.isSlotInShift(slot))
    .filter(doc -> doc.isSlotAvailable(slot))
    .findFirst();
```

---

### 3. 🖥️ FrontDeskMenu Updates

* Integrated shift-aware filtering
* Improved booking accuracy

---

## 📌 Example

### Input:

```id="v2k8hs"
Patient: Anjali
Specialization: NEUROLOGIST
Requested Slot: 5:00 PM
```

### Output:

```id="b9r4xp"
Appointment Booked Successfully!
Doctor: Dr. Rao (Evening Shift)
Time: 5:00 PM
```

---

## 🧪 Scenario Handling

### ❌ Shift Mismatch

```id="d6p1xt"
No doctors available for the selected slot in this shift.
```

---

### ❌ No Matching Doctor

```id="z4m7ls"
No doctors available for selected specialization.
```

---

### ❌ All Slots Full

```id="h2q9vn"
No slots available. Please try later.
```

---

## 📚 Concepts Learned

* ✅ Predicate Chaining in Stream API
* ✅ Multiple Filters (`filter()` chaining)
* ✅ Encapsulation (Shift logic inside Doctor class)
* ✅ Clean and Scalable Design
* ✅ Real-world Scheduling Logic

---

## 🆚 Improvement Over UC10

| Feature               | UC10   | UC11 |
| --------------------- | ------ | ---- |
| Specialization Filter | ✅      | ✅    |
| Slot Availability     | ✅      | ✅    |
| Shift Awareness       | ❌      | ✅    |
| Booking Accuracy      | Medium | High |

---

## 🏁 Conclusion

UC11 makes the system more realistic and robust by:

* Enforcing doctor shift constraints
* Improving filtering logic
* Preventing invalid bookings

This brings the system closer to real-world hospital scheduling systems.

---
