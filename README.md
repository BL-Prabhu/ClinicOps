# 📘 Use Case 8: Check Existing Patient Using Mobile Number

## 🎯 Goal

To prevent duplicate patient registration by checking if a patient is already registered using their mobile number.

---

## 🚀 Objective

This use case improves patient registration by:

* Avoiding duplicate entries
* Saving time for the Front Desk Executive
* Providing a better user experience for returning patients

---

## 👤 Actor

**Front Desk Executive**

---

## 🔄 Flow

1. Front Desk Executive selects **Register Patient**
2. System first asks for **Mobile Number**
3. System searches for the mobile number in existing records
4. If mobile number is found:

  * System displays patient details
  * Shows welcome message (e.g., *Welcome back Mohan*)
  * Registration process stops
5. If mobile number is NOT found:

  * System asks for remaining details:

    * Name
    * Gender
    * Age
  * Patient is registered as in UC7

---

## ⚙️ Key Functionalities

### 1. 📱 Mobile Number First Approach

* Mobile number is taken as the primary input
* Avoids unnecessary data entry for existing patients

---

### 2. 🔍 Lookup Logic (Search Mechanism)

* System searches patient list using mobile number
* Implemented using **Linear Search**
* Each patient is checked one-by-one

---

### 3. 🚫 Duplicate Prevention

* Mobile number acts as a **unique constraint**
* If found:

  ```
  Patient already registered!
  Welcome back <Name>
  ```
* Prevents duplicate entries in system

---

### 4. 🆕 Conditional Registration

* Only new patients are registered
* Existing patients are directly recognized

---

### 5. 👁️ Display Existing Patient Details

* Shows:

  * Patient ID
  * Name
  * Gender
  * Age
  * Mobile Number

---

## 🏗️ System Changes

### 1. 🖥️ FrontDeskMenu Updates

#### ➤ Updated Registration Flow

* Mobile number input moved to first step
* Conditional logic added:

  * If exists → stop
  * If not → continue registration

---

### 2. 🔎 Search Method

* Method added to check existing patients:

  ```java
  Patient findPatientByMobile(String mobileNumber)
  ```
* Returns:

  * Patient object → if found
  * `null` → if not found

---

### 3. 🔐 Encapsulation (Getter Usage)

* `mobileNumber` is private in Patient class
* Accessed using:

  ```java
  getMobileNumber()
  ```

---

## 📌 Example

### Existing Patient Scenario

#### Input:

```id="t6h1sk"
Mobile: 9876543210
```

#### Output:

```id="p2j9lm"
Patient already registered!
Welcome back Ravi Kumar
```

---

### New Patient Scenario

#### Input:

```id="z8n3qp"
Mobile: 9123456789
Name: Anjali
Gender: Female
Age: 25
```

#### Output:

```id="x7k2vd"
Patient Registered Successfully!
Patient ID: P0005
```

---

## 📚 Concepts Learned

* ✅ Linear Search Algorithm
* ✅ Use of `null` for "Not Found"
* ✅ Encapsulation (Getter methods)
* ✅ Conditional Workflow Design
* ✅ Avoiding Duplicate Data

---

## 🆚 Improvement Over UC7

| Feature            | UC7              | UC8          |
| ------------------ | ---------------- | ------------ |
| Duplicate Handling | ❌ Not handled    | ✅ Prevented  |
| Input Flow         | Name first       | Mobile first |
| Efficiency         | ❌ Time-consuming | ✅ Optimized  |
| User Experience    | Basic            | Improved     |

---

## 🏁 Conclusion

UC8 enhances the system by ensuring:

* No duplicate patient records
* Faster registration process
* Better experience for returning patients

It introduces a simple yet powerful validation mechanism using mobile numbers as a unique identifier.

---
