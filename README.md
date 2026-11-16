# Save retrieve photos

A simple example to save and retrieve images on postgreSql using spring-boot.

## Tech stack

- Java 15, built with Maven
- Spring Boot 2.4.1
- Spring Web (REST controllers)
- Spring Data JPA (Hibernate)
- Lombok
- PostgreSQL driver
- Database: PostgreSQL (`photodb` in `application.properties`)

## Data model

| Entity | Fields |
|---|---|
| `Image` | name |

## REST endpoints

Found in the controllers (`ImageController`):

| Method | Path |
|---|---|
| POST | `/images/upload` |
| GET | `/images/get/{id}` |

## Project structure

- `com.chaouki.entreprise.photosExample`: Image, ImageController, ImageRepository, ImageService, PhotosExampleApplication
- Tests: 1 test class

## How to run

Requirements: a JDK 15+ and Maven (or the included Maven wrapper).
Create the `photodb` database and set your own username and password in `src/main/resources/application.properties`.

```bash
./mvnw spring-boot:run
```

The API then listens on `http://localhost:9592`.

---

Author: [Chaouki Bayoudhi](https://github.com/ChaoukiBayoudhi)
