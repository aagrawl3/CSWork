import java.util.Scanner;
public class complex {
public static void main(String[] args);
{
	complex m = new complex(args);
	complex sum = new complex (args);
	Scanner.inp=new Scanner (System.in);
	System.out.println("Enter the values of a then b for the complex number a + bi");
	double a = inp.nextDouble();
	double b = inp.nextDouble();
	System.out.println("Enter the values of c then d for the second complex number c + di");
	double c = inp.nextDouble();
	double d = inp.nextDouble();
	
	System.out.println("Select a function: 1-Add, 2-Subtract, 3-Multiply, 4-Divide, 5-Put to any power, 6-Anything Else");
	int t = inp.nextInt();
	if(t=1)
	{
		sum = sum.add(a,b,c,d);
		System.out.println("Sum: " + sum.getreal + " " + sum.getimag + "i" );
	}
	else
	{}	





		public double add(double a,double b,double c,double d)
		{
			double Y = 0;
			double Z = 0;
			Y = a + c;
			Z = b + d;
			sum.real = Y;
			sum.imag = Z;
			return (sum);	
		}
	}
}
	

