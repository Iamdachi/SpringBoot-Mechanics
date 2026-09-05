### How does Spring Boot itself Work?

```java
SpringApplication.run(BootMechanicsApplication.class, args);
```
SpringApplication.run() - hold Environment, creates ApplicationContext, creates all the beans, starts the web server.  

BootMechanicsApplication.class is given because it is like a componentscan - find Components in this package.  

args — command-line flags you might pass: java -jar app.jar --server.port=8081  

### Tomcat Server
What is Tomcat?  Web Server/Servlet Container. An implementation of Jakarta EE:  
- Java Servlet  - class that responds to HTTP request.  
- JavaServer Pages, Java Expression Language, Java WebSockets  

How is Tomcat Auto Embedded in Spring Boot?  
spring-boot-starter-web includes Tomcat by including spring-boot-starter-tomcat.  

### Netty
What is Netty? Why switch?  
Explain how Spring Boot's Auto-Configuration engine decides not to load an embedded Tomcat server if you switch to Netty.


