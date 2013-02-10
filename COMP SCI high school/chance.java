import java.util.*;
public class chance
{
	public static void main(String[]args)
	{
		Scanner woo = new Scanner(System.in);
		System.out.println("Sample size:");
		int people = woo.nextInt();
		System.out.println("Number of Simulations:");
		int trials = woo.nextInt();
		double success = 0;
		double fail = 0;
		double total = 0;
		for(int i = 0; i < trials; i++)
		{
			if(birthday(people) == true)
			{
				success++;
				total++;
			}
			else
			{
				fail++;
				total++;
			}
		}
		double probability = (success/total);
		System.out.println(probability);
	}
	
	public static boolean birthday(int whatever)
	{
		int[] birthdays = new int[whatever];
		int something = 0;
		for(int j = 0;j < whatever; j++)
		{
			birthdays[j] = (int)(Math.random() * 365);
		}
		for(int k = 0; k < whatever; k++)
		{
			for(int y = 0; y < k; y++)
			{
				if(birthdays[y] == birthdays[k])
				{
					something = -1;
				}
			}
		}
		if(something == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}