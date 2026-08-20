# Contact App REST APIs

This Spring Boot app exposes layered REST APIs for managing contacts.

## Base URL

`/api/contacts`

## APIs

### 0. Login

`POST /api/auth/login`

Request body:

```json
{
  "username": "contactadmin",
  "password": "admin12345"
}
```

Response:

```json
{
  "token": "eyJhbGciOiJIUzI1NiIs...",
  "tokenType": "Bearer",
  "username": "contactadmin",
  "roles": ["ADMIN"],
  "expiresInMinutes": 60
}
```

Use the token in the `Authorization` header:

```http
Authorization: Bearer <token>
```

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

- `name` must be between 2 and 60 characters
- `email` must be a valid email
- `email` must be at most 100 characters
- `mobNo` must be exactly 10 digits
- `username` and `password` are required for login

## Security

- The API is protected with JWT bearer authentication.
- Public pages: `/` and `/home`
- Public auth route: `/api/auth/login`
- Read access: `GET /api/contacts/**` for `USER` and `ADMIN`
- Write access: `POST`, `PUT`, `DELETE /api/contacts/**` for `ADMIN`
- Use the default local credentials unless you override them with environment variables:
  - `APP_ADMIN_USERNAME`
  - `APP_ADMIN_PASSWORD`
  - `APP_USER_USERNAME`
  - `APP_USER_PASSWORD`
  - `APP_ALLOWED_ORIGINS`
- `APP_JWT_SECRET`
- `APP_JWT_EXPIRATION_MINUTES`
- Local default credentials:
  - admin username: `contactadmin`
  - admin password: `admin12345`
  - user username: `contactuser`
  - user password: `user12345`
- H2 console is enabled only in the `dev` profile and disabled in `prod`.
- CORS is limited to the configured front-end origins instead of `*`.

## Notes

- Data is stored in an H2 in-memory database.
- In `dev`, the H2 console is available at `/h2-console`.
