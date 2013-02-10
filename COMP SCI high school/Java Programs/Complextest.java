import java.util.*;
public class complextest{
public static void main(String[] args)
{
Scanner inp=new Scanner(System.in);
System.out.println("Enter the first complex number: real part then imaginary part (ex 3 4)");
double a=inp.nextDouble();
double b=inp.nextDouble();
System.out.println("Enter the second complex number: real part then imaginary part(ex 3 4)");
double c=inp.nextDouble();
double d=inp.nextDouble();
Complex first=new Complex(a,b);
Complex second=new Complex(c,d);
Complex added=first.add(second);
Complex subtracted=first.subtract(second);
Complex multiplied=first.multiply(second);
Complex divided=first.divide(second);
System.out.println("Added imaginary number: "+Complex.imtostring(added));
System.out.println("Subtracted imaginary number: "+Complex.imtostring(subtracted));
System.out.println("Multiplied imaginary number: "+Complex.imtostring(multiplied));
System.out.println("Divided imaginary number: "+Complex.imtostring(divided));
System.out.println("Enter a power that you want to the first imaginary number taken to");
double numpow=inp.nextDouble();
Complex unityroot=Complex.power(first,numpow);
System.out.println("First imaginary number taken to " +numpow +" power: "+Complex.imtostring(unityroot));
}}