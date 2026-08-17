# Contact App REST APIs

This Spring Boot app exposes layered REST APIs for managing contacts.

## Base URL

`/api/contacts`

## APIs

### 1. Create Contact

`POST /api/contacts`

Request body:

```json
{
  "name": "Aman Sharma",
  "email": "aman@gmail.com",
  "mobNo": "9876543210"
}
```

Response:

```json
{
  "id": 1,
  "name": "Aman Sharma",
  "mail": "aman@gmail.com",
  "mobNo": "9876543210"
}
```

Status code: `201 Created`

### 2. Get All Contacts

`GET /api/contacts`

Response example:

```json
[
  {
    "id": 1,
    "name": "Aman Sharma",
    "mail": "aman@gmail.com",
    "mobNo": "9876543210"
  },
  {
    "id": 2,
    "name": "Neha Verma",
    "mail": "neha@gmail.com",
    "mobNo": "9123456780"
  }
]
```

Status code: `200 OK`

### 3. Get Contact By Id

`GET /api/contacts/1`

Response:

```json
{
  "id": 1,
  "name": "Aman Sharma",
  "mail": "aman@gmail.com",
  "mobNo": "9876543210"
}
```

Status code: `200 OK`

If the id does not exist, the API returns `404 Not Found`.

### 4. Update Contact

`PUT /api/contacts/1`

Request body:

```json
{
  "name": "Aman Kumar",
  "email": "aman.kumar@gmail.com",
  "mobNo": "9999999999"
}
```

Response:

```json
{
  "id": 1,
  "name": "Aman Kumar",
  "mail": "aman.kumar@gmail.com",
  "mobNo": "9999999999"
}
```

Status code: `200 OK`

### 5. Delete Contact

`DELETE /api/contacts/1`

Status code: `204 No Content`

If the id does not exist, the API returns `404 Not Found`.

## Additional Routes

- `GET /` returns a small HTML landing page.
- `GET /home` returns the same landing page.

## Validation Rules

- `name` must not be blank
- `email` must be a valid email
- `mobNo` must not be blank

## Notes

- Data is stored in an H2 in-memory database.
- H2 console is enabled at `/h2-console`.
- CORS is enabled for browser clients.
