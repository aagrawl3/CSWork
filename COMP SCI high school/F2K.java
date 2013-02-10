import java.util.Scanner;
public class f2k{
public static void main(String[]args){
Scanner inp = new Scanner(System.in);
System.out.println("Enter temperature(F)");
double Fah = inp.nextDouble();
double kelvin=(Fah-32.0)*(5.0/9.0)+273.15;
System.out.println("Tenperature(K)= "+kelvin);
}}