# Write Your Own GUI Tests with TestFx (2 points)

Goal of this exercise is to implement test scripts in Java that perform a system test via user interface (GUI test). Use the framework [TestFx][TestFx] to test your Triangle application from exercise 1.

## Instructions

This maven project is already set up for testing JavaFx based GUI applications with _TestFx_. It also contains a small example application - `MyApplication.java` - and a JUnit test - `MyApplicationTest.java` that makes use of _TestFx_ to perform a simple GUI test.

1. Import this git repository into your favourite IDE.

1. Make sure, you can run both, the sample application and its JUnit test, and that the JUnit test completes without errors.

1. Study how `MyApplicationTest.java` makes use of _TestFx_ to control the GUI and access individual UI elements. Also look at the [TestFx wiki page][TestFx wiki] to learn more about how to use this testing framework.

1. Copy source code and resources of your triangle application into the folder `src/main/java` and `src/main/resources` respectively. Think about package and class names!

1. Write JUnit tests that perform GUI tests on your triangle application.
   * Test source code should reside in `src/test/java` (resources needed for testing go into `src/test/resources`).
   * There is no limit on the number of test cases. Just make sure you cover important situations; also think of corner cases.
   * _Hint: Code coverage could give you a glue on how complete your tests are._

1. Commit and push your code to GitHub.

_Don't forget to remove the sample application `MyApplicationTest.java` before finishing your assignment._

## Submission

When you're done...

1. on GitHub, [create a release][GitHub creating releases] with version 'v1.0'.

1. upload the [link to your release][GitHub linking to releases] on the e-learning platform until the specified date and time before the next lecture.

[TestFx]: https://github.com/TestFX/TestFX
[TestFx wiki]: https://github.com/TestFX/TestFX/wiki
[GitHub creating releases]: https://help.github.com/articles/creating-releases/
[GitHub linking to releases]: https://help.github.com/articles/linking-to-releases/
