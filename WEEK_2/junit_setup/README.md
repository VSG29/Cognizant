# JUnit Setup

## Objective
Set up JUnit 4.13.2 using Maven.

## Tools Used
- Java
- Maven
- JUnit 4.13.2
- IntelliJ IDEA

## Dependency

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

## Result

JUnit was successfully configured and a sample test executed successfully.

---

# Exercise 3 - Assertions

## Objective
Use different JUnit assertions to validate test results.

## Assertions Used
- `assertEquals()`
- `assertTrue()`
- `assertFalse()`
- `assertNull()`
- `assertNotNull()`

## Result
All assertions executed successfully and the test passed.

---

# Exercise 4 - AAA Pattern

## Objective
Learn the Arrange-Act-Assert (AAA) testing pattern and use setup and teardown methods.

## Concepts Used
- Arrange
- Act
- Assert
- @Before
- @After

## Result
The test successfully demonstrated the AAA pattern. The setup method executed before the test, and the teardown method executed after the test.