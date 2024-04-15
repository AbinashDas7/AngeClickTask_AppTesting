# Automated Testing and Documentation 
Welcome to the repository for automated testing and documentation of our application 
and API. This README provides an overview of the testing framework, tools used, project 
structure, and how to run the tests.

## Project Overview 
My testing framework is built using Java, Eclipse, and a combination of TestNG and 
Cucumber BDD for behavior-driven development. The automation covers various aspects 
of testing including functional, security, and non-functional testing for both the application 
and API. 

## Tools Used 
- Java: Primary programming language for test automation. 
- Appium: Used for automating mobile application testing. 
- TestNG and Cucumber: Frameworks for organizing and executing tests and 
implementing BDD. 
- Android Studio: IDE used for Android application development. 
- Appium Inspector: Test tool for inspecting mobile applications. 
- Maven: Dependency management and build tool. 
- Extent HTML Report: Generates detailed HTML reports for test results tracking.
  
## Project Structure 
### The project is organized as follows: 
I.  AppiumAnge: Workspace for the application testing. - src/test/java: Contains Java code for test automation. 
-      StepDefinition: Folder containing step definition files written in Gherkin language. 
-      TestRunners: Includes test runner files for login and order testing. 
-      Pages: Main files utilizing Page Object Model (POM) techniques. - src/test/resources: Resources for testing. 
-    apps: Folder storing the application APK file. 
-    config: Configuration files with properties and credentials (ignored in Git). - testng.xml: TestNG configuration file for running all tests at once. 
II. API: Workspace for API testing. - src/test/java: Java code for API automation. 
-     RequestTypes: Separate files for each request type (e.g., POST). 
-     TestRunners: Test runner files for API testing. - src/test/resources: Resources for API testing. - Similar structure as in the Appium workspace.
   
## Running the Tests 
Before running the tests, ensure that Maven is updated and the application dependencies 
are installed using the `pom.xml` file. 
### For Application Testing: 
- Navigate to the `testrunner` folder. 
- Run individual test runners for login or order testing or run all tests using 
`testng.xml`.

### For API Testing: 
- Follow a similar process as for application testing, navigating to the `testrunner` 
folder. 
- Run individual test runners for each request type or run all tests using `testng.xml`. 
Reporting 
- Both application and API tests generate Extent HTML reports for clear visualization 
of test results. Stakeholders can easily track passed and failed tests using these 
reports.

## Manual Testing 
In addition to automation, a manual test sheet (`TestReport.xlsx`) is provided. It includes 
detailed descriptions of test cases, expected outcomes, and bug tracking for both 
application and API testing. 


## To Access the API Repository:
https://github.com/AbinashDas7/AngeClickTask_APITesting



Thank you for exploring my testing repository. For any questions or issues, feel free to 
reach out to the team. Happy testing!   
