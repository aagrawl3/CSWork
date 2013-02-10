import java.util.*;
public class selectionsort
{
	public static void main(String[]args)
	{
		Scanner inp = new Scanner(System.in);
		System.out.print("Input the number of values in the array: ");
		double x = inp.nextInt();
		double[] input = sort(create(x));
		for(int i=0;i<input.length; i++)
		{
			System.out.println(input[i]);
		}	
	}
		
	public static double[] create(int x)
	{
		double[] input = new double[x];
		for(int k=0; k<x; k++)
		{
			input[i] = 100*Math.random();
		}
		return input;
	}
	
	public static int minimum(double[] input, int x)
	{
		int minimum = 0;
		for(int k=0; k<x; k++)
		{
			if(input[k] <= input[minimum])
			{
				minimum = k;
			}
		}
		return minimum;
	}
	
	public static Selection sort(double[] input)
	{
		int temp = 0;
		double value = 0.0;
		for(int i=0; i<input.length; i++)
		{
			temp = minimum(input,i);
			value = input[i];
			input[i] = input[temp];
			input[temp] = value;
		}
	}
}		
				