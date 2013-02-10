import java.util.*;
public class s
{
	public static void main (String[]args)
	{
		Scanner inp = new Scanner(System.in);
		System.out.print("input the value of n: ");
		double n = inp.nextInt();
		System.out.println("The summation is equal to: " + SS(n)); 
	}	
	
	public static double SS(double n)
	{
		double sum = 0;
		for(double k=1.0; k<(n+1); k++)
		{
			sum += (double)1/(2*k-1)/(2*k+1);
		}
		return sum;
	}
}