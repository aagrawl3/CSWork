import java.util.Scanner;
public class grade{
public static void main(String[]args) {
Scanner inp = new Scanner (System.in);
System.out.println("Input your grade");
double failgrade = inp.nextDouble();
String letter;
if (failgrade >= 90)
	{letter = "A";}
else if (failgrade >= 80)
	{letter = "B";}
else if (failgrade >= 70)
	{letter = "C";}
else if (failgrade >= 60)
	{letter = "I";}
else
	{letter = "NC";} 
System.out.println("Grade:" + letter);
}}