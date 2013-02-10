import java.util.Scanner;
public class cosinesum
{
	public static void main (String[] args)
	{
		Scanner inp = new Scanner (System.in);
		System.out.println("Input the value of N");
		double N = inp.nextDouble();
		System.out.println("Input the value of X");
		double X = inp.nextDouble();
		double done = sum(N,X);
		System.out.println("Cosine X = " + done);
	}	
		
	public static double sum(double N,double X)
	{
		double sum = 1;
		for (int k = 1; k <= N ; k++)
		{	
			double something = factorial(k*2);
			sum += Math.pow(X,2*k)/something*Math.pow(-1,k);
		}
		return(sum);
	}

	public static double factorial(double N)
	{
		double total = 1;
		for(int k = 1; k <= N; k++)
		{
			total *= k;
		}
		return (total);
	}
}	