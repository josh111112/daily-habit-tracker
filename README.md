# Daily Habit Tracker

A full-stack web application designed to help users track their daily habits, build consistency, and monitor their progress over time. 

This project was built from the ground up to demonstrate proficiency in modern web development, highlighting a clear separation of concerns between a robust backend API and a dynamic, component-driven frontend.

## 🚀 Tech Stack

### Backend (Java & SQL)
- **Java 21**: Leveraging the latest Java features for clean and maintainable code.
- **Spring Boot 3.5**: Rapid application development providing RESTful APIs, dependency injection, and application context configuration.
- **Spring Data JPA & Hibernate**: Object-Relational Mapping (ORM) for seamless database interactions.
- **H2 Database (SQL)**: In-memory relational database for rapid prototyping and testing, demonstrating SQL table design and query management.
- **Maven**: Dependency management and build automation.

### Frontend (Angular)
- **Angular 22**: Modern, component-based frontend framework for building single-page applications (SPAs).
- **TypeScript**: Strictly typed JavaScript to reduce runtime errors and improve developer experience.
- **RxJS**: Reactive programming for handling asynchronous data streams (e.g., API requests).
- **HTML/CSS**: Responsive UI design.

## 🏗️ Architecture Overview

The application follows a standard **Client-Server architecture**:
1. **Frontend (Angular)**: Handles the user interface, routing, and state management. It communicates with the backend via HTTP requests.
2. **Backend (Spring Boot)**: Exposes RESTful API endpoints (`GET`, `POST`, `PUT`, `DELETE`). It contains the core business logic and handles data validation.
3. **Database (H2/SQL)**: Persists application data (habits, logs, user data). The repository layer in Spring Boot interfaces directly with the database using SQL concepts under the hood.

## 🌟 Features (Implemented & Planned)

- **Habit Management**: Create, read, update, and delete daily habits.
- **Daily Logging**: Mark habits as complete or incomplete for the current day.
- **Progress Tracking**: View streaks and completion rates to stay motivated.
- **Responsive Design**: Accessible on both desktop and mobile devices.

## 🛠️ Getting Started

### Prerequisites
- [Java Development Kit (JDK) 21+](https://jdk.java.net/21/)
- [Node.js](https://nodejs.org/) (for Angular CLI and npm)
- Maven (or use the provided Maven Wrapper)

### Running the Backend (Spring Boot)

1. Navigate to the project root directory.
2. Run the application using the Maven wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```
3. The server will start on `http://localhost:8080`.

### Running the Frontend (Angular)

1. Open a new terminal and navigate to the frontend directory:
   ```bash
   cd frontend
   ```
2. Install the necessary dependencies:
   ```bash
   npm install
   ```
3. Start the development server:
   ```bash
   npm start
   ```
4. The frontend will be accessible at `http://localhost:4200`.

## 📈 Skills Demonstrated

- **Full-Stack Integration**: Connecting an Angular frontend to a Spring Boot backend securely and efficiently.
- **API Design**: Building standard RESTful principles for clear client-server communication.
- **Database Modeling**: Structuring relational SQL data using JPA entities.
- **Component-Driven UI**: Building reusable and modular components in Angular.

---
*This project was developed as a hands-on learning experience to master Java, SQL, and Angular in a real-world application context.*