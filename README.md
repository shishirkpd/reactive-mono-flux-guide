## Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.x or higher
- Spring Boot 3.x

### Installation
- Clone the repository:
```bash
git clone https://github.com/shishirkpd/reactive-mono-flux-guide.git
cd reactive-mono-flux-guide
```
- Build the project using Maven:
```bash
mvn clean install
```
- Running the Application

You can run the application using the following Maven command:

```bash
mvn spring-boot:run
```
Once the application starts, it will be available on http://localhost:8080.

- Testing the Application

This project includes test cases to verify the functionality of reactive endpoints. Tests are written using WebTestClient for testing the web layer and StepVerifier for verifying the reactive streams.

Run the test cases using Maven:

```bash
mvn test
```