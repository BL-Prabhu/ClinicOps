# 📘 Use Case 6: Bulk Doctor Data Entry using OpenCSV (Optional)

## 🎯 Goal

To enable bulk upload of doctor details from a `.csv` file using the OpenCSV library, while handling data validation and avoiding duplicates.

---

## 🚀 Objective

This use case improves the bulk upload functionality by:

* Allowing partial success (invalid records are skipped, not entire file)
* Preventing duplicate doctor entries
* Providing clear feedback for failed records

---

## 👤 Actor

**Admin**

---

## 🔄 Flow

The flow remains the same as **Use Case 5 (UC5)**:

1. Admin selects **Bulk Data Entry** option
2. System prompts for CSV file path
3. File is read using OpenCSV library
4. Each record is validated and processed
5. Valid records are added to the system
6. Invalid or duplicate records are skipped with messages

---

## ⚙️ Key Functionalities

### 1. 📂 CSV File Processing

* File is read using OpenCSV (`CSVReader`)
* Each row represents one doctor record
* Expected format:

  ```
  Name, Specialization, Experience, Shift
  ```

---

### 2. ⚠️ Handling Format Sensitivity

* If **Specialization** or **Shift** is misspelled:

    * ❌ That record is skipped
    * ✅ Other valid records are processed
* System displays message:

  ```
  Invalid Specialization/Shift : <record>
  ```

---

### 3. 🔁 Duplicate Record Handling

* Duplicate check is performed using:

    * Doctor Name
    * Specialization
    * Experience

* If duplicate found:

    * ❌ Record is skipped
    * ✅ Message shown:

  ```
  Duplicate Doctor Skipped : <name>
  ```

---

### 4. 🆔 Unique ID Generation

* Each valid doctor is assigned a unique ID:

  ```
  Format: D0001, D0002, ...
  ```

---

### 5. 📢 Error Handling

* Invalid records do not stop the process
* Errors handled:

    * Incorrect column count
    * Invalid specialization/shift
    * Number format issues
    * Duplicate entries

---

## ✅ Advantages over UC5

| Feature                 | UC5              | UC6                      |
| ----------------------- | ---------------- | ------------------------ |
| Library Support         | ❌ Manual Parsing | ✅ OpenCSV                |
| Invalid Record Handling | ❌ Stops process  | ✅ Skips only invalid row |
| Duplicate Check         | ❌ Not handled    | ✅ Implemented            |
| Error Feedback          | ❌ Limited        | ✅ Detailed messages      |

---

## 📌 Example CSV

```
John Doe,CARDIOLOGIST,10,MORNING
Jane Smith,NEUROLOGIST,8,EVENING
Invalid Doc,WRONGSPEC,5,MORNING
John Doe,CARDIOLOGIST,10,MORNING
```

---

## 🧪 Expected Output

```
Invalid Specialization/Shift : Invalid Doc,WRONGSPEC,5,MORNING
Duplicate Doctor Skipped : John Doe
Doctors uploaded successfully
```

---

## 📦 Dependencies

* OpenCSV Library
* Apache Commons Lang (required by OpenCSV)

---

## 🏁 Conclusion

UC6 enhances bulk data upload by making the system:

* More robust
* User-friendly
* Fault-tolerant

It ensures that valid data is always processed even if some records contain errors.

---
