# Food Api Example
[![Contribute](https://www.eclipse.org/che/contribute.svg)](https://workspaces.openshift.com#https://github.com/dkwon17/food-api-example)

Quarkus REST API with Hibernate ORM, Panache, RESTEasy, and PostgreSQL.

## Endpoints
```
GET  /food                  Lists all Food resources
GET  /food/{id}             Retrieves the Food resource with the specified ID
GET  /food/search/{name}    Retrieves a Food resource with the specified name
POST /food                  Creates a Food resource
```

## Local development
### Run PostgresSQL container
```
docker run -it --rm=true --name food_db -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=food_db -p 5432:5432 postgres:13.3
```

### Run in development mode
```
./mvnw compile quarkus:dev
```
Navigate to `localhost:8080/food` to view the [pre-imported](https://github.com/dkwon17/food-api-example/blob/main/src/main/resources/import.sql) `Food` resources.

### Packaging the application
```
./mvnw clean package
```

### Run tests only
```
./mvnw test
```

## Resources
* https://quarkus.io/guides/maven-tooling
* https://quarkus.io/guides/hibernate-orm-panache
* https://quarkus.io/guides/building-native-image