import java.util.Scanner;
public class random{
public static void main(String[]args) {
Scanner inp = new Scanner (System.in);
System.out.println("Enter your name");
String myname = inp.next();
int noofletters=myname.length();
System.out.println("The numberof letters in my name = "+ "\n" +noofletters);
}}