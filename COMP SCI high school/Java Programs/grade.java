import java.util.Scanner;
public class grade{
public static void main(String[] args)
{
Scanner inp=new Scanner(System.in);
System.out.println("Enter your numerical grade");
double ngrade=inp.nextDouble();
String lettergrade;
if (ngrade >= 90)
{
lettergrade="A";
}
else if (ngrade >= 80)
{
lettergrade="B";
}
else if (ngrade >= 70)
{
lettergrade="C";
}
else if (ngrade >=60)
{
lettergrade="I";
}
else
{
lettergrade="NC";
}
System.out.println("Your letter grade is : " +lettergrade);
}}

