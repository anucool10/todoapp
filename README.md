# To-Do Application

A full-stack task management web application built with a **Spring Boot** REST API backend, **PostgreSQL** database, and a vanilla **HTML/CSS/JavaScript** frontend.

## 🚀 Features

- **Full CRUD Operations:** Create, read, update, and delete tasks seamlessly.
- **Task Completion Toggle:** Mark tasks as complete or active with visual feedback.
- **Inline Editing:** Modify existing task titles via an interactive prompt/modal workflow.
- **Custom Due Dates & Timestamps:** Track creation timestamps and set optional due dates formatted cleanly as `DD/MM/YY`.
- **Frontend Filtering:** Instantly toggle between **All**, **Active**, and **Completed** views.
- **Confirmation Modals:** Custom confirmation dialogs for destructive actions like deleting tasks.

## 🛠️ Tech Stack

- **Backend:** Java, Spring Boot, Spring Data JPA / Hibernate
- **Database:** PostgreSQL
- **Frontend:** HTML5, CSS3, Vanilla JavaScript (Fetch API)
- **Version Control:** Git

## 📂 Project Structure

```text
todo-app/
├── src/
│   ├── main/
│   │   ├── java/com/todo/todoapp/   # Spring Boot Controllers, Services, Repositories, Entities
│   │   └── resources/
│   │       └── application.properties # Database and server configuration
└── static/
    └── index.html                 # Standalone UI with embedded CSS and JavaScript logic
