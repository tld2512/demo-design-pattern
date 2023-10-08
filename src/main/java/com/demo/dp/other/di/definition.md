## I. Definition
**Dependency Injection is a software design pattern in which one or more dependencies (or services)
are injected, or passed by reference, into a dependent object (or client) and are made part of the
client's state. The pattern separates the creation of a client's dependencies from its own behavior,
which allows program designs to be loosely coupled and to follow the inversion of control and single
responsibility principles.**

## II. Types of Dependency Injection
1. Constructor Injection: In the constructor injection, the injector supplies the service (dependency) through the client class constructor.

2. Property Injection: In the property injection (aka the Setter Injection), the injector supplies the dependency through a public property of the client class.

3. Method Injection: In this type of injection, the client class implements an interface which declares the method(s) to supply the dependency and the injector uses this interface to supply the dependency to the client class.

## III. Pros and cons
**Pros:**
- Separation of Concerns
- Boilerplate Code reduction in application classes because all work to initialize dependencies is handled by the injector component
- Configurable components makes application easily extendable
- Unit testing is easy with mock objects

**Cons:**
- Hard to understand for newbie
- Errors at runtime instead of compile time
- Hard to debug sometimes
