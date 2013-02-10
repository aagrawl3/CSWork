import java.util.Scanner;
public class cointoss
{
	public static void main (String[]args)
	{
		int trials = 1000;
		int numberofheads = 1;
		int numberoftails = 1;
		
		for(int i=0; i < trials; i++)
		{
			if(Math.random() < 0.5)
			{numberofheads++;}
			else
			{numberoftails++;}
		}	
	System.out.println("Number of heads: " + numberofheads);
	}
}
