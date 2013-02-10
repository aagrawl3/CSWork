public class exact55heads{
public static void main(String[] args)
{
int heads=0;
int tails=0;
int timesheads=0;
int timestails=0;
double g=0.0;
double prev=0.0;
while ((g-prev>0.0001) || (prev-g>0.0001) || timesheads==0)
{
	for (int i=0;i<100;i++)
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
	if (heads==55)
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
int m=timestails+timesheads;
g=timesheads/m;
}
System.out.println(g);
}}