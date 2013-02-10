//UIUC CS125 FALL 2012 MP. File: CallAStaticMethodTest.java, CS125 Project: Challenge5-DataStructures, Version: 2012-10-12T13:23:47-0500.975574000
import junit.framework.TestCase;

/**
 * Tests for CallAStaticMethod. You do not need to modify this file.
 * 
 * @author angrave
 * 
 */

public class CallAStaticMethodTest extends TestCase {

	public void testMain() {
		String input = "Hello, this line is ignored\n" + "spam@nospam.com\n"
				+ "this line is not an email address\n"
				+ "thisIsAnEmailAddress@address.edu\n" + "@NotAnEmailAddress";

		String expected = ".........................spam@nospam.com\n"
				+ "........thisIsAnEmailAddress@address.edu\n";
		CheckInputOutput.setInputCaptureOutput(input);
		CallAStaticMethod.main(new String[] {});
		int line = CheckInputOutput.checkCompleteOutput(expected);
		if (line > 0)
			fail("incorrect output on line " + line);

	}

	protected void tearDown() throws Exception {
		CheckInputOutput.resetInputOutput();
	}
	public void setUp() throws Exception {
		super.setUp();
		CheckInputOutput.setUp();
	}
}
