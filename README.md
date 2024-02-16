<h1 align="center">
  TODO List Job Interview Exercise
</h1>

This project has been developed following the criterias from [this challenge](https://github.com/simplify-liferay/desafio-junior-backend-simplify). 

It's an API to manage Task. User is abled to perform all CRUD iteractions.

## Tecnologies
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Lombok](https://projectlombok.org)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Principles adopted
- DRY, KISS, SOLID
- API REST
- DEPENDECY INJECTION
- ERROR HANDLING

## Get Started
- Clone Repository
```
$ git clone https://github.com/PedroFPeralta/ToDoList.git
```

- Build Project
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.1.0.jar
```

Access the aplication in [localhost:8080](http://localhost:8080).

## End Points
Should you visulise end point via [Swagger](http://localhost:8080/swagger-ui.html) 