//UIUC CS125 FALL 2012 MP. File: CallAStaticMethod.java, CS125 Project: Challenge5-DataStructures, Version: 2012-10-12T13:23:47-0500.975574000
/**
 * Prints out only lines that contain an email address Each printed line is
 * justified to right by prepending the text with '.' characters The minimum
 * width of the line including padding is 40 characters. See the test case for
 * example input and expected output.
 * @author aagrawl3
 * 
 */
class CallAStaticMethod {

	public static void main(String[] args) {

		while (!TextIO.eof()) {
			String line = TextIO.getln();
			String dot="";
			// Use ExampleClassMethods
			// 'isEmailAddress' and 'createPadding' to complete this method
			if(ExampleClassMethods.isEmailAddress(line)){
				dot=ExampleClassMethods.createPadding('.', 40-line.length());
				TextIO.putln(dot+line);
			}
		}

	}
}
