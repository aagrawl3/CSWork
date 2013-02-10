import java.util.Scanner;
public class Factorial{
public static void main(String[] args)
{
Scanner inp=new Scanner(System.in);
System.out.println("Enter integer n>=0 for which you want the factorial");
int n=inp.nextInt();
int fac=1;
for (int i=1;i<=n;i++)
	{
	fac=fac*i;
	}

	System.out.println("Factorial of " +n + " is --> " +fac);
	exit(0);
if (n==0)
	{
	System.out.println(1);
	}
if (n<0)
	{
	System.out.println("Not Possible");
	}	
}}
