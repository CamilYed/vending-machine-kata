
# Vending Machine Kata (Kotlin)

This is a personal project aimed at practicing coding principles and design patterns through the simulation of a vending machine. The project is implemented in Kotlin, with a focus on Test-Driven Development (TDD), object-oriented design, and clean code practices.

[GitHub Repository](https://github.com/CamilYed/vending-machine-kata)

## Project Overview

The project is built using **Gradle** with the Kotlin plugin. It simulates a vending machine that handles different types of products, accepts coins, and returns change.

### How to Run the Project

1. **Clone the repository**:
   ```bash
   git clone https://github.com/CamilYed/vending-machine-kata
   ```

2. **Navigate to the project directory**:
   ```bash
   cd vending-machine-kata
   ```

3. **Build the project with Gradle** (use the included Gradle wrapper):
   ```bash
   ./gradlew build
   ```

4. **Run the tests**:
   ```bash
   ./gradlew test
   ```

## Project Configuration

The project uses the following Gradle and Kotlin setup:

- Kotlin version: `2.0.20`
- JUnit 5 for testing:
    - `org.junit.jupiter:junit-jupiter-api:5.7.0`
    - `org.junit.jupiter:junit-jupiter-engine:5.7.0`
- Static code analysis with **Detekt**:
    - `io.gitlab.arturbosch.detekt` plugin, version `1.23.7`
- JVM toolchain targeting version 21.

```kotlin
plugins {
    kotlin("jvm") version "2.0.20"
    id("io.gitlab.arturbosch.detekt") version("1.23.7")
}

group = "camilyed.github.io"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}
```

## Key Features

1. The vending machine contains various products.
2. Products come in different types, such as Cola (0.25l), Chocolate Bar, Mineral Water (0.33l), and more.
3. Products are organized on shelves, with each shelf holding one type of product but multiple units.
4. Each product has its own price.
5. The vending machine has a display to show product prices and user interactions.
6. When a shelf is selected, the display shows the product's price.
7. You can buy products by inserting coins (denominations accepted: 5, 2, 1, 0.5, 0.2, 0.1).
8. The display shows the remaining amount required after inserting money.
9. Once enough money is inserted, the vending machine dispenses the product and returns the appropriate change.
10. If not enough money is inserted, the user can press "Cancel" to retrieve their coins.
11. If the machine cannot return the correct change, it shows a warning and refunds the inserted money without dispensing the product.
12. The machine only returns change with the coins that have been inserted into it.

## Code Structure

- **VendingMachine**: The main class that handles the vending machine's logic, including product selection, money insertion, and change return.
- **VendingMachineTest**: Contains unit tests for verifying the functionality of the vending machine using JUnit 5.

## Key Focus Areas

This project is a sandbox for practicing the following:

- **Test-Driven Development (TDD)**: Writing tests before implementing functionality.
- **Object-Oriented Programming (OOP)**: Proper encapsulation and separation of concerns.
- **Clean Code**: Keeping the codebase readable, maintainable, and easy to understand.
- **Design Patterns**: Exploring common design patterns to structure the code in a flexible and reusable way.

## Future Improvements

Some areas I may explore in the future include:

- Adding more complex inventory and change-handling logic.
- Implementing an admin panel for restocking products and managing the machine.
- Creating a graphical interface or a REST API to interact with the vending machine.
- Further exploration of design patterns to improve scalability and maintainability.

Feel free to fork this repository, explore the code, and contribute or suggest improvements!
