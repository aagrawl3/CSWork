import java.util.Scanner;
public class Summation{
public static void main(String[] args)
{
Scanner inp=new Scanner(System.in);
System.out.println("Enter integer N");
int N=inp.nextInt();
int sum=0;
for(int j=0;j<=N;j++)
{
sum= sum +j*j;
}
System.out.println("The Sum until " +N + " is " + sum);
}}