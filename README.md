# sorting-challenge
## This repository is an application to do sort a list of alphanumeric strings.

### Dependencies:

The project requires the following dependencies be installed on the host machine:
* Java 8

* Maven latest version 3.x and above

* IDE like Ecplipse or Intellij

## Running:
 Open the project in your IDE like : Eclipe or Intellij
 Run the SortingUtils.java
  or Run the test case SortingUtilsTest.java


### Maven

The following Maven goals are the most commonly used.

#### test

The `mvn clean test` Maven goal performs the following workflow steps:

* compiles Java classes to the /target directory
* copies all resources to the /target directory

To execute the `mvn clean test` Maven goal, type the following command at a terminal prompt in the project base directory.


This goal is used for local machine development and functional testing.  Use the `package` goal for server deployment.


#### package

The `package` Maven goal performs the following workflow steps:

* compiles Java classes to the /target directory
* copies all resources to the /target directory
* executes the unit test suites
* produces unit test reports
* prepares an executable JAR file in the /target directory

The `package` Maven goal is designed to prepare the application for distribution to server environments.  The application and all dependencies are packaged into a single, executable JAR file.

To execute the `package` goal, type the following command at a terminal prompt in the project base directory.

```
mvn clean package
```

The application distribution artifact is placed in the /target directory and is named using the `artifactId` and `version` from the pom.xml file.  To run the JAR file use the following command:

```
java -jar example-1.0.0.jar
```