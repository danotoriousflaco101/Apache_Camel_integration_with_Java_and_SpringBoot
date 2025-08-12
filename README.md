Joke API Gateway 🤣


This is a small demo project that uses Apache Camel and Spring Boot to create a simple API gateway. The application exposes a REST endpoint that, when called, queries a public random joke API, processes its JSON response, and returns a simplified, clean version to the user.

It's an excellent example for learning the basic concepts of integration with Apache Camel in a modern Spring Boot environment.

🚀 Core Concepts Demonstrated
This project was built to illustrate the following key concepts:

Integrating Apache Camel into a Spring Boot application.

Defining a REST endpoint using the Camel REST DSL.

Calling an external API with the camel-http component.

Data transformation (Unmarshalling) from JSON to a Java object (POJO) with camel-jackson.

Manipulating the in-flight message (Message Body).

Code organization into packages (model, route, config).

Solving dependency issues with Maven using a Camel BOM (Bill of Materials).

Manually configuring a Servlet Bean to resolve auto-configuration conflicts.

🛠️ Tech Stack
Java 21

Spring Boot 3.2.5

Apache Camel 4.6.0

Maven as a build tool

📋 Prerequisites
Before you begin, ensure you have the following installed:

JDK 21 or higher

Apache Maven 3.8+

⚡ How to Run the Project
Follow these simple steps to run the application locally.

Clone the repository:

Bash

git clone https://github.com/danotoriousflaco101/Learning_Apache_Camel_integration_with_Java_and_SpringBoot.git
Navigate into the project directory:

Bash

cd Learning_Apache_Camel_integration_with_Java_and_SpringBoot
Run the application using Maven:

Bash

mvn spring-boot:run
This command will download dependencies and start the web server. You will see the Spring Boot banner in your terminal and a message confirming that the application has started on port 8080.

🧪 How to Test the API
Once the application is running, you can test the endpoint in two ways:

Using a Browser:
Open your favorite browser and visit the following URL:
<br>
http://localhost:8080/api/battuta

Using the Terminal (with curl):
Open a new terminal and run the command:

Bash

curl http://localhost:8080/api/battuta
In both cases, the expected result is a string of text containing a random joke, for example:

What's the difference between a hippo and a zippo? ... One is really heavy, the other is a little lighter.

🎓 Lessons Learned & Troubleshooting
During the creation of this project, we faced and solved several common real-world problems, which serve as an important lesson:

Version Incompatibility: The initial NoSuchMethodError was caused by an incompatible version of Camel being used with the chosen Spring Boot version.

BOM to the Rescue: The solution was to introduce a Camel BOM (Bill of Materials) in the <dependencyManagement> section of the pom.xml, allowing it to manage all Camel library versions consistently.

Bean Conflict: The BeanDefinitionOverrideException error occurred because both Camel's auto-configuration and our manual configuration were trying to create the same bean. This was solved by excluding the auto-configuration (ServletMappingAutoConfiguration.class) in the @SpringBootApplication annotation.

This process demonstrates the importance of proper dependency management and understanding Spring Boot's auto-configuration mechanisms.
