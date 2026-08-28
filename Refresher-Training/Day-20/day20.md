# Day 20 - Fundoo Notes Application

## Overview

On Day 20, I updated the documentation for the **Fundoo Notes Application** to reflect the current project state and its latest architecture.

The application has evolved into a more complete backend system with:

* JWT-based authentication and authorization
* Notes, labels, and checklist management
* Redis-based caching support
* RabbitMQ-based asynchronous messaging
* Separate controller, service, repository, entity, DTO, mapper, security, and config layers

This update focuses on documenting the app as it exists now, so the project structure and feature set are easier to understand and track.

---

## Application Summary

The Fundoo Notes Application is a Spring Boot backend for managing notes and related features such as labels and checklists.

Current modules in the application include:

* User management
* Authentication and login
* Notes management
* Label management
* Checklist management
* Security configuration
* Redis caching configuration
* RabbitMQ producer and consumer flow

---

## Core Features Documented

### 1. User Management

The application supports user registration and authentication.

Documented responsibilities:

* Register new users
* Authenticate users with JWT
* Protect application routes with Spring Security
* Keep user data isolated per authenticated account

### 2. Notes Management

Notes are the primary feature of the application.

Documented operations include:

* Create notes
* Update notes
* View notes
* Archive notes
* Pin notes
* Trash and restore notes
* Permanently delete notes

### 3. Label Management

Labels are used to categorize and organize notes.

Documented responsibilities:

* Create labels
* Assign labels to notes
* Maintain note-label relationships

### 4. Checklist Management

Checklist support is included as part of the Fundoo data model.

Documented responsibilities:

* Create checklist items
* Track checklist data linked to notes
* Return checklist information through DTOs

---

## Security Documentation

The application uses **JWT authentication** with Spring Security.

Documented security components:

* `SecurityConfig`
* `JwtService`
* `JwtFilter`
* `CustomUserDetailsService`

### Security Flow

```text
Client
  |
  v
Login Request
  |
  v
JWT Generated
  |
  v
Protected API Request
  |
  v
JWT Validation
  |
  v
Authorized Access
```

---

## Redis Caching

The current project includes Redis support for caching.

Documented cache-related work:

* Redis configuration added in the project
* Spring cache support included in dependencies
* Cache layer prepared for faster read operations
* Cache invalidation strategy considered for updated records

### Cache Flow

```text
Request
  |
  v
Check Cache
  |
  +----> Hit  -> Return Cached Data
  |
  +----> Miss -> Fetch from Database -> Store in Cache -> Return Response
```

---

## RabbitMQ Messaging

RabbitMQ support has also been added to the application.

Documented messaging components:

* RabbitMQ configuration
* Producer implementation
* Consumer implementation
* Asynchronous event handling support

### Messaging Flow

```text
Application Event
  |
  v
Producer
  |
  v
Exchange
  |
  v
Queue
  |
  v
Consumer
```

RabbitMQ is used to support non-blocking communication for application events.

---

## Project Structure

The codebase is organized into the following main packages:

* `controller`
* `service`
* `repository`
* `entity`
* `dto`
* `mapper`
* `security`
* `config`
* `producer`
* `consumer`

This structure keeps the application modular and easier to extend.

---

## Technologies Used

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Spring Cache
* Redis
* RabbitMQ
* JWT
* MySQL
* Maven
* Lombok

---

## Learning Outcomes

By documenting the Fundoo Notes Application on Day 20, I reinforced:

* How the backend is structured across layers
* How JWT security protects APIs
* How caching improves response time
* How RabbitMQ supports asynchronous communication
* How notes, labels, and checklist modules fit together in the same application

---

## Day 20 Status

**Completed**

Updated the Fundoo Notes Application documentation to reflect the latest backend architecture, security setup, caching support, and RabbitMQ messaging flow.
