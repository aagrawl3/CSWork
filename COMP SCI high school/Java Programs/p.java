import java.util.Scanner;
public class p{
public static void main(String[] args)
{
Scanner inp=new Scanner(System.in);
System.out.println("Enter a number n, the number of heads you want, and z coin flips to find the probability of finding exactly n heads");
int n=inp.nextInt();
int z=inp.nextInt();
int heads=0;
int tails=0;
double timesheads=0;
double timestails=0;
double g=0.0;
double prev=0.0;
while ((g-prev>0.00001) || (prev-g>0.00001) || timesheads==0)
{
	for (int i=0;i<z;i++)
{
		if (Math.random()<0.5)
	{
		heads++;
	}
		else
	{
		tails++;
	}
}
	if (heads==n)
{
timesheads++;
heads=0;
tails=0;
}
else 
{
timestails++;
heads=0;
tails=0;
}
prev=g;
double m=timestails+timesheads;
g=timesheads/m;
}
System.out.println(g);
}}