import java.util.*;
public class sumthing
{
	public static void main (String[]args)
	{
	Scanner inp = new Scanner(System.in);
	System.out.print("Input n: ");
	int k = 0;
	int n = inp.nextInt();
	System.out.println("The sum is " + randomstuff(k,n));
	}
	
	public static double randomstuff(int k, int n)
	{
		if(n == 0)
		{
			return (0);
		}
		else 
		{
			return(n + randomstuff(k, n-1));
		}
	}
}