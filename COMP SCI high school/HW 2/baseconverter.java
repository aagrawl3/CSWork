import java.util.Scanner;
import java.lang.String;
public class baseconverter
{
public static void main(String[] args)
	{
	Scanner inp=new Scanner(System.in);
	System.out.println("Input the integer you want changed");
	int one = inp.nextInt();
	System.out.println("Input the integer's current base");
	int two = inp.nextInt();
	System.out.println("Input the final base");
	int three = inp.nextInt();
	String finish = changebase(one,two,three);
	System.out.println("The new value is " + finish);
	}
	
	public static String changebase(int n, int base, int outbase)
		{
			int z=0;
			int exp=0;
			if (base>0 && outbase >0)
			{
				while (n>0)
				{
					z+=Math.pow(base,exp)*(n%10);
					n=n/10;
					exp++;
				}
			}
		String m="";
		while (z>0)
		{
			int r=z%outbase;
			m+=Integer.toString(r);
			z=(z-r)/(outbase);
		}
		String finish="";
		for (int i=0;i<m.length();i++)
		{
			finish += m.charAt(m.length()-i-1);
		}
		return(finish);
		}
	}
