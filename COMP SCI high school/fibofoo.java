import java.util.*;
public class fibofoo
{
	public static void main(String[]args)
	{
		Scanner woo = new Scanner(System.in);
		System.out.println("Input the index");
		int index = woo.nextInt();
		System.out.println(mather(index+1));
	}
	
	public static long mather(int whatever)
	{
		long[] numbers = new long [whatever];
		long x = 0;
		numbers[0] = 0;
		numbers[1] = 1;
		for(int i = 2; i < whatever; i++)
		{
			numbers[i] = numbers[i-1] + numbers[i-2];
			x = numbers[i];
		}
		return (x);
	}
}