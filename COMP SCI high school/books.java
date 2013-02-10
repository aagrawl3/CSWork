import java.util.*;
import java.util.Scanner;
public class books
{
	public static void main(String[]args)
	{
		Scanner woo = new Scanner(System.in);
		System.out.println("# of people?");
		int people = woo.nextInt();
		System.out.println("# of trials?");
		int trials = woo.nextInt();
		double fail = 0;
		double success = 0;
		double totals = 0;
		for(int i = 0; i<trials; i++)
		{
			if(calculator(people) == true)
			{
				fail++;
				totals++;
			}
			if(calculator(people) == false)
			{
				success++;
				totals++;
			}
		}
		double answer = (double)(success/totals);
		System.out.println(answer);
	}


	public static boolean calculator(int people)
	{
		Integer[] results;
		int tester = 0;
		Integer[] test = new Integer[people];
		for(int z = 0; z < people; z++)
		{
			test[z] = z;
		}
		shuffle<Integer> test1 = new shuffle<Integer> (test);
		results = test1.shuffleIt();
		for(int w = 0; w < people; w++)
		{
			if(results[w] == w)
			{
				tester = 1;
			}
		}
		return(tester == 1); 
	}
}