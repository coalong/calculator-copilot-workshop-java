# Calculator Web App

This is a Java-based calculator web application project. It provides a simple calculator interface for performing basic arithmetic operations.

## Project Structure

```
calculator-web-app
├── src
|   ├── main
|   |   ├── java
|   |   |   └── com
|   |   |       └── calculator
|   |   |           ├── controller
|   |   |           |   └── CalculatorController.java
|   |   |           ├── service
|   |   |           |   └── CalculatorService.java
|   |   |           └── CalculatorApplication.java
|   |   └── resources
|   |       ├── static
|   |       |   ├── css
|   |       |   |   └── style.css
|   |       |   └── js
|   |       |       └── script.js
|   |       └── templates
|   |           └── index.html
|   └── test
|       └── java
|           └── com
|               └── calculator
|                   ├── controller
|                   |   └── CalculatorControllerTest.java
|                   └── service
|                       └── CalculatorServiceTest.java
├── pom.xml
└── README.md
```

## Files

- `src/main/java/com/calculator/controller/CalculatorController.java`: This file contains the controller class `CalculatorController` which handles the HTTP requests and responses for the calculator web application.

- `src/main/java/com/calculator/service/CalculatorService.java`: This file contains the service class `CalculatorService` which performs the actual calculations for the calculator.

- `src/main/java/com/calculator/CalculatorApplication.java`: This file is the entry point of the application. It contains the main method to start the calculator web application.

- `src/main/resources/static/css/style.css`: This file contains the CSS styles for the calculator web application.

- `src/main/resources/static/js/script.js`: This file contains the JavaScript code for the calculator web application.

- `src/main/resources/templates/index.html`: This file is the HTML template for the calculator web application. It defines the structure and layout of the calculator UI.

- `src/main/resources/application.properties`: This file contains the configuration properties for the calculator web application.

- `src/test/java/com/calculator/controller/CalculatorControllerTest.java`: This file contains the unit tests for the `CalculatorController` class.

- `src/test/java/com/calculator/service/CalculatorServiceTest.java`: This file contains the unit tests for the `CalculatorService` class.

- `pom.xml`: This file is the Maven configuration file for the project. It defines the project dependencies and build settings.

- `README.md`: This file contains the documentation for the project.

## Usage

To run the calculator web application, execute the `CalculatorApplication` class. The application will start a server and you can access the calculator UI by opening the provided URL in a web browser.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.