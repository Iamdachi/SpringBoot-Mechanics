### Basics flow of Servlet API

https://www.youtube.com/watch?v=Eo-e3tDP3D8&list=PLmCsXDGbJHdg4UeHafsaUGNsLF5E0iylZ&index=3


First, embed Tomcat:
```java
Tomcat tomcat = new Tomcat();
tomcat.setPort(8080);
```

Extend HttpServlet method and implement doGet:
```java
@WebServlet("/api/status")
public class HealthServlet extends HttpServlet
    doGet(HttpServletRequest req, HttpServletResponse resp) { ... }
```

Extract header data from HttpServletRequest:
```java
String token = request.getHeader("Authorization");
String clientIp = Optional.ofNullable(request.getHeader("X-Forwarded-For")).orElseGet(request::getRemoteAddr);
```

extend HttpFilter and implement doFilter():  
```java
@WebFilter("/custom-api/*") // Intercepts all requests matching this path
public class CustomAuthFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) { ...}
```