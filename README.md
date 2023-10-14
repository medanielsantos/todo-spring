## About the Course

In this course we created a TO-DO List project, and in it we addressed the concept of API, and used Spring Boot as a framework, implemented a repository layer and filters, authentication.

## Content:

- Dependency management;
- Integration with Database;
- CRUD (Create, Read, Update, Delete) Tasks, User
- User authentication;
- Repositories
- Routes
- Data Validation
- Deployment (Render)

## Dependencies

- Java 17+;
- Maven;
- Spring Boot;
- Lombok;
- Postgres;
- Bcrypt;

## Collection

[Collection (Postman)](https://www.postman.com/medanielsantos/workspace/to-do-java/collection/12090850-c241c008-a83e-433b-9c74-2dcc886f270e?action=share&creator=12090850&active-environment=12090850-69c8d10e-6184-4cea-97d0-67e26c7fee10)

## Runing Code

    mvn spring-boot:run

## Request

### Create User

`POST /users/`

    {
    "name": "Daniel",
    "username": "daniel",
    "password": "456789"
    }

### List All Task

`GET /tasks/`

### Create Task

`POST /tasks/`

    {
        "title": "Test API",
        "description" : "Test API Description",
        "priority": "High",
        "startAt": "2023-12-14T12:20:00",
        "endAt": "2023-15-14T17:20:00"
    }

### Update Task

`PUT /tasks/:id`

### Delete Task

`DELETE /tasks/:id`
