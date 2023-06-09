# Office Application

## Overview
Office-app is a REST API where registered user only after authentication process have possibility to moving by endpoints .

Service includes such tools as:

* Password hashing (BCrypt)

## Application functions
Without JWT token you have access only to these endpoints:
```
/authenticate
/register
```
After authorization, you will get JWT token, than needed for getting access to another endpoints:  
```
/users?age=
/users/color?color=
/users/unique-names
/users/article
```
## Project is based on 3-layered architecture:

* Data access layer (repository)
* Application layer (service)
* Presentation layer (controller)

## Technologies used

* Java 8
* Spring Boot (Data, Security, Web)
* JWT
* Lombok
* JavaFaker
* JUnit5
* H2
* Maven

## How to run this project

1. Pull this project into IDE
2. Load dependencies which are described in `pom.xml`
3. Import postman collection from `src/main/resources`
4. Run the project
5. Interact with end points using <a href="https://www.postman.com">Postman</a>