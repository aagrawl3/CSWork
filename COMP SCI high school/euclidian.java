import java.util.Scanner;
public class euclidian
	{
	public static void main (String[]args)
		{
		Scanner inp = new Scanner (System.in);
		System.out.println("Enter the first number");
		int one = inp.nextInt();
		System.out.println("Enter the second number");
		int two = inp.nextInt();
		int remainder = 1;
		while (remainder != 0)
			{
			remainder = one % two;
			one = two;
			two = remainder;
			}
		System.out.println("The Greatest Common Factor is " + one);
		}
	}