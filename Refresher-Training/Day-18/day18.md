# Day 18 – Fundoo Notes Application

## 📌 Overview

As part of **Day 17 of the Refresher Training**, I continued the development of the **Fundoo Notes Application** and implemented **Redis Caching** and **RabbitMQ** to improve application performance and introduce asynchronous message communication.

I also configured **Memurai** as the Redis-compatible service for local development and used **Docker** to create and run a RabbitMQ container with the Management Plugin.

The Fundoo application is currently developed using a **Monolithic Architecture**.

---

## 🚀 Work Completed

### 1. Redis Cache Implementation

Implemented **Redis Caching** in the Fundoo Notes Application to reduce unnecessary database calls and improve application performance.

#### Key Implementations

* Integrated Redis with Spring Boot.
* Configured Spring Cache.
* Used `@EnableCaching` to enable caching support.
* Implemented `@Cacheable` for frequently accessed data.
* Implemented `@CacheEvict` for cache invalidation.
* Configured cache expiration using TTL.
* Configured Redis serialization.
* Tested cache hit and cache miss scenarios.
* Used **Memurai** as the Redis-compatible service on Windows.

#### Cache Flow

```text
Client Request
      |
      v
Spring Boot Application
      |
      v
Check Redis Cache
      |
   +--+--+
   |     |
 Hit    Miss
   |     |
   v     v
Return  Database
 Data      |
           v
       Store Data
        in Redis
           |
           v
      Return Data
```

When the requested data is already available in Redis, the application returns the cached data without making another database query.

When the data is not available in Redis, the application fetches it from the database and stores the result in Redis for subsequent requests.

---

## 2. Memurai Integration

Configured **Memurai** as the Redis-compatible service for the local development environment.

Memurai was used to provide Redis functionality on Windows.

### Memurai Responsibilities

* Run Redis-compatible service locally.
* Store cached application data.
* Handle cache read and write operations.
* Support TTL-based cache expiration.
* Test Redis integration with Spring Boot.

---

## 3. Spring Cache Configuration

Configured Spring Boot caching support for Redis.

The application uses Spring Cache annotations to manage cached data.

### `@Cacheable`

`@Cacheable` is used to store the method response in Redis.

On the first request:

```text
Request
   ↓
Redis Cache
   ↓
Data Not Found
   ↓
Database
   ↓
Store Result in Redis
   ↓
Return Response
```

On subsequent requests:

```text
Request
   ↓
Redis Cache
   ↓
Data Found
   ↓
Return Cached Data
```

This prevents repeated database queries for the same frequently accessed data.

### `@CacheEvict`

`@CacheEvict` is used to remove outdated cached data when the underlying database data is modified or deleted.

```text
Update/Delete Data
        ↓
Database Updated
        ↓
Cache Evicted
        ↓
Next Request
        ↓
Fresh Data from Database
```

---

## 4. RabbitMQ Implementation

Implemented **RabbitMQ** for asynchronous communication in the Fundoo Notes Application.

RabbitMQ provides message-based communication between different components of the application.

### Key Implementations

* Added RabbitMQ dependency.
* Configured RabbitMQ connection.
* Created RabbitMQ configuration.
* Configured Exchange.
* Configured Queue.
* Configured Binding.
* Implemented Producer.
* Implemented Consumer.
* Published messages from the application.
* Consumed messages from the queue.
* Tested message flow successfully.

---

## 5. RabbitMQ Architecture

The implemented RabbitMQ communication follows this flow:

```text
Producer
   |
   v
Exchange
   |
   v
Binding
   |
   v
Queue
   |
   v
Consumer
   |
   v
Message Processing
```

### Producer

The Producer is responsible for publishing messages to RabbitMQ.

```text
Application Event
       ↓
   Producer
       ↓
    RabbitMQ
```

### Exchange

The Exchange receives messages from the Producer and routes them to the appropriate Queue based on the configured binding.

### Queue

The Queue stores messages until they are consumed.

### Consumer

The Consumer listens to the Queue and processes incoming messages.

