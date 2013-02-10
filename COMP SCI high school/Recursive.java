import java.util.*;
public class Recursive
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		System.out.print("Input the number you want to take a factorial of: ");
		double fact = inp.nextDouble();
		System.out.println("The factorial of "+fact+" is "+factorial(fact)+".");
		System.out.print("Input the number you want put to a power: ");
		double x = inp.nextDouble();
		System.out.print("Input the power: ");
		double pow = inp.nextDouble();
		System.out.println(x+" raised to the power of "+pow+" is "+power(x,pow)+".");
		System.out.print("Input a string: ");
		Scanner inp2 = new Scanner(System.in);
		String tbrev = inp2.nextLine();
		System.out.println("The string in reverse is: "+revstring(tbrev)+".");
		System.out.println("Input two numbers that you want to find the GCD of");
		System.out.print("First number: ");
		double j = inp.nextDouble();
		System.out.print("Second number: ");
		double k = inp.nextDouble();
		System.out.println("The greatest common denominator of the two numbers is "+GCD(j,k)+".");
	}

	public static double power(double x, double y)
	{
		if (y==0)
		{
			return(1.0);
		}
		else
			return(x*power(x,y-1));
	}

	public static double factorial(double a)
	{
		if (a==0)
			return(1.0);
		else
			return(a*factorial(a-1));
	}
	
	public static String revstring(String string)
	{
		if (string.length()==1)
			return(string);
		else
			return(string.charAt(string.length()-1)+revstring(string.substring(0,string.length()-1)));
	}

	public static double GCD(double x, double y)
	{
		if (x%y==0)
			return(Math.min(x,y));
		else
			return(GCD(y, x%y));
	}
}