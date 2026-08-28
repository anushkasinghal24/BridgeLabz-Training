# Day 19 – Fundoo Notes Application

## 📌 Overview

As part of **Day 18 of the Refresher Training**, I continued working on the **Fundoo Notes Application** by identifying and fixing bugs, adding new API endpoints, and revising important **Microservices Architecture** concepts.

The main focus was understanding how the existing **Monolithic Fundoo Application** can be migrated to **Microservices Architecture**, along with concepts such as **API Gateway, Security, Service Discovery, Database per Service, and Inter-Service Communication**.

---

## 🐞 Bug Fixing

* Identified and fixed bugs in the existing Fundoo application.
* Fixed issues in existing endpoints and service-layer logic.
* Improved existing application behavior.
* Verified the updated APIs using **Postman**.

---

## 🚀 New API Endpoints

* Added new REST API endpoints.
* Implemented the required service-layer logic.
* Added repository-level operations where required.
* Integrated the new endpoints with existing authentication and authorization.
* Verified the new APIs using **Postman**.

---

## 🔄 Microservices Concepts Revised

Revised the concepts required to migrate the current monolithic application into microservices.

### Monolithic to Microservices

```text
Monolithic Fundoo
       |
       +---- User
       +---- Notes
       +---- Labels
       +---- Checklist
```

Planned microservices architecture:

```text
                    Client
                      |
                      v
                API Gateway
                      |
          +-----------+-----------+
          |           |           |
          v           v           v
     User Service  Notes Service  Label Service
          |           |           |
        User DB     Notes DB     Label DB
```

---

## 🌐 API Gateway

Revised how **API Gateway** works as the single entry point for clients.

```text
Client
  |
  v
API Gateway
  |
  +----> User Service
  |
  +----> Notes Service
  |
  +----> Label Service
```

### Key Responsibilities

* Request routing
* JWT validation
* Authentication support
* Authorization support
* Load balancing
* Rate limiting
* Request filtering
* Service discovery integration

---

## 🔐 Security in Microservices

Revised how **JWT-based Security** can be managed after migrating to microservices.

```text
Client
  |
  v
API Gateway
  |
  v
JWT Validation
  |
  v
Microservice
  |
  v
Authorization
```

The API Gateway can validate the JWT before forwarding requests to the required microservice, while individual services can handle authorization based on roles and permissions.

---

## 🏗️ Migration Strategy

Revised a gradual approach for migrating the existing Fundoo monolith.

```text
Monolithic Fundoo
       ↓
Identify Modules
       ↓
User Service
       ↓
Notes Service
       ↓
Label Service
       ↓
Checklist Service
       ↓
API Gateway
       ↓
Security
       ↓
Service Discovery
       ↓
Independent Databases
```

---

## 🗄️ Database per Service

Revised the **Database per Service** concept where each microservice manages its own database.

```text
User Service       → User DB
Notes Service      → Notes DB
Label Service      → Label DB
Checklist Service  → Checklist DB
```

---

## 📨 Inter-Service Communication

Revised how services can communicate synchronously and asynchronously.

Since **RabbitMQ** was implemented on Day 17, also revised its role in Microservices Architecture.

```text
Notes Service
      |
      v
   RabbitMQ
      |
      v
Notification Service
```

RabbitMQ can be used for asynchronous communication between services.

---

## 🛠️ Technologies & Concepts

* Java
* Spring Boot
* Spring Security
* JWT
* REST APIs
* MySQL
* Redis
* RabbitMQ
* Docker
* API Gateway
* Microservices Architecture
* Service Discovery
* Database per Service
* Inter-Service Communication

---

## 🎯 Learning Outcomes

Through Day 18, I learned and revised:

* Bug identification and fixing in the existing application.
* Adding new REST API endpoints.
* Microservices Architecture.
* Monolith to Microservices migration strategy.
* API Gateway and request routing.
* JWT Security in Microservices.
* Service Discovery.
* Database per Service.
* Inter-Service Communication.
* Asynchronous communication using RabbitMQ.

---

## 🔮 Upcoming Development

* Start migrating the Fundoo application from **Monolithic Architecture to Microservices**.
* Create independent microservices.
* Implement **API Gateway**.
* Configure **Service Discovery**.
* Implement security across microservices.
* Implement **centralized Exception Handling**.
* Configure inter-service communication.
* Integrate RabbitMQ where required.
* Configure independent databases.
* Dockerize the microservices.

---

## ✅ Day 19 Status

**Completed**

Identified and fixed bugs, added new API endpoints, and revised the concepts required for migrating the Fundoo Notes Application from **Monolithic Architecture to Microservices Architecture**.
