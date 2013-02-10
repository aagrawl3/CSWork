import java.util.*;
public class polynomial
{
	public static void main(String[]args)
	{
		Scanner inp = new Scanner (System.in);
		System.out.print("Input the power of the polynomial: ");
		int power = inp.nextInt();
		System.out.print("Input the value of x: ");
		int input = inp.nextInt();
		double[] awesome = new double[power+1];
		System.out.print("Input the coefficeints of the numbers from greatest to least x powers: ");
		for(int i = 0; i<power; i++)
		{
		awesome[] = inp.nextDouble();
		}
	}

	public static double calculator(double[],int power, int input)
	{
		