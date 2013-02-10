import java.util.Scanner;
public class complexTest
{
	public static void main(String[] args)
	{
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Input the x component of the first complex number");
		double firstx = inp.nextDouble();
		System.out.println("Input the y component of the first complex number");
		double firsty = inp.nextDouble();
		System.out.println("Input the power you want to put the first complex to");
		double power = inp.nextDouble();
		System.out.println("Input the x component of the second complex number");
		double secondx = inp.nextDouble();
		System.out.println("Input the y component of the second complex number");
		double secondy = inp.nextDouble();
		Complex one = new Complex(firstx,firsty);
		Complex two = new Complex(secondx,secondy);
		Complex sum = one.add(one,two);
		System.out.println("The sum of the two complex numbers is " + format(sum));
		Complex difference = one.subtract(one,two);
		System.out.println("The difference of the two complex numbers is " + format(difference));
		Complex product = one.multiply(two);
		System.out.println("The product of the two complex numbers is " + format(product));
		Complex quotient = one.divide(one,two);
		System.out.println("The quotient of the two complex numbers is " + format(quotient));
		Double angle = one.angle();
		System.out.println("The angle for the first complex from the positive x-axis is " + angle); 
		double angle2 = Complex.angle2(one,two);
		System.out.println("The angle between the two complex numbers is " + angle2);
		Complex power1 = Complex.power(one,power);
		System.out.println("Result after taking Complex One to Power "+power+" is " + format(power1));
	}
	//Formating
	public static String format(Complex whatever)
	{
		String formated = whatever.getreal() + " + " + whatever.getimag() + "i";
		return (formated);
	}
}