```text
Queue
  ↓
Consumer
  ↓
Process Message
```

---

## 6. RabbitMQ with Docker

Configured RabbitMQ using **Docker** for the local development environment.

A RabbitMQ container was created using the RabbitMQ image with the **Management Plugin**.

### Docker Setup

The RabbitMQ container provides:

* RabbitMQ message broker.
* RabbitMQ Management UI.
* Queue management.
* Exchange management.
* Binding management.
* Message monitoring.
* Containerized RabbitMQ environment.

### RabbitMQ Docker Flow

```text
Docker
  |
  v
RabbitMQ Container
  |
  +---- RabbitMQ Server
  |
  +---- Management Plugin
  |
  +---- Exchanges
  |
  +---- Queues
  |
  +---- Bindings
```

Using Docker keeps RabbitMQ isolated from the host environment and makes the messaging infrastructure easier to start and manage during development.

---

## 7. RabbitMQ Management

The RabbitMQ Management Plugin was used to monitor and manage the RabbitMQ environment.

The Management UI can be used to check:

* Queues
* Exchanges
* Bindings
* Connections
* Channels
* Message rates
* Consumers
* Queue status

This helped in verifying that messages were successfully published and consumed.

---

## 🔄 Combined Redis + RabbitMQ Flow

The Fundoo application now contains both caching and asynchronous messaging components.

```text
                  Fundoo Application
                         |
             +-----------+-----------+
             |                       |
             v                       v
        Redis Cache              RabbitMQ
             |                       |
             v                       v
         Memurai                  Producer
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

Redis is used for **fast data access and caching**, while RabbitMQ is used for **asynchronous message communication**.

---

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Spring Cache
* Redis
* Memurai
* RabbitMQ
* Docker
* MySQL
* JWT
* Maven

---

## 📂 Project Structure

The Fundoo Notes Application is available in the following repository:

**Fundoo Application:**
https://github.com/devdipanshu/BridgeLabz-Training/tree/Refresher-Training/Fundoo

The application is currently implemented using a **Monolithic Architecture**.

---

## 🎯 Learning Outcomes

Through Day 17, I learned and implemented:

* Redis integration with Spring Boot.
* Spring Cache abstraction.
* `@Cacheable` annotation.
* `@CacheEvict` annotation.
* Redis cache hit and cache miss flow.
* Redis TTL configuration.
* Redis serialization.
* Memurai setup and integration on Windows.
* RabbitMQ fundamentals.
* Producer and Consumer implementation.
* Exchange configuration.
* Queue configuration.
* Binding configuration.
* Asynchronous message communication.
* Running RabbitMQ using Docker.
* RabbitMQ Management Plugin.
* Monitoring queues, exchanges and messages using RabbitMQ Management UI.
* Understanding how caching and message brokers can improve application performance and scalability.

---

## 🔮 Upcoming Development

The next phase of the Fundoo Notes Application will focus on improving the application's architecture and robustness.

### 1. Exception Handling

Implement centralized and structured **Exception Handling** across the application.

Planned improvements include:

* Global Exception Handler.
* Custom exceptions.
* Standardized API error responses.
* Proper HTTP status codes.
* Validation exception handling.
* Resource not found handling.
* Authentication and authorization exception handling.

### 2. Migration to Microservices Architecture

The current Fundoo application follows a **Monolithic Architecture**.

The next major development phase will be to migrate the application towards a **Microservices Architecture**.

Planned microservices may include:

* User Service
* Notes Service
* Label Service
* Checklist Service
* Notification Service
* Authentication Service

Additional components such as:

* API Gateway
* Service Discovery
* Config Server
* Inter-service communication
* RabbitMQ-based asynchronous communication
* Distributed caching

will be explored as part of the microservices migration.

---

## ✅ Day 18 Status

**Completed**

Implemented **Redis Caching using Memurai** and **RabbitMQ-based asynchronous messaging with Docker** in the Fundoo Notes Application.

The application is now ready for the next phase of development involving **Exception Handling** and migration from **Monolithic Architecture to Microservices Architecture**.
