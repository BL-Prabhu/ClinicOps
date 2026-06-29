# 📘 Use Case 12: Logging Infrastructure (Audit Logger)

## 🎯 Goal

To implement a logging system that records important system activities and allows the Admin to view audit logs.

---

## 🚀 Objective

This use case introduces a centralized logging mechanism that:

* Tracks system operations
* Stores logs for future reference
* Improves debugging and monitoring

---

## 👤 Actor

**Admin**

---

## 🔄 Flow

1. System performs actions (e.g., doctor added, patient registered, appointment booked)
2. Each action is logged using `AuditLogger`
3. Log entries are stored in a list
4. Admin selects **View Audit Logs**
5. System displays all recorded logs

---

## ⚙️ Key Functionalities

### 1. 📝 Audit Logging

* Logs important system events such as:

  * Doctor added
  * Patient registered
  * Appointment booked
* Each log contains:

  * Message
  * Log Level (INFO, ERROR, etc.)
  * Timestamp

---

### 2. ⏱️ Timestamp Tracking

* Each log entry records the exact time of action
* Uses **Java Time API**:

  ```java
  LocalDateTime.now()
  ```

---

### 3. 📊 Log Storage

* Logs are stored in:

  ```java
  List<LogEntry>
  ```
* Maintains history of system activities

---

### 4. 👁️ View Audit Logs

* Admin can view all logs from menu
* Displays:

  * Time
  * Level
  * Message

---

## 🏗️ System Changes

### 1. 📄 AuditLogger Class

#### Responsibilities:

* Store logs
* Provide method to log messages

#### Example Method:

```java
public static void log(String message, String level)
```

---

### 2. 📄 LogEntry Class

* Represents a single log record

#### Attributes:

```java
private String message;
private String level;
private LocalDateTime timestamp;
```

---

### 3. 🖥️ AdminMenu Updates

* Added option:

  ```
  View Audit Logs
  ```
* Displays all stored logs

---

### 4. 🔗 Integration Across Modules

* Logging added in:

  * Doctor operations
  * Patient registration
  * Appointment booking

---

## 📌 Example

### Log Entry:

```id="l9k2pd"
[2026-06-29 10:30:15] INFO - Patient Registered: Ravi Kumar
```

---

### Multiple Logs Output:

```id="q4m8zs"
[2026-06-29 09:00:10] INFO - Doctor Added: Dr. Sharma
[2026-06-29 09:15:25] INFO - Patient Registered: Anjali
[2026-06-29 09:30:40] INFO - Appointment Booked: Ravi with Dr. Sharma at 10:00 AM
```

---

## 📚 Concepts Learned

* ✅ Data Structures (List of Objects)
* ✅ Logging Design Pattern
* ✅ Java Time API (`LocalDateTime`)
* ✅ Separation of Concerns
* ✅ Centralized Logging System

---

## 🆚 Improvement Over Previous Use Cases

| Feature           | Before UC12     | After UC12        |
| ----------------- | --------------- | ----------------- |
| Activity Tracking | ❌ Not available | ✅ Implemented     |
| Debugging Support | ❌ Limited       | ✅ Improved        |
| System Monitoring | ❌ No visibility | ✅ Full visibility |

---

## 🏁 Conclusion

UC12 introduces a powerful logging mechanism that:

* Tracks system activities
* Helps in debugging and auditing
* Improves system transparency

This is a foundational step toward:

* File-based logging
* Log levels (DEBUG, WARN, ERROR)
* External logging frameworks (Log4j, SLF4J)

---
