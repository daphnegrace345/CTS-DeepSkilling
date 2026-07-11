# Difference between JPA, Hibernate and Spring Data JPA

| JPA | Hibernate | Spring Data JPA |
|-----|-----------|-----------------|
| JPA is a specification. | Hibernate is an implementation of JPA. | Spring Data JPA is built on top of JPA. |
| It defines rules for database operations. | It provides the actual implementation. | It reduces boilerplate code. |
| It cannot work by itself. | It can work independently. | It works with Spring applications. |
| Example: EntityManager | Example: Session | Example: JpaRepository |

## Conclusion

- JPA is a specification.
- Hibernate is an implementation of JPA.
- Spring Data JPA simplifies JPA by providing ready-made repository methods.
