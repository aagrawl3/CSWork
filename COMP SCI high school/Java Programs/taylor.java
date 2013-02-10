import java.util.*;
public class taylor{
public static void main(String[] args)
{
Scanner inp=new Scanner(System.in);
System.out.println("Enter an x followed by N");
double x=inp.nextDouble();
double N=inp.nextDouble();
double cos=taylor(x,N);
System.out.println(cos);
}
public static double taylor(double x,double N){
double sum=1;
for (int i=1;i<=N;i++)
{
double fac=factorial(2*i);
sum+=(Math.pow(x,2*i)*Math.pow(-1,i))/fac;
}
return sum;
}
public static double factorial(int z)
{
double fac=1;
for (int i=1;i<=z;i++)
{
fac*=(double) i;
}
return fac;
}}


