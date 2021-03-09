
NAME
Corina Sirbu 

DESCRIPTION

The project is about creating automated checks for the search function for the CRUK find a shop page (https://www.cancerresearchuk.org/get-involved/find-a-shop). 
A negative and positive scenario outline are created 

INSTALLATION 

This is a maven project and is a Cucumber Behaviour Driver Development (BDD) framework. 
Project gets all dependencies from maven repository. So, no additional installation needed and tests are written in Cucumber Gherkin language.


pom.xml: has all the dependencies and plugins that is needed. For example: Bonigarcia (allows us to use the WebDriverManager), 
Cucumber Java (annotated methods), Cucumber Junit (execute cucumber scenarios, use assert.Assert(), 
Maven Surefire Plugin (is used during the test phase of the build lifecycle to execute the unit tests of an application), Maven Cucumber Reporting

Page Object model: to simplify, managing and maintaining the framework to identify and store elements to utilize in testing and with help of PageWebFactory.
I am able to utilize all these elements through StepDefinition. (The POM was not really needed for this part of the project
However, it will be very useful for future automation )

Runner Class: CuksRunner allows to run different types of testing suites. 

Step definition: This is where I write the codes and implement automation for the scenarios in the feature files

Hooks : that implements the codes which run before and after all tests. 

Utilities: is used to keep all global and most frequently used codes such as browser utils, configuration reader and driver.
In the driver class I created Singleton Design Pattern to allow my framework to use the same version of an object across the whole program.


Feature File: it is used to define the scenarios with plain and simple English which test a certain functionality or feature of the application. 


