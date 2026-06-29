# 📘 Use Case 7: Register Patient Data

## 🎯 Goal

To allow the Front Desk Executive to register and manage basic patient information in the system.

---

## 🚀 Objective

This use case introduces patient management by:

* Capturing patient details
* Validating mobile numbers
* Generating unique patient IDs
* Allowing patient data viewing

---

## 👤 Actor

**Front Desk Executive**

---

## 🔄 Flow

1. Front Desk Executive selects **Register Patient**
2. Enters patient details:

  * Name
  * Gender
  * Age
  * Mobile Number
3. System validates mobile number (Indian format)
4. System generates a unique Patient ID
5. Patient data is stored successfully
6. Option available to **View Registered Patients**

---

## ⚙️ Key Functionalities

### 1. 🧾 Patient Data Entry

* Required fields:

  ```
  Name, Gender, Age, Mobile Number
  ```
* Data is captured through user input

---

### 2. 🆔 Unique Patient ID Generation

* System auto-generates ID for each patient:

  ```
  Format: P0001, P0002, P0003...
  ```
* Ensures uniqueness even if names are same

---

### 3. 📱 Indian Mobile Number Validation

* Validation is done using **Regex**

* Example pattern:

  ```
  ^[6-9][0-9]{9}$
  ```

* Rules:

  * Must be 10 digits
  * Must start with 6, 7, 8, or 9

* If invalid:

  ```
  Invalid Mobile Number. Please enter a valid Indian number.
  ```

---

### 4. 👁️ View Patient Data

* System provides option to display all registered patients
* Shows:

  * Patient ID
  * Name
  * Gender
  * Age
  * Mobile Number

---

## 🏗️ System Changes

### 1. 📄 Patient Class (`Patient.java`)

* New class created to store patient details

* Attributes:

  * `name`
  * `gender`
  * `age`
  * `mobileNumber`
  * `patientId`

* Helps in future expansion:

  * Medical history
  * Appointments
  * Billing

---

### 2. 🖥️ FrontDeskMenu Updates (`FrontDeskMenu.java`)

#### ➤ Register Patient Method

* Captures user input
* Calls validation
* Generates Patient ID
* Stores patient data

#### ➤ View Patients Method

* Displays all registered patients

---

### 3. 🔧 ScannerHelper Updates (`ScannerHelper.java`)

* Added method to:

  * Read mobile number
  * Validate using regex
  * Re-prompt until valid input

---

## 📌 Example

### Input:

```id="u1k3zl"
Name: Ravi Kumar
Gender: Male
Age: 28
Mobile: 9876543210
```

### Output:

```id="8y7mqp"
Patient Registered Successfully!
Patient ID: P0001
```

---

## 🧪 Invalid Input Example

```id="4pl8ox"
Mobile: 12345
```

### Output:

```id="d1bz9h"
Invalid Mobile Number. Please enter a valid Indian number.
```

---

## 📚 Concepts Learned

* ✅ Object-Oriented Design (Patient class)
* ✅ Unique ID Generation
* ✅ Input Validation using Regex
* ✅ User Input Handling
* ✅ Menu-driven program design

---

## 🏁 Conclusion

UC7 enhances the system by introducing structured patient management.
It ensures:

* Accurate data entry
* Valid mobile numbers
* Scalable design for future features

---
