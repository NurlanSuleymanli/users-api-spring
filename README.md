# PracticeSpring

A basic Spring Boot CRUD practice project for managing **Users** via REST APIs.  
This project uses **plain JDBC** to connect to **PostgreSQL** (no JPA/Hibernate).

---

## Features
- Create a user
- Get all users
- Get user by ID
- Update user email by ID
- Delete user by ID

---

## Tech Stack
- Java
- Spring Boot (REST)
- Gradle
- PostgreSQL
- JDBC (DriverManager + PreparedStatement)

---

## API Endpoints
Base URL: `http://localhost:8080`

| Method | Endpoint     | Description              |
|-------:|--------------|--------------------------|
| POST   | `/users`     | Create a new user        |
| GET    | `/users`     | Get all users            |
| GET    | `/users/{id}`| Get user by id           |
| PUT    | `/users/{id}`| Update user mail by id   |
| DELETE | `/users/{id}`| Delete user by id        |

---

## Request Examples

### Create user
**POST** `/users`

```json
{
  "id": 1,
  "name": "Nurlan",
  "surname": "Suleymanli",
  "age": 22,
  "mail": "nurlan@example.com"
}
Get all users
GET /users

Get user by id
GET /users/{id}
Example: /users/1

Update user mail
PUT /users/{id}

This endpoint expects a String in the request body (just the email value).
Example request body:

newmail@example.com
Delete user
DELETE /users/{id}
Example: /users/1

Database Setup (PostgreSQL)
1) Create database
Create a database named:

practicespring

2) Create table
Run this SQL:

CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  surname VARCHAR(100) NOT NULL,
  mail VARCHAR(150) NOT NULL,
  age INT NOT NULL
);
Configuration (Database Connection)
Database connection is currently hardcoded inside UserRepository:

URL: jdbc:postgresql://localhost:5432/practicespring

Username: postgres

Password: postgres

If your local PostgreSQL settings are different, update these values in UserRepository.

How to Run
Option 1: IntelliJ IDEA
Run the main class:

PracticeSpringApplication

Option 2: Terminal (Gradle)
Mac/Linux

./gradlew bootRun
Windows

gradlew.bat bootRun
After starting the app, the API will be available at:

http://localhost:8080/users

Notes / Possible Improvements
Move DB credentials to application.properties

Add validations and proper error handling (e.g., user not found)

Return meaningful responses instead of void

Add Swagger/OpenAPI documentation

Add unit/integration tests