# Health Clinic App

Spring Boot based health clinic application that manages `patient` and `doctor` data using MySQL.

## Tech Stack

- Java 17
- Spring Boot 4.1.0
- Maven
- MySQL
- Lombok

## Project Structure

- `src/main/java/com/example/healthclinicapp/config` - MySQL connection configuration
- `src/main/java/com/example/healthclinicapp/dao` - DAO interfaces
- `src/main/java/com/example/healthclinicapp/daoimpl` - JDBC DAO implementations
- `src/main/java/com/example/healthclinicapp/service` - Service interfaces
- `src/main/java/com/example/healthclinicapp/serviceimpl` - Service implementations
- `src/main/java/com/example/healthclinicapp/dto` - `Patient`, `Doctor`, and `Appointment` DTOs
- `src/main/java/com/example/healthclinicapp/enums` - `Gender` and `Specialization`
- `src/main/java/com/example/healthclinicapp/ui` - Temporary console/test entry point

## Database Setup

Create the database first:

```sql
CREATE DATABASE IF NOT EXISTS health_clinic_db;
USE health_clinic_db;
```

Create the required tables:

```sql
CREATE TABLE IF NOT EXISTS patient (
    patient_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    date_of_birth DATE NOT NULL,
    gender VARCHAR(10) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    address VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS doctor (
    doctor_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    specialization VARCHAR(50) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL
);
```

## Local Configuration

The project reads local MySQL settings from either:

- environment variables: `DB_URL`, `DB_USER`, `DB_PASS`
- JVM system properties: `db.url`, `db.user`, `db.pass`
- `src/main/resources/application-local.properties`
- `src/main/resources/application.properties`

Recommended local file:

```properties
app.db.url=jdbc:mysql://localhost:3306/health_clinic_db
app.db.user=root
app.db.pass=your-local-password
```

> `src/main/resources/application-local.properties` is ignored by Git so your local password stays private.

## Run the Project

```powershell
.\mvnw.cmd spring-boot:run
```

Or build and run the JAR:

```powershell
.\mvnw.cmd clean package
java -jar target\health-clinic-app-0.0.1-SNAPSHOT.jar
```

## Sample Data

Insert test records:

```sql
INSERT INTO patient (name, date_of_birth, gender, phone, address)
VALUES ('Aman', '2000-01-15', 'MALE', '9876543210', 'Delhi');

INSERT INTO doctor (name, specialization, phone, email)
VALUES ('Dr. Rahul', 'ORTHOPEDIC', '9999999999', 'rahul@gmail.com');
```

Read data:

```sql
SELECT * FROM patient;
SELECT * FROM doctor;
```

## Supported Enum Values

### Gender

- `MALE`
- `FEMALE`
- `OTHER`

### Specialization

- `CARDIOLOGIST`
- `NEUROLOGIST`
- `PHYSICIAN`
- `ORTHOPEDIC`

## Notes

- `HealthClinicAppApplication` is the main Spring Boot entry point.
- `UserInterface` currently acts as a simple test/console class.
- DAO classes directly use JDBC connections through `DatabaseConfig`.
- Keep build output like `target/` out of Git.
- Keep local config such as `application-local.properties` out of Git.
