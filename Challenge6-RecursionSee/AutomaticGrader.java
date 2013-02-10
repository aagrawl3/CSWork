//UIUC CS125 FALL 2012 MP. File: AutomaticGrader.java, CS125 Project: Challenge6-RecursionSee, Version: 2012-11-03T10:40:30-0500.653808000
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * This program runs all unit tests and generates a score.
 * A similar program will be used to grade you work after the deadline.
 * You do not need to modify this file.
 * @author angrave
 *
 */
public class AutomaticGrader {
	/* The main entry point of grading amusement */
	public static void main(String[] args) throws Exception{
		checkForCompileErrors();

		TestRunner runner= new TestRunner();
		TestSuite suite = new TestSuite();
		suite.addTestSuite(BlackBeltDebuggerChallengeTest.class);
		suite.addTestSuite(LinkedListTest.class);
		suite.addTestSuite(PersonTest.class);
		suite.addTestSuite(GeneAnalysisTest.class);

		TestResult result= runner.doRun(suite, false);
		
		int passed = result.runCount() - result.errorCount() 
					- result.failureCount();
		int total = result.runCount();
		int score = (int) ((100. * passed) / total);
		
		System.out.println(passed + " passed out of "+total);
		System.out.println("Score="+score);
		System.exit(score);

	}
	public static void checkForCompileErrors() {
		File[] files = new File(".").listFiles();
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			if (file.getName().endsWith(".class")
					|| file.getName().endsWith(".java"))
				checkFileForCompileError(file);
		}
	}

	private static void checkFileForCompileError(File file) {
		boolean isClass = file.getName().endsWith(".class");
		if ("|CheckInputOutput|AutomaticGrader|TextIO|".contains("|"
				+ file.getName().replace(".java", "").replace(".class", "")
				+ "|"))
			return;
		try {
			byte[] buffer = new byte[(int) file.length()];
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream(file));
			bis.read(buffer);
			String sourceCode;
			if (isClass)
				sourceCode = new String(buffer);
			else
				sourceCode = new String(buffer, "UTF8");
			// TextIO.putln(sourceCode);
			if (sourceCode.contains("Unresolved compilation problem")) {
				System.out
						.println("Fix Compilation Errors in "
								+ file.getName()
								+ " - see the Package explorer or Problems view for details.");
				System.exit(1);
			}

			if (sourceCode.contains("System.exit")) {
				System.out.println("Don't use System.exit (file: "
						+ file.getName() + ")- see README instructions");
				System.exit(1);
			}
			bis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
