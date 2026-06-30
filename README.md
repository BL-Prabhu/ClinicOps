# Use Case 14: Error & Security Logging

## Goal
Record errors and invalid user actions to improve system security and debugging.

## Actor
Admin

## Flow
1. If CSV upload fails, system logs an ERROR.
2. If invalid mobile number is entered, system logs a WARNING.
3. If invalid mobile number is entered multiple times:
  - System counts attempts
  - If threshold is crossed, logs as SECURITY ALERT
4. Admin can view these logs in "View Audit Logs".

## Key Changes
- Added error logging for failed operations (like CSV upload).
- Added warning logs for invalid inputs.
- Implemented attempt counter for mobile number validation.
- Added threshold-based security flagging.

## Log Levels
- INFO → Normal operations
- WARNING → Invalid inputs (e.g., wrong mobile number)
- ERROR → Failed operations (e.g., CSV upload failure)
- SECURITY → Suspicious repeated invalid attempts

## Concepts Learned
- Exception Handling (try-catch for errors)
- Defensive Programming (handling invalid inputs safely)
- Security Logging (detecting suspicious behavior)
- System Monitoring

## Outcome
- System records why operations failed
- Helps in debugging errors
- Detects suspicious user activity
- Improves overall system security