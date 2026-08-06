# HealthClinicApp

A console-based Health Clinic management app built in layered Java:
UI -> Service -> DAO -> DTO -> MySQL.

It uses the DAO/DTO/Service pattern, HikariCP connection pooling, and a transactional
"Complete Appointment" flow that saves the appointment update, bill, and visit record
in one atomic unit.

## What is included

- `database/health_clinic_schema.sql` with the full MySQL schema
  - patients, doctors, specializations, appointments, billing, visit_history, audit_log
  - foreign keys and indexes
  - a UNIQUE constraint on billing to prevent double billing
  - audit triggers on billing inserts and updates
  - seed specializations
- Full CRUD DAOs for all entities
- `AppointmentService` for transactional appointment completion
- `ConsoleMenu` for all UI operations
- `HikariConnectionPool` for pooled MySQL connections

## Requirements

- JDK 17
- Maven
- MySQL Server
- Optional: MySQL Workbench

## Database setup

The app is configured to connect with:

- Host: `localhost`
- Port: `3306`
- Database: `health_clinic_db`
- User: `clinic_app_user`
- Password: `StrongPassword123!`

The same values are used in:

- `src/main/java/com/clinic/config/HikariConnectionPool.java`
- `database/health_clinic_schema.sql`

### Option 1: Import using MySQL Workbench

1. Open MySQL Workbench and connect to your MySQL server.
2. Open `database/health_clinic_schema.sql`.
3. Run the script.
4. If Workbench shows that `clinic_app_user` already exists, run this instead of `CREATE USER`:

```sql
ALTER USER 'clinic_app_user'@'localhost' IDENTIFIED BY 'StrongPassword123!';
GRANT SELECT, INSERT, UPDATE, DELETE ON health_clinic_db.* TO 'clinic_app_user'@'localhost';
FLUSH PRIVILEGES;
```

### Option 2: Import using terminal

Run this from the project root:

```bash
mysql -u root -p < database/health_clinic_schema.sql
```

If the user already exists, use the same `ALTER USER` commands shown above.

## Build and run

```bash
mvn clean package
java -jar target/HealthClinicApp.jar
```

The Maven Shade plugin bundles the MySQL driver and HikariCP into the runnable jar.

## How the database connection works

- `Main` starts the app and opens `ConsoleMenu`
- DAOs and services call `HikariConnectionPool.getConnection()`
- HikariCP reuses a small pool of ready connections instead of opening a new connection every time
- `Main` shuts the pool down cleanly when the app exits

## Quick verification

1. Add a patient and doctor.
2. Book an appointment.
3. Complete the appointment.
4. Check these tables:

```sql
SELECT status FROM appointments WHERE appointment_id = 1;
SELECT * FROM billing WHERE appointment_id = 1;
SELECT * FROM visit_history WHERE appointment_id = 1;
SELECT * FROM audit_log;
```

You should see:

- appointment status changed to `Completed`
- one billing row
- one visit_history row
- one audit_log row for the billing insert

## Troubleshooting

- `Error Code: 1396` while creating the user:
  - the user already exists
  - use `ALTER USER` instead of `CREATE USER`
- App cannot connect to MySQL:
  - confirm MySQL is running
  - confirm the password in `HikariConnectionPool.java`
  - confirm the database name is `health_clinic_db`
- `java: command not found` or `mvn: command not found`:
  - install JDK 17 and Maven, then restart the terminal

## Notes

- Deleting a patient or doctor cascades to related appointments, billing, and visit history.
- `cancelAppointment` and `completeAppointment` live in the service layer because they manage appointment lifecycle logic.
- SQL stays inside the DAO layer; the UI only works with DTO objects.
