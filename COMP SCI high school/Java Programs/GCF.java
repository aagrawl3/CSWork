import java.util.Scanner;
public class GCF{
public static void main(String[] args)
{
Scanner inp=new Scanner(System.in);
System.out.println("Enter the 2 numbers");
int num1=inp.nextInt();
int num2=inp.nextInt();
if (num1>num2)
{
int temp=num1;
num1=num2;
num2=temp;
}
int r;
while (num2%num1 != 0) {
r=num2%num1;
num2=num1;
num1=r;
}
System.out.println("The Greatest Common Factor is "+num1);
}}