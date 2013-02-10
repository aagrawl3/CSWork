import java.util.Scanner;
public class avgarray{
public static void main(String[] args)
{
Scanner inp=new Scanner(System.in);
System.out.println("Enter the number of numbers");
int N= inp.nextInt();
System.out.println("Enter each number seperated by spaces");
double[] x=inp.double();
double sum=0.0;
for (int z=0;z<N;z++)
{
for (int i=0;i<N;i++)
{
sum+= inp[i];
}
double average=sum/N;
System.out.println(average);
}}