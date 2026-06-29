# ClinicOps - UC5 Bulk Doctor Upload

## Overview

UC5 introduces bulk upload of doctors using a CSV file.

---

## Features

* Upload multiple doctors from file
* Auto-generate IDs
* Validate specialization & shift using enums
* Batch insert using ArrayList

---

## CSV Format

Name,Specialization,Experience,Shift

Example:
Manohar Das,GENERAL_PHYSICIAN,5,MORNING

---

## Concepts Used

* File I/O (BufferedReader)
* String.split()
* Enum validation
* Try-with-resources
* Batch processing (addAll)

---

## Limitations

* Sensitive to CSV format
* No duplicate check

---

## Git Branch

feature/UC5-bulk-doctor-upload
