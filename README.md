# Todo Application API

In the fast-paced world of task management, our Todo API project offers a robust solution for users to organize and track their tasks efficiently.

## Task Management

- **Create:** Allow users to create new tasks, enhancing their ability to organize and plan.
- **Update:** Provide the flexibility to modify task details, adapting to changing priorities.
- **Delete:** Empower users to remove completed or irrelevant tasks, maintaining a clutter-free task list.

## Endpoint Details

To interact with the Todo API, use the following endpoints:

- **Create Task:**
```http
POST http://localhost:8080/todo
```
- **Get All Tasks:**
```http
GET http://localhost:8080/todo
```
- **Get Task by ID:**
```http
GET http://localhost:8080/todo/{id}
```
- **Update Task by ID:**
```http
PUT http://localhost:8080/todo/{id}
```
- **Delete Task by ID:**
```http
DELETE http://localhost:8080/todo/{id}
```
