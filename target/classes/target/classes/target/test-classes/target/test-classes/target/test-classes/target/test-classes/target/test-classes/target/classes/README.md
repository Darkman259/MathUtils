# MathUtils

Objective: The objective of this assignment is to assess your understanding of unit testing using JUnit or pytest and your ability to integrate Jenkins for automated testing. You will write test cases and configure Jenkins to build and test the code automatically, and ensure that the class methods meet the specified requirements.

Instructions:

Part 1: Class to Test (Java)

Create a Java class named MathUtils with the following methods:

int add(int a, int b): This method should return the sum of two integers, a and b.
int subtract(int a, int b): This method should return the result of subtracting b from a.
int multiply(int a, int b): This method should return the product of a and b.
double divide(int a, int b): This method should return the result of dividing a by b. Ensure that division by zero is handled appropriately by returning -1.0 in such cases.
Part 2: JUnit Test Cases (Java)

Create a JUnit test class named MathUtilsTest to test the methods of the MathUtils class.

Write test cases for each of the methods in the MathUtils class. Ensure that you cover various scenarios, including both valid and edge cases.

Use JUnit annotations (@Test, @Before, @After, etc.) to set up and tear down any necessary resources for your test cases.

Include assertions to verify that the methods in the MathUtils class return the expected results.

Part 3: Class to Test (Python)

Create a Python class named MathUtils with the following methods:

def add(a, b): This method should return the sum of two integers, a and b.
def subtract(a, b): This method should return the result of subtracting b from a.
def multiply(a, b): This method should return the product of a and b.
def divide(a, b): This method should return the result of dividing a by b. Ensure that division by zero is handled appropriately by returning -1.0 in such cases.
Part 4: Pytest Test Cases (Python)

Create a Python test file named test_math_utils.py to test the methods of the MathUtils class.

Write test cases for each of the methods in the MathUtils class using pytest. Ensure that you cover various scenarios, including both valid and edge cases.

Use pytest fixtures if needed to set up and tear down any necessary resources for your test cases.

Include assertions to verify that the methods in the MathUtils class return the expected results.

Part 5: Jenkins Integration

Install Jenkins on your local machine or use an online Jenkins environment.

Create a Jenkins job that pulls the Java and Python code and test files from a version control system (e.g., GitHub).

Configure the Jenkins job to build the Java and Python projects and run the respective unit test cases as part of the build process. You can use Gradle or Maven for the Java project and a Python script for the Python project.

Set up post-build actions in Jenkins to report the test results for both the Java and Python tests and display them in a user-friendly format.

Trigger the Jenkins job to run automatically whenever changes are pushed to the version control system or on a schedule.
