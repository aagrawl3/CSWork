import java.util.Scanner;
public class sigma
	{
	public static void main(String[]args)
		{
		Scanner inp = new Scanner (System.in);
		System.out.println("What is n equal to?");
		int n = inp.nextInt();
		int sum = 0;
		int j = 0;
		while (j<= n)
			{
			sum += j;
			j = j+1;
		}
	System.out.println("The summation is equal to " + sum);
	}
}