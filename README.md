# Demo Spring Command Line Application

A Spring Boot command-line application built with Gradle.

## Prerequisites

- Java 21+

## Getting Started

### Build

```bash
./gradlew build
```

### Run

```bash
./gradlew bootRun
```

You can pass arguments to the application:

```bash
./gradlew bootRun --args='arg1 arg2'
```

Or run the built JAR directly:

```bash
java -jar build/libs/demo-0.0.1-SNAPSHOT.jar arg1 arg2
```

### Run Tests

```bash
./gradlew test
```
