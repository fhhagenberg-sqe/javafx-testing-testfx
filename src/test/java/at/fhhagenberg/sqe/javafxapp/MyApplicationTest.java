package at.fhhagenberg.sqe.javafxapp;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationTest;

public class MyApplicationTest extends ApplicationTest {
	@BeforeEach
	void setup() throws Exception {
		ApplicationTest.launch(MyApplication.class);
	}

	@AfterEach
	void cleanup() throws Exception {
		FxToolkit.cleanupStages();
	}

	@Test
	public void testComputeSum() {
		doubleClickOn("#a").write("1");
		doubleClickOn("#b").write("2");

		clickOn("#compute");

		verifyThat(".label.sum", hasText("3,00"));
	}

	@Test
	@Disabled
	public void testComputeSumNoInput() {
		clickOn(hasText("=")); // alternative to clickOn("#compute");

		verifyThat(".label.sum", hasText("n/a"));
	}
}
