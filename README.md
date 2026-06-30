# Use Case 13: Functional Logging (Traceability)

## Goal
Record all successful business operations like doctor registration and appointment booking.

## Actor
Admin

## Flow
1. When doctor registration is completed, a log is created.
2. When appointment booking is completed, a log is created.
3. Each log stores action, time, and status.
4. Admin can view logs using "View Audit Logs" option.

## Key Changes
- Logging is triggered automatically after successful operations.
- Integrated logging into:
  - registerDoctor()
  - bookAppointment()
- Logs contain:
  - Action performed
  - Timestamp
  - Status (Success)

## Concepts Learned
- Event-Driven Programming (action triggers another action)
- Traceability (tracking system activities)
- Logging best practices

## Outcome
- All important operations are recorded
- Admin can track system activities easily
- Helps in debugging and monitoring