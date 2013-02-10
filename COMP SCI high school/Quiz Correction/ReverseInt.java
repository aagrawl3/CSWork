import java.util.Scanner;
public class ReverseInt
{
public static void main(String[] args)
{
	Scanner inp = new Scanner(System.in);
	System.out.println("Input an integer");
	int N = inp.nextInt();
	int temp = N;
	int counter = 0;
	int i = 0;
	int total = 0;
	int blah = 0;
	while(N >= 1)
	{ 
		N = N/10;
		counter++;
	}

	for(i=0; i <= counter; i++)
	{
		int g = temp % 10;
		blah = g * (int) Math.pow(10,counter-1-i);
		total += blah;
		temp /= 10;
	}
	System.out.println("Reversed Integer: " + total);
}
}
