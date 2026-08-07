# Refresher Training

**Name:** Anushka Singhal
**Repository:** BridgeLabz-Training
**Branch:** Refresher-Training

## Objective

This branch contains my day-wise backend refresher training assignments, practice programs, and progress updates.

---

## Progress Tracker

| Day | Date | Topics Covered | Status |
| --- | --- | --- | --- |
| Day 1 | 31-Jul-2026 | MySQL basics, database creation, tables, CRUD operations, users and privileges | Completed |
| Day 2 | 03-Aug-2026 | Database normalization, ER modeling, relationships, indexing, EXPLAIN analysis | Completed |
| Day 3 | 04-Aug-2026 | SQL joins, stored procedures, parameters, error handling, triggers | Completed |
| Day 4 | 05-Aug-2026 | Health clinic app, Spring Boot, JDBC, MySQL connection, DAO/service layer | Completed |
| Day 5 | 06-Aug-2026 | Spring Boot greeting app setup, controller/service structure, Maven project configuration | Completed |
| Day 6 | 07-Aug-2026 | Spring Boot REST API, CRUD endpoints, in-memory service layer, servlet integration | Completed |

---

## Folder Structure

```text
Refresher-Training/
+-- Day-1/
+-- Day-2/
+-- Day-3/
+-- Day-4/ (HealthClinicApp)
+-- Day-5/ (greeting-app)
+-- Day-6/ (greeting-app)
```

---

## Day 1 Summary

### Topics Covered

- MySQL installation and basics
- Creating and using databases
- Creating tables
- Data types and constraints
- INSERT, UPDATE, DELETE, and SELECT queries
- User creation and privileges

### Assignment Completed

- Practiced basic database setup in MySQL.
- Created and managed tables using SQL.
- Performed CRUD operations on sample data.
- Learned how to create users and assign privileges.

---

## Day 2 Summary

### Topics Covered

- Database normalization
- Functional dependencies
- 1NF, 2NF, and 3NF
- ER modeling
- Relationships between entities
- Indexing
- Composite indexes
- Covering indexes
- EXPLAIN query analysis

### Assignment Completed

- Normalized database tables to reduce redundancy.
- Designed ER diagrams for the Health Clinic domain.
- Worked with relationships between patients, doctors, appointments, and other entities.
- Created and analyzed indexes for query performance.
- Used EXPLAIN to understand query execution plans.

---

## Day 3 Summary

### Topics Covered

- SQL JOINs
- INNER JOIN
- LEFT JOIN
- RIGHT JOIN
- FULL OUTER JOIN using UNION
- SELF JOIN
- CROSS JOIN
- Multiple table JOINs
- Stored procedures
- IN, OUT, and INOUT parameters
- Error handling in procedures
- Triggers

### Assignment Completed

- Practiced different types of SQL JOINs on the Health Clinic database.
- Generated combined reports using multiple related tables.
- Created stored procedures for reusable database operations.
- Used IN, OUT, and INOUT parameters in procedures.
- Added exception handling in stored procedures.
- Implemented triggers for INSERT, UPDATE, and DELETE operations.
- Tested automatic validation and audit behavior through triggers.

---

## Day 4 Summary

### Topics Covered

- Spring Boot project setup
- JDBC based MySQL connection
- DAO pattern
- Service layer implementation
- DTO classes
- Console/test entry point
- Local secret handling

### Assignment Completed

- Built a Health Clinic App using Spring Boot and JDBC.
- Connected the project to a local MySQL database.
- Implemented `patient` and `doctor` table operations through DAO classes.
- Added service classes for business logic separation.
- Created DTOs for patients and doctors.
- Moved local DB credentials out of GitHub-safe files.
- Updated `.gitignore` to keep build output and local config files untracked.

---

## Day 5 Summary

### Topics Covered

- Spring Boot project setup
- Maven project structure
- Controller layer preparation
- Service layer preparation
- Basic application bootstrap

### Assignment Completed

- Created a new Spring Boot `greeting-app` project.
- Set up the Maven build and Spring Boot starter dependencies.
- Added the application entry point class.
- Created controller and service packages for future greeting endpoints.
- Prepared the project structure for building and expanding the greeting app.

---

## Day 6 Summary

### Topics Covered

- Spring Boot REST API development
- CRUD endpoints using `GET`, `POST`, `PUT`, and `DELETE`
- Controller, service, and model layering
- In-memory data storage using concurrent collections
- Servlet-based request handling
- Request DTOs and response models
- Servlet component scanning

### Assignment Completed

- Built REST endpoints under `/api/greetings` for creating, reading, updating, and deleting greetings.
- Implemented an in-memory service layer using a thread-safe map and sequence generator.
- Added request validation defaults for blank names and messages.
- Created a servlet mapped to `/greeting` to demonstrate `doGet()` and `doPost()` handling.
- Structured the project with controller, service, model, and servlet packages.

---

**Last Updated:** 07-Aug-2026
