# Doctor-Patient Management System

A Spring Boot application for managing doctors and patients in a healthcare system.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Examples](#examples)
- [Contributing](#contributing)


## Introduction

This Spring Boot project provides a backend solution for managing doctors and patients in a healthcare platform. Doctors can be added, updated, and deleted, and patients can be registered with their symptoms. Additionally, the system suggests doctors based on a patient's symptom and location.

## Features

- CRUD operations for doctors (Create, Read, Update, Delete)
- CRUD operations for patients (Create, Read, Update, Delete)
- Suggesting doctors based on patient symptoms and location

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Swagger
- Other relevant technologies

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Spring Boot development environment (e.g., IntelliJ IDEA, Eclipse)
- Database (e.g., MySQL, PostgreSQL)

### Installation

1. Clone this repository to your local machine.
2. Configure your database connection in `application.properties`.
3. Build and run the project.

## Usage

The project exposes RESTful API endpoints for managing doctors and patients. You can interact with the API using tools like Postman or Swagger (if enabled).

## API Endpoints

- `POST /doctors/add`: Add a new doctor.
- `GET /doctors/{id}`: Retrieve a doctor by ID.
- `GET /doctors/all`: Retrieve a list of all doctors.
- `PUT /doctors/update/{id}`: Update an existing doctor by ID.
- `DELETE /doctors/delete/{id}`: Delete a doctor by ID.
- `POST /patients/add`: Add a new patient.
- `GET /patients/{id}`: Retrieve a patient by ID.
- `GET /patients/all`: Retrieve a list of all patients.
- `PUT /patients/update/{id}`: Update an existing patient by ID.
- `DELETE /patients/delete/{id}`: Delete a patient by ID.
- `GET /doctors/suggest`: Get a list of suggested doctors based on a patient's symptom and location.

## Examples

Here are some examples of how to use the API:

- To add a new doctor:
POST /doctors/add
{
"name": "Dr. John Smith",
"city": "Delhi",
"email": "john@example.com",
"phoneNumber": "1234567890",
"speciality": "Orthopedic"
}



- To suggest doctors for a patient with back pain in Delhi:
GET /doctors/suggest?patientSymptom=back%20pain&patientCity=Delhi



## Contributing

Contributions are welcome! If you'd like to contribute to this project.
