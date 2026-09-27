### How does Spring Boot itself Work?

```java
SpringApplication.run(BootMechanicsApplication.class, args);
```
SpringApplication.run() - hold Environment, creates ApplicationContext, creates all the beans, starts the web server.  

BootMechanicsApplication.class is given because it is like a componentscan - find Components in this package.  

args — command-line flags you might pass: 

```bash
java -jar app.jar --server.port=8081  
```

### Tomcat Server
What is Tomcat?  Web Server/Servlet Container. An implementation of Jakarta EE:  
- Java Servlet  - class that responds to HTTP request.  
- JavaServer Pages, Java Expression Language, Java WebSockets  

How is Tomcat Auto Embedded in Spring Boot?  
spring-boot-starter-web includes Tomcat by including spring-boot-starter-tomcat.  

### Netty
🟠 What is Netty? Why switch?  
🟠 Explain how Spring Boot's Auto-Configuration engine decides not to load an embedded Tomcat server if you switch to Netty.

### Spring Data JPA & Hibernate
🟠 How does Spring Data JPA generate SQL queries dynamically from a repository method name like findFirstByStatusAndCreatedAtAfter?  
🟠 Explain the N+1 select problem in Hibernate. How do you diagnose it, and what are three ways to solve it using Spring Data JPA?  
🟠 How do you implement efficient pagination and sorting in Spring Data JPA without pulling the entire dataset into JVM memory?  
🟠 What is the purpose of the Hibernate First-Level Cache (Persistence Context)? How long does its lifecycle last?  
🟠 How do you configure multiple independent DataSources and EntityManagers within a single Spring Boot application?  
🟠 How do you map a many-to-many relationship cleanly in JPA without creating a bloated join table entity unless business logic requires it?  



## Spring Start here
🟠 Services, data, transactions...
🟠 Appendix about architecture, JSON, XML stuff...
