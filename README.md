<div align="center">
<h1>Joke API Gateway 🌴🐫</h1>
<p>
<strong>Learning integrating of Apache Camel into a Java Spring Boot application..in a funny way!</strong>
</p>
</div>
</br>

This is a small demo project that uses Apache Camel and Spring Boot to create a simple API gateway. The application exposes a REST endpoint that, when called, queries a public random joke API, processes its JSON response, and returns a simplified, clean version to the user.

It's was made for learning the basic concepts of integration with Apache Camel in a modern Spring Boot environment.
</br>
</br>

🛠️ Tools & Technologies
-----------------------



<p align="center">
<a href="#"><img src="https://img.shields.io/badge/macOS-000000?logo=apple&logoColor=F0F0F0" alt="macOS"></a>
<a href="#"><img src="https://img.shields.io/badge/Spotify-1ED760?logo=spotify&logoColor=white" alt="Spotify"></a>  
<a href="#"><img src="https://custom-icon-badges.demolab.com/badge/Visual%20Studio%20Code-0078d7.svg?logo=vsc&logoColor=white" alt="VSC"></a>  
<a href="#"><img src="https://img.shields.io/badge/Opera-FF1B2D?logo=Opera&logoColor=white" alt="Opera"></a>
<a href="#"><img src="https://img.shields.io/badge/Google-4285F4?logo=google&logoColor=white" alt="Google"></a>  
<a href="#"><img src="https://img.shields.io/badge/Git-F05032?logo=git&logoColor=fff" alt="Git"></a> 
<a href="#"><img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=white" alt="GitHub"></a> 
<a href="#"><img src="https://img.shields.io/badge/Java-%23ED8B00.svg?logo=openjdk&logoColor=white" alt="Java"></a>
<a href="#"><img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=fff" alt="Spring Boot"></a>
<a href="#"><img src="https://img.shields.io/badge/Apache-D22128?logo=apache&logoColor=fff&style=flat" alt="Apache"></a>
</p>
</br>

<strong>🚀 Core Concepts Demonstrated</strong>
---------------------------------------------


This project was built to illustrate the following key concepts:
</br>
</br>

-> Integrating <strong>Apache Camel </strong> into a <strong>Spring Boot </strong> application.

-> Defining a REST endpoint using the <strong>Camel REST DSL.</strong>

-> Calling an external API with the camel-http component.

-> Data transformation (<strong>Unmarshalling</strong>) from JSON to a Java object (<strong>POJO</strong>) with camel-jackson.

-> Manipulating the in-flight message (Message Body).

-> Code organization into packages (model, route, config).
</br>
</br>


<strong>🛠️ Tech Stack</strong>
------------------------------


Java 21

Spring Boot 3.2.5

Apache Camel 4.6.0

Maven as a build tool
</br>
</br>




<strong>📋 Prerequisites</strong>
---------------------------------


Before you begin, ensure you have the following installed:

JDK 21 or higher

Apache Maven 3.8+
</br>
</br>

<strong>⚡ How to Run the Project</strong>
-------------------------


Follow these simple steps to run the application locally.

Clone the repository:

<strong>Bash</strong>

git clone https://github.com/danotoriousflaco101/Learning_Apache_Camel_integration_with_Java_and_SpringBoot.git
Navigate into the project directory:

<strong>Bash</strong>

cd Learning_Apache_Camel_integration_with_Java_and_SpringBoot
Run the application using Maven:

<strong>Bash</strong>

mvn spring-boot:run


This command will download dependencies and start the web server. You will see the Spring Boot banner in your terminal and a message confirming that the application has started on port 8080.
</br>
</br>


<strong>🧪 How to Test the API</strong>
---------------------------------------


Once the application is running, you can test the endpoint in two ways:

Using a Browser:
Open your favorite browser and visit the following URL:
<br>
http://localhost:8080/api/battuta

Using the Terminal (with curl):
Open a new terminal and run the command:

<strong>Bash</strong>

curl http://localhost:8080/api/battuta

In both cases, the expected result is a string of text containing a random joke, for example:

What's the difference between a hippo and a zippo? ... One is really heavy, the other is a little lighter.

This one really <strong>sets me on fire</strong>, anyway.....
</br>
</br>


<strong>🎓 Lessons Learned & Troubleshooting</strong>
----------------------------------------------------


During the creation of this project, i've faced and solved different problems, and they all served as an important lesson:

Version Incompatibility: an incompatible version of Camel being used with the chosen Spring Boot version.

BOM to the Rescue: Introduced a <strong>Camel BOM (Bill of Materials)</strong> in the <dependencyManagement> section of the pom.xml, allowing it to manage all Camel library versions consistently.

Bean Conflict: A <strong>BeanDefinitionOverrideException</strong> error occurred because both Camel's auto-configuration and manual configuration were trying to create the same bean. This was solved by excluding the auto-configuration (ServletMappingAutoConfiguration.class) in the @SpringBootApplication annotation.

This process demonstrates the importance of proper dependency management and understanding Spring Boot's auto-configuration mechanisms.
</br>
</br>
