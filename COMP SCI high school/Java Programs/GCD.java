import java.util.Scanner;
public class GCD{
public static void main(String[] args)
{
int num1,num2,gcf;
Scanner inp=new Scanner(System.in);
System.out.println("Enter 2 numbers");
num1=inp.nextInt();
num2=inp.nextInt();
gcf=Euclidean(num1,num2);
System.out.println("The GCF is " +gcf);
}
public static int Euclidean(int x,int y)
{
int num1=Math.min(x,y);
int num2=Math.max(x,y);
int r;
while (num2%num1 != 0) {
r=num2%num1;
num2=num1;
num1=r;
}
return(num1);
}}