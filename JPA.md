### Basic JPA Flow

JPA standardizes the ORM (Object Relational Mapping) manages the lifecycle of entities and database tables.  

- EntityManagerFactory: A heavy, thread-safe singleton object created per database configuration. Builds and configures
EntityManager instances.
- EntityManager - primary interface for CRUD database interactions. Manages persistence context (L1 cache) and tracks 
entity states. short-lived; non-thread-safe.
- Entity - a POJO(plain java class) mapped to a database table; containing a primary key annotated @Id.(?)
- EntityTransaction - manages resource-local(?) database transactions (begin(), commit(), rollback())

### How does Spring Data JPA eliminate explicit EntityManager and EntityTransaction boilerplate?