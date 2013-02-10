import java.util.Scanner;
public class reverse
	{
	public static void main(String[]args)
		{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a phrase");
		String mystring = inp.nextLine();
		String reversedstring = revstr(mystring);
		System.out.println(reversedstring);
		}
	public static String revstr(String something)
		{
		int strlen = something.length();
		String strret = ""; 
		for(int i = strlen - 1;	i >=0; i--)
			{
			strret += something.substring (i,i+1); 
			}
		return (strret);
		}
	}		
	