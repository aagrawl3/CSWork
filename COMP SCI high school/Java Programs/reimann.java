public class reimann{
public static double rrectangles(double a,double b,int n)
{
double area=0;
double m=(b-a)/((double) n);
while (a<b)
{
area+=m*Math.exp(-1*Math.pow(a,2));
a+=m;
}
return(area);
}
public static double montecarlo(double a,double b,int points)
{
int counttotal=0;
int countcurve=0;
for (int i=0;i<points;i++)
{
double k=Math.random()*(b-a)+a;
double h=Math.random()*2;
if (h<Math.exp(-1*Math.pow(k,2)))
{
countcurve++;
counttotal++;
}
else 
{
counttotal++;
}}
double area=((double) countcurve)/((double) counttotal)*(b-a)*2;
return(area);
}}
