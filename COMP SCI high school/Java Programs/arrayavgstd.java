public class arrayavgstd{
public static void main(String[] args)
{
double[] x=new double[10000];
for (int i=0;i<x.length;i++)	
{
x[i]=Math.random();
}
double avg=arrayavg(x);
System.out.println("Average="+avg);
double std=arraystd(x);
System.out.println("Standard Deviation="+std);
}

// Function to calculate array average //

public static double arrayavg(double[] z)
{
double sum=0.0;
for (int i=0;i<z.length;i++)
{
sum+=z[i];
}
double average=sum/10000;
return(average);
}

//Function to calculate std deviation of the array //

public static double arraystd(double[] z)
{
double sum=0.0;
for (int i=0;i<z.length;i++)
{
sum+=z[i];
}
double topsum=0.0;
double average=sum/10000;
for (int m=0;m<z.length;m++)
{
topsum+=(z[m]-average)*(z[m]-average);
}
double stad=Math.sqrt(topsum/9999);
return(stad);
}}
