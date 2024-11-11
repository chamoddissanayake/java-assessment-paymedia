
# Java Assessment

## Employee Endpoints

### Create Employee

```bash
  POST /api/employees
```

**Description**: Create a new employee.

**Access**: ROLE_ADMIN

**Request Body**: json

```bash
{
  "name": "John Doe",
  "departmentId": 1,
  "position": "Developer",
  "salary": 60000
}
```

**Response**: Created employee details.

###  Get Employee By Id

```bash
  GET /api/employees/{id}
```


**Description**: Retrieve an employee by ID.

**Access**: ROLE_ADMIN, ROLE_USER

**Response**: Employee details for the specified ID.

###  Update Employee By Id

```bash
  PUT /api/employees/{id}
```

**Description**: Update an existing employee.

**Access**: ROLE_ADMIN

**Request Body**: json

```bash
{
  "name": "Jane Doe",
  "departmentId": 2,
  "position": "Manager",
  "salary": 75000
}
```

**Response**: Updated employee details.

### DELETE Employee By Id

```bash
  DELETE /api/employees/{id}
```

**Description**: Delete an employee by ID.

**Access**: ROLE_ADMIN

**Response**: Success message or error if employee not found.

### Get All Employees

```bash
  GET /api/employees
```

**Description**: Retrieve all employees.

**Access**: ROLE_ADMIN, ROLE_USER

**Response**: Paginated list of employees.


## Department Endpoints

### Create Department

```bash
  POST /api/departments
```

**Description**: Create a new department.

**Access**: ROLE_ADMIN

**Request Body**:json

```bash
{
  "name": "Engineering",
  "location": "Colombo"
}
```

**Response**: Created department details.

### Get Department By Id

```bash
  GET /api/departments/{id}
```

**Description**: Retrieve a department by ID.

**Access**: ROLE_ADMIN, ROLE_USER

**Response**: Department details for the specified ID.

### Update Department By Id

```bash
  PUT /api/departments/{id}
```

**Description**: Update an existing department.

**Access**: ROLE_ADMIN

**Request Body**:json

```bash
{
  "name": "Marketing",
  "location": "Colombo"
}
```

**Response**: Updated department details.

### Delete Department By Id

```bash
  DELETE /api/departments/{id}
```

**Description**: Delete a department by ID.

**Access**: ROLE_ADMIN

**Response**: Success message or error if department not found.

### Get All Departments

```bash
  GET /api/departments
```

**Description**: Retrieve all departments.

**Access**: ROLE_ADMIN, ROLE_USER

**Response**: Paginated list of departments.