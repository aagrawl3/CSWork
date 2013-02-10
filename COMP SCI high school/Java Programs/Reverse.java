import java.util.Scanner;
public class Reverse{
public static void main(String[] args)
{
String r;
Scanner inp= new Scanner(System.in);
System.out.println("Enter some words seperated by spaces");
r=inp.nextLine();
String z="";
int len=r.length();
for (int i=1;i<=len;i++)
{
z=z+r.charAt(len-i);
}
System.out.println(z);
}}