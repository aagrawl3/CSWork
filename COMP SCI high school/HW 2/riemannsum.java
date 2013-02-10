import java.util.Scanner;
public class riemannsum
{
	public static void main(String[]args)
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("This program approximates the area under any section of the normal distribution curve");
		System.out.println("Input the starting x value:");
		double x = inp.nextDouble();
		System.out.println("Input the ending x value:");
		double y = inp.nextDouble();
		System.out.println("Input the number of crossections you wish to have:");
		int cross = inp.nextInt();
		System.out.println("The area under the curve is approximately: " + riemann(x,y,cross));
	}
		
	public static double riemann(double x, double y, int z)
	{
		double crosswidth = (y-x)/z;
		double sum = 0;
		for(int i=0; i<z; i++)
		{
			sum += crosswidth*(Math.pow(Math.E,-Math.pow(x,2)));
			x += crosswidth;
		}
		return (sum);
	}
}