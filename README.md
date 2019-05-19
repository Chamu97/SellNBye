# Resftful E commerce website

# 'SellNBye' System 

### 1. You can clone it from github by running following command

```
  $ git clone https://github.com/Chamu97/SellNBye.git
```

### 2. Import project into eclipse
```
  File -> Import -> General -> Projects from Folder or Achive -> Diectory/Achive -> Browse Project from cloned location -> Finish
```
### 3. Right click on project in eclipse and then Maven -> Update Projects 

### 4. Create MySQL database

### 5. Update database credential and other configuration into application.properties available in src/main/java/resources

```

spring.datasource.url=jdbc:mysql://127.0.0.1:3307/inventory
spring.datasource.username=PAF
spring.datasource.password=root


```
### 6. Right click on Application.java file and run as Java Application

## Once Sprint Boot Application will be started successfully then we 
can call following Endpoints by using POSTMAN

```
### 7. To run the web application
```
  http://localhost:8080/
