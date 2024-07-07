
# Project Title: Spring Boot Backend & React Frontend Application
## Overview
This project is a full-stack web application that uses a Spring Boot backend and a React frontend. The backend API handles data storage and retrieval, while the frontend provides a user-friendly interface for interacting with the data. The application demonstrates CRUD operations, data visualization, and cross-origin resource sharing (CORS).

# Features
## Backend (Spring Boot)
RESTful API for data management
MongoDB integration for data storage
Configuration for CORS to allow requests from the frontend
Basic error handling and logging
## Frontend (React)
Responsive user interface built with React
Data visualization using charts
Axios for making HTTP requests to the backend API
React Router for navigation
# Prerequisites
## Backend
Java Development Kit (JDK) 11 or higher
Maven
MongoDB
## Frontend
Node.js
npm (Node Package Manager)
# Setup and Installation
## Backend (Spring Boot)
### Clone the repository:

```
git clone https://github.com/your-username/your-repo.git
cd your-repo/backend
```
### Configure the application properties:
Edit the src/main/resources/application.properties file to configure your MongoDB connection:

```
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=BlackCofferDB
spring.mail.host=localhost
```
### Build and run the application:
```
mvn clean install
mvn spring-boot:run
```
Access the API:
The backend server will be running at http://localhost:8080.

### Frontend (React)
Navigate to the frontend directory:


```cd ../frontend```

Install dependencies:



```npm install```

Start the development server:


```
npm run build
npm run preview
```

Access the frontend application:
The frontend server will be running at http://localhost:3000.

## Running the Application
### Backend
Start MongoDB:
Ensure MongoDB is running on your machine.

#### Run the Spring Boot application:

```mvn spring-boot:run```

### Frontend
Start the React development server:
```
npm start
```
## Access the Application
API Endpoints: Visit http://localhost:8080/api.

Frontend: Visit http://localhost:3000.
## API Endpoints

/intensity: Fetches intensity data.

/likelihood: Fetches likelihood data.

/relevance: Fetches relevance data.

/publishers: Fetches publisher data.

/country: Fetches country data.

/region/asia: Fetches data for Asia region.

/region/america: Fetches data for America region.

/region/europe: Fetches data for Europe region.

/region/world: Fetches data for World region.

/region/africa: Fetches data for Africa region.

/sector: Fetches sector data.

/years: Fetches data for start and end years.


