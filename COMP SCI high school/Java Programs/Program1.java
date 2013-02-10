import java.util.Scanner;
public class Program1{
public static void main(String[] args)
{
Scanner inp=new Scanner(System.in);
System.out.println("Enter your name");
String myname=inp.next();
int numletters=myname.length();
System.out.println("The number of letters in my name = " + "\n" + numletters);
}}