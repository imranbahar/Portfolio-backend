# Portfolio Ecosystem - Enterprise Java Backend

This repository houses the robust, enterprise-grade backend engine for my decoupled personal portfolio ecosystem. Built using Java and the Spring Boot framework, this system functions as a secure RESTful API that handles data persistence, object-relational mapping, and structured content delivery to the frontend client.

## 🛠️ Architectural Stack & Features

- **Framework:** Spring Boot 3.x / 4.x managed via Maven.
- **Data Persistence:** Spring Data JPA with Hibernate ORM core for clean Repository pattern abstraction.
- **Relational Databases:** Cross-compatible architecture supporting localized MySQL (via XAMPP) for development and native cloud-hosted PostgreSQL for production.
- **Database Migrations:** Automatic, safe schema updates managed via Hibernate `ddl-auto` configurations.
- **Security & Separation:** Utilizes environment variable placeholders in `application.properties` to abstract sensitive production connection strings, eliminating database credential leaks.

## 🔌 API Endpoints

The backend exposes microservice-ready JSON endpoints consumed by the UI client layer:

| HTTP Method | Endpoint | Description | Sample Output |
| :--- | :--- | :--- | :--- |
| `GET` | `/api/projects` | Fetches all structured portfolio project objects. | `[{"id":1, "title":"VRMS", ...}]` |

## 📦 Local Installation & Setup

### Prerequisites
- Java Development Kit (JDK 17 or higher)
- XAMPP / Wampserver (Apache & MySQL running on port 3306)
- Maven wrapper (included in source)

### Steps
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/imranbahar/Portfolio-backend.git](https://github.com/imranbahar/Portfolio-backend.git)
   cd Portfolio-backend