# Student Management System Documentation

## Overview
This API provides endpoints for managing students and courses in a student management system. It includes features such as creating, reading, updating, and deleting students and courses.

## Endpoints
### Student Endpoints
#### 1. Get All Students

* **URL:** `/student/all`
* **Method:** `GET`
* **Parameters:**
	+ `course`: Optional parameter to filter students by course ID
	+ `feesBalance`: Optional parameter to filter students by fees balance (0 for paid, non-zero for unpaid)
* **Response:** List of students with their details

#### 2. Get Student by ID

* **URL:** `/student/edit/{id}`
* **Method:** `GET`
* **Parameters:**
	+ `id`: Student ID
* **Response:** Student details with the given ID

#### 3. Create Student

* **URL:** `/student/save`
* **Method:** `POST`
* **Request Body:**
	+ `name`: Student name
	+ `age`: Student age
	+ `address`: Student address
	+ `contactNo`: Student contact number
	+ `parentContactNo`: Parent contact number
	+ `fees`: Student fees
	+ `feesPaid`: Student fees paid
	+ `course`: Course ID
* **Response:** Created student ID

#### 4. Update Student

* **URL:** `/student/update`
* **Method:** `POST`
* **Request Body:**
	+ `id`: Student ID
	+ `name`: Student name
	+ `age`: Student age
	+ `address`: Student address
	+ `contactNo`: Student contact number
	+ `parentContactNo`: Parent contact number
	+ `fees`: Student fees
	+ `feesPaid`: Student fees paid
	+ `course`: Course ID
* **Response:** Updated student ID

#### 5. Delete Student

* **URL:** `/student/delete/{id}`
* **Method:** `GET`
* **Parameters:**
	+ `id`: Student ID
* **Response:** Deleted student ID

### Course Endpoints

#### 1. Get All Courses

* **URL:** `/course/all`
* **Method:** `GET`
* **Response:** List of courses with their details

<!-- #### 2. Get Course by ID

* **URL:** `/course/{id}`
* **Method:** `GET`
* **Parameters:**
	+ `id`: Course ID
* **Response:** Course details with the given ID

#### 3. Create Course

* **URL:** `/course/save`
* **Method:** `POST`
* **Request Body:**
	+ `name`: Course name
	+ `description`: Course description
	+ `fees`: Course fees
* **Response:** Created course ID

#### 4. Update Course

* **URL:** `/course/update`
* **Method:** `POST`
* **Request Body:**
	+ `id`: Course ID
	+ `name`: Course name
	+ `description`: Course description
	+ `fees`: Course fees
* **Response:** Updated course ID

#### 5. Delete Course

* **URL:** `/course/delete/{id}`
* **Method:** `GET`
* **Parameters:**
	+ `id`: Course ID
* **Response:** Deleted course ID -->
