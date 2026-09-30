# Todo App

A simple full-stack Todo application built with **Java and Spring Boot**, with a basic **HTML, CSS and JavaScript** frontend.

The backend uses **Hibernate/JPA** to interact with a **PostgreSQL** database.

## Technologies

* Java
* Spring Boot
* Hibernate / JPA
* PostgreSQL
* HTML
* CSS
* Vanilla JavaScript
* Maven
* Postman

## Features

* Create multiple todos
* View all todos
* Edit todo titles
* Mark todos as completed/incomplete
* Delete todos
* Set due dates
* Automatic creation timestamps
* Validation for empty todo titles

## API Endpoints

| Method | Endpoint            | Description             |
| ------ | ------------------- | ----------------------- |
| GET    | `/todo`             | Get all todos           |
| POST   | `/todo/add`         | Create todos            |
| PATCH  | `/todo/{id}/edit`   | Edit a todo             |
| PATCH  | `/todo/{id}/toggle` | Toggle completed status |
| DELETE | `/todo/{id}`        | Delete a todo           |

## Frontend

The frontend is built using basic **HTML, CSS and Vanilla JavaScript**. It communicates with the Spring Boot REST API to display and manage the todos.

## Database

The application uses **PostgreSQL** for storing todo data. Hibernate/JPA is used to manage the database interaction.

## Running the Project

1. Clone the repository.
2. Create a PostgreSQL database.
3. Configure the database details in `application.properties`.
4. Run the Spring Boot application.
5. Open the HTML frontend using a local server such as **VS Code Live Server**.

The backend runs on:

```text
http://localhost:8080
```

The API can also be tested using **Postman**.
