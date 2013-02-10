import java.util.Scanner;
public class reverser{
public static void main(String[] args)
{
String mystring, reversestring;
Scanner inp=new Scanner(System.in);
System.out.println("Enter your words");
mystring=inp.nextLine();
reversestring=reverstr(mystring);
System.out.println(reversestring);
}
public static String reverstr(String somestring)
{
int strlen=somestring.length();
String strret="";
for (int i=strlen-1;i>=0;i--)
{
strret+=somestring.substring(i,i+1);}
return(strret);
}}