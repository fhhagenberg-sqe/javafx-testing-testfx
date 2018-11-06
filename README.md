# Write Your Own GUI Tests with TestFx (2 points)

Goal of this exercise is to implement test scripts in Java that perform a system test via user interface (GUI test). Use the framework _TestFx_ to test your Triangle application from exercise 1.

## Instructions

This maven module is already set up for testing JavaFx based GUI applications with _TestFx_. It also contains a small example application - `MyApplication.java` - and a JUnit test - `MyApplicationTest.java` that makes use of _TestFx_ to perform a simple GUI test. Make sure, you can run both, the application and the JUnit test, and that the JUnit test completes without errors.

Study how `MyApplicationTest.java` makes use of _TestFx_ to control the GUI and access individual UI elements. Also look at the main [TestFx wiki page at GitHub](https://github.com/TestFX/TestFX/wiki) to learn more about 

Remove the example application and copy source code and resources of your Triangle application into the folder `src/main/java` and `src/main/resources` respectively.

The framework _TestFx_ is used to access the GUI elements of the Triangle application. Please have a look at the main [TestFx project page at GitHub](https://github.com/TestFX/TestFX) for a simple example of how to write tests with TestFx.

Use this module as starting point.