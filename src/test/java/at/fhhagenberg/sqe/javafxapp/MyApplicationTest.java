package at.fhhagenberg.sqe.javafxapp;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;

public class MyApplicationTest extends ApplicationTest {
	@Before
	public void setup() throws Exception {
		ApplicationTest.launch(MyApplication.class);
	}

	@After
	public void teardown() throws Exception {
		FxToolkit.cleanupStages();
	}

	@Test
	public void testComputeSum() {
		doubleClickOn("#a").write("1");
		doubleClickOn("#b").write("2");

		clickOn("#compute");

		verifyThat(".label.sum", hasText("3.00"));
	}

	@Test
	@Ignore
	public void testComputeSumNoInput() {
		clickOn(hasText("=")); // alternative to clickOn("#compute");

		verifyThat(".label.sum", hasText("n/a"));
	}
}
