# Testing JavaFx based GUIs with TestFx

In this assignment you learn to write automated GUI tests for JavaFx based applications using the TestFx test-framework.

## Write Your Own GUI Tests with TestFx _(2 points)_

Goal of this exercise is to implement test scripts in Java that perform a system test via user interface (GUI test). Use the framework [TestFx][testfx] to test your Triangle application from assignment 1.

### Prerequisites

- [x] Java 13 SDK.
- [x] Maven 3. (If you use an IDE like Eclipse or IntelliJ, Maven is **already included** :sunglasses:.)
- [x] Your Triangle application from assignment 1.

### Instructions

This maven project is already set up for testing JavaFx based GUI applications with _TestFx_. It also contains a small example application - `MyApplication.java` - and a JUnit test - `MyApplicationTest.java` that makes use of _TestFx_ to perform a simple GUI test.

1. Import this git repository into your favourite IDE.

1. Make sure, you can run both, the sample application and its JUnit test, and that the JUnit test completes without errors.

1. Study how `MyApplicationTest.java` makes use of _TestFx_ to control the GUI and access individual UI elements. Also look at the [TestFx wiki page][testfx wiki] to learn more about how to use this testing framework.

1. Copy source code and resources of your triangle application into the folder `src/main/java` and `src/main/resources` respectively. Think about package and class names!

1. Write JUnit tests that perform GUI tests on your triangle application.

   - Test source code should reside in `src/test/java` (resources needed for testing go into `src/test/resources`).
   - There is no limit on the number of test cases. Just make sure you cover important situations; also think of corner cases.
   - _Hint: Code coverage could give you a glue on how complete your tests are._

1. Commit and push your code to GitHub.

_Don't forget to remove the sample application `MyApplicationTest.java` before finishing your assignment._

### Submission

When you're done...

- [x] push your changes to your upstream repository on GitHub.
- [x] on GitHub, [create a release][github creating releases] with version `v1.0`.
- [x] upload the [link to your release][github linking to releases] on the e-learning platform until the specified date and time before the next lecture.

[testfx]: https://github.com/TestFX/TestFX
[testfx wiki]: https://github.com/TestFX/TestFX/wiki
[github creating releases]: https://help.github.com/articles/creating-releases/
[github linking to releases]: https://help.github.com/articles/linking-to-releases/
