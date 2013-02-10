import java.util.*;
public class credit
{
	public static void main(String[]args)
	{
		Scanner woo = new Scanner(System.in);
		int[] x = new int[17];
		int test = 0;
		int jk = 0;
		String temp = "";
		System.out.println("Input a credit card number");
		String blah = woo.nextLine();
		for(int asdf=0; asdf<blah.length(); asdf++)	
		{
			temp = blah.charAt(asdf);
			x[asdf] = parseInt(temp);
			System.out.println(x[asdf]);
		}
		if(legitimate(x) == true && length(x) == true && legalcc(x) == true)
		{
			test = 1;
		}
		if(test == 1)
		{
			System.out.println("The credit card number is legal");
		}
		else
		{
			System.out.println("The credit card number is not legal");
		}
	}
	
	public static boolean legitimate(int[] whatever)
	{
		int test = 0;
		if(whatever[0]==4 || whatever[0]==5 || whatever[0]==6 || (whatever[0]==3 && whatever[1] == 7))
		{
			test = 1;
		}
		return(test == 1);
	}
	
	public static boolean length(int[] whatever)
	{
		int test = 0;
		if(whatever.length == 13 || whatever.length == 14 || whatever.length == 15 || whatever.length == 16)
		{
			test = 1;
		}
		return(test == 1);
	}
	
	public static double leftsum(int[] whatever)
	{
		int sum = 0;
		for(int z = 0; z < (double)(whatever.length/2.0); z++)
		{
			sum += ((whatever[2*z]*2)%10);
		}
		return sum;
	}
	
	public static double rightsum(int[] whatever)
	{
		int sum = 0;
		for(int z = 0; z < (double)(whatever.length/2.0); z++)
		{
			sum += whatever[whatever.length - 2 * z];
		}
		return sum;
	}
	
	public static double total(int[] whatever)
	{
		double totalsum = rightsum(whatever) + leftsum(whatever);
		return totalsum;
	}
	
	public static boolean legalcc(int[] whatever)
	{
		int test = 0;
		if(total(whatever) % 10 == 0)
		{
			test = 1;
		}
		return(test == 1);
	}
}