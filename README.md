# 🔢 Simple Calculator API (Spring Boot)

A basic calculator REST API built using **Spring Boot**, supporting operations like **addition, subtraction, multiplication, and division**. Includes **JUnit** test cases for logic verification.

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot 3.x
- Maven
- Spring Web
- JUnit 5
- Spring Boot DevTools

---

## ⚙️ Getting Started

### ✅ Prerequisites

- Java 17 (or compatible version)
- Maven
- IDE (IntelliJ / Eclipse)
- Internet (for downloading dependencies)

---

### 🚀 Project Setup

1. Go to [Spring Initializr](https://start.spring.io/)
2. Fill in the details:
   - **Group**: `com.example`
   - **Artifact**: `calculator`
   - **Dependencies**: Spring Web, Spring Boot DevTools
3. Click **Generate** to download the project.
4. Extract the zip and open the project in your IDE.

---

### 📁 Project Structure

        src/
        ├── main/
        │ └── java/com/example/calculator/
        │ ├── CalculatorApplication.java
        │ ├── controller/CalculatorController.java
        │ └── service/CalculatorService.java
        └── test/
        └── java/com/example/calculator/service/
        └── CalculatorServiceTest.java

---

✅ Run Tests

In terminal:

      ./mvnw test

In IDE:

      Right-click CalculatorServiceTest.java > Run.

---

▶️ Run the Application

      ./mvnw spring-boot:run

      OR run CalculatorApplication.java from your IDE.

---

📌 Notes

      Proper error handling is added for divide-by-zero cases.
      
      Code follows clean MVC structure with service separation.
