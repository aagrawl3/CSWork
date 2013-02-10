//UIUC CS125 FALL 2012 MP. File: UsingPublicFieldsIsEasy.java, CS125 Project: Challenge5-DataStructures, Version: 2012-10-12T13:23:47-0500.975574000

/**
 * Complete the class method 'analyze' that takes a SimplePublicPair object as an argument
 * and returns a new SimplePublicTriple object.
 * The SimplePublicTriple needs to set up as follows:
 * x = the minimum value of 'a' and 'b'
 * y = the maximum value of 'a' and 'b'
 * description:a*b=M 
 *   where a,b, and M are replaced with the numerical values of a, b and the multiplication of a and b.
 * Your code will create a SimplePublicTriple, initializes the three fields and return a reference to the SimplePublicTriple object.
 *@author aagrawl3
 *
 */
public class UsingPublicFieldsIsEasy {
	
	public static SimplePublicTriple analyze(SimplePublicPair in) {
		SimplePublicTriple result= new SimplePublicTriple();
		if(in.a==in.b){
			result.x=in.a;
			result.y=in.a;
		}
		else if(in.a>in.b){
			result.x=in.b;
			result.y=in.a;
		}
		else{
			result.y=in.b;
			result.x=in.a;
		}
		result.description=(in.a+"*"+in.b+"="+(in.a*in.b));
		return result;
	}
}
