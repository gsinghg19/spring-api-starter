# The Ultimate Spring Boot Course

This repository contains the starter project for Part 2 of my Spring Boot course:

[https://codewithmosh.com/p/spring-boot-building-apis](https://codewithmosh.com/p/spring-boot-building-apis)

## About this Repository

This project is based on the final project from Part 1 of the course, but I’ve cleaned it up and removed unnecessary playground code so we can focus on building APIs in Part 2.

You’ll be cloning this repository and coding along with me as we extend the project.

To get started, clone the repository to your local machine:

```sh
git clone https://github.com/mosh-hamedani/spring-api-starter

cd spring-api
```

## Getting Started

### Prerequisites

- **Java 21 or higher** (Java 25 recommended)
- **MySQL 8.0+** running on `localhost:3306`
- **Maven** (included via Maven Wrapper)

### Installation Steps

1. **Clone the repository** (if you haven't already):

   ```sh
   git clone https://github.com/mosh-hamedani/spring-api-starter
   cd spring-api-starter
   ```

2. **Configure Database Credentials**

   Create a `.env` file in the project root with your MySQL credentials:

   ```properties
   DB_USERNAME=your_mysql_username
   DB_PASSWORD=your_mysql_password
   ```

   You can use `.env_dev` as a reference.

3. **Run the Application**

   **Windows:**

   ```cmd
   mvnw.cmd spring-boot:run
   ```

   **Linux/Mac:**

   ```sh
   ./mvnw spring-boot:run
   ```

4. **Access the Application**

   Once running, open your browser and navigate to:

   - Home: `http://localhost:8080/`
   - Users API: `http://localhost:8080/users`
   - Actuator: `http://localhost:8080/actuator`

### Changing Java Version

If you encounter compilation errors related to Java version, you may need to adjust the Java version used by the project.

**Option 1: Install the Required Java Version**

Ensure you have Java 25 (or the version specified in `pom.xml`) installed:

```sh
java -version
```

If needed, download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [Adoptium](https://adoptium.net/).

**Option 2: Downgrade Project Java Version**

If you're using an older Java version (e.g., Java 17 or 21), update the following files:

1. **pom.xml** - Change the Java version:

   ```xml
   <properties>
       <java.version>21</java.version>
   </properties>
   ```

2. **src/main/resources/application.yaml** - Update the Java version:
   ```yaml
   spring:
     java:
       version: 21
   ```

After making changes, rebuild the project:

```sh
mvnw.cmd clean install
```

### Troubleshooting

**Database Connection Issues:**

- Verify MySQL is running: `mysql -u root -p`
- Check credentials in your `.env` file
- Ensure MySQL is accessible on `localhost:3306`

**Port Already in Use:**

- Change the port in `src/main/resources/application.yaml`:
  ```yaml
  server:
    port: 8081
  ```

**Java Version Errors:**

- Ensure `JAVA_HOME` environment variable points to the correct Java installation
- Verify Java version matches the one specified in `pom.xml`

### Database Schema

The project uses Flyway for database migrations. The initial schema will be created automatically when you first run the application. The migration script is located at:

```
src/main/resources/db/migration/V1__initial_migration.sql
```

The database `store_db` will be created automatically if it doesn't exist.
