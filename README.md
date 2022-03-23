# Java Design Patterns (GOF)

![maven](https://github.com/epomatti/java-gof-patterns/actions/workflows/maven.yml/badge.svg)

Classic GoF design patterns implemented in Java that I used to prepare for my OCMJEA6 certification.

## Setup

Install Maven and dependencies dependencies (you can use an IDE plugin as well):

```sh
sudo apt install maven

mvn install
mvn clean compile
```

Install [Lombok](https://projectlombok.org/setup/overview) plugin in your favorite IDE.

Compiled with JDK 11.

## Running it

```sh
mvn exec:java -pl '<module-name>'
```

Example: `mvn exec:java -pl composite`

Available pattern modules:

```
abstract-factory
adapter
builder
chain-of-responsibility
composite
decorator
facade
factory-method
mediator
memento
observer
prototype
proxy
singleton
state
strategy
template-method
visitor
```
