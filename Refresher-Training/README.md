# Refresher Training

**Name:** Anushka Singhal
**Repository:** BridgeLabz-Training
**Branch:** Refresher-Training

## Objective

This branch contains my day-wise Backend Refresher Training assignments, practice programs, and progress updates.

---

## Progress Tracker

| Day   | Date        | Topics Covered                                                                                                               | Status      |
| ----- | ----------- | ---------------------------------------------------------------------------------------------------------------------------- | ----------- |
| Day 1 | 31-Jul-2026 | MySQL Basics, Database Creation, Tables, INSERT, ALTER, UPDATE, DELETE, User & Privileges                                    | ✅ Completed |
| Day 2 | 03-Aug-2026 | Database Normalization (1NF–3NF), ER Modeling, Relationships, Indexing, Composite & Covering Indexes, EXPLAIN Query Analysis | ✅ Completed |

---

## Folder Structure

```text
Refresher-Training/
├── Day-1/
│   ├── Day1_Assignment.sql
│   └── README.md
├── Day-2/
│   ├── Day2_Assignment.sql
│   └── README.md
├── Day-3/
└── ...
```

---

## Day 1 Summary

### Topics Covered

* MySQL Installation
* Verify MySQL Version
* Create Database
* Create Tables
* Insert Records
* ALTER TABLE
* UPDATE & DELETE Queries
* Create MySQL User
* Grant Database Privileges

### Assignment Completed

* Verified MySQL installation using `SELECT VERSION()`
* Created `health_clinic_db`
* Created `specializations` and `appointments` tables
* Inserted sample records
* Practiced `ALTER TABLE`
* Executed `UPDATE` and `DELETE` queries with `WHERE`
* Created `clinic_app_user` with required privileges

---

## Day 2 Summary

### Topics Covered

* Database Normalization (1NF, 2NF, 3NF)
* Entity Relationship (ER) Modeling
* One-to-Many and Many-to-Many Relationships
* Foreign Keys and Composite Primary Keys
* Single-Column, Composite, and Covering Indexes
* Query Execution Analysis using `EXPLAIN`

### Assignment Completed

* Designed a fully normalized Health Clinic database schema.
* Created tables for patients, doctors, appointments, specializations, and patient phone numbers.
* Implemented primary keys, foreign keys, and relationship constraints.
* Added consultation rooms and doctor-room mapping using a junction table.
* Created single-column, composite, and covering indexes to optimize query performance.
* Compared query execution plans using `EXPLAIN` before and after indexing.
* Verified that the `patient_phones` table satisfies 1NF, 2NF, and 3NF.
* Optimized appointment queries using appropriate indexing strategies.

---

**Last Updated:** 03-Aug-2026
