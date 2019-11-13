package at.fhhagenberg.sqe.javafxapp;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import javafx.stage.Stage;

@ExtendWith(ApplicationExtension.class)
public class MyApplicationTest {
	@Start
	public void start(Stage stage) throws Exception {
		new MyApplication().start(stage);
	}

	@Test
	public void testComputeSum(FxRobot robot) {
		robot.doubleClickOn("#a").write("1");
		robot.doubleClickOn("#b").write("2");

		robot.clickOn("#compute");

		verifyThat(".label.sum", hasText("3.00"));
	}

	@Test
	@Disabled
	public void testComputeSumNoInput(FxRobot robot) {
		robot.clickOn(hasText("=")); // alternative to clickOn("#compute");

		verifyThat(".label.sum", hasText("n/a"));
	}
}
