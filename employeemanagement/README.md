# Assignment: Employee Management System

## Objective
Create a Spring Boot application using **Spring Data JPA** to perform full CRUD operations on an **Employee** entity, along with a set of practical and business-driven **REST API** endpoints.

## Project Structure
Organize the codebase into the following logical packages:
- `controller`
- `service`
- `repository`
- `model/entity`
- `dto` (optional)

## Entity: Employee
Fields:
- `ID`
- `Name`
- `Email`
- `Department`
- `Salary`
- `isDeleted`
- `CreatedAt`
- `UpdatedAt`

> **Note:** Use automatic timestamps for tracking creation and updates.

## Basic CRUD Operations
Implement REST API endpoints to:
- **Create** a new employee
- **Retrieve** all employees
    - Add **pagination** and **sorting** (`sortField` and `sortDirection`)
- **Retrieve** an employee by **ID**
- **Update** an employee by **ID**
- **Delete** an employee by **ID** (*soft delete*)
- **Get** employees by **department**

## Database
- Use **MySQL** as the database.
