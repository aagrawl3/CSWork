import java.util.Scanner;
public class montecarlointegration
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("This program approximates the area under any section of the normal distribution curve");
		System.out.println("Input the starting x value:");
		double x = inp.nextDouble();
		System.out.println("Input the ending x value:");
		double y = inp.nextDouble();
		System.out.println("Input the number of points you wish to have:");
		int points = inp.nextInt();
		System.out.println("The area under this section of the curve is approximately: " + MonteCarlo(x,y,points));
	}
		
	public static double MonteCarlo(double x, double y, int z)
	{
		int total = 0;
		int undercurve = 0;
		for(int i=0; i<z; i++)
		{
			double width = Math.random()*(y-x)+ x;
			double height = Math.random()*5;
			if(height < (Math.pow(Math.E,-Math.pow(width,2))))
			{
				undercurve++;
				total++;
			}
			else
			{
				total++;
			}
		}
		double Area = ((double)undercurve/(double)total)*(5*(y-x));
		return (Area);
	}
}