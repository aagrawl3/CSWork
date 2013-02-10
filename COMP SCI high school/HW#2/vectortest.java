import java.util.Scanner;
public class vectortest
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Input the x component of the first vector:");
		double w = inp.nextDouble();
		System.out.println("Input the y component of the first vector:");
		double x = inp.nextDouble();
		System.out.println("Input the x component of the second vector:");
		double y = inp.nextDouble();
		System.out.println("Input the y component of the second vector:");
		double z = inp.nextDouble();
		System.out.println("Input theta: ");
		double theta = inp.nextDouble();
		
		vector one = new vector(w,x);
		vector two = new vector(y,z);
		
		double mag = one.magnitude(one);
		System.out.println("The magnitude of the first vector is: " + mag);
		double mag2 = two.magnitude(two);
		System.out.println("The magnitude of the second vector is: " + mag2);
		double angle = one.angle(one);
		System.out.println("The angle of the first vector from the positive x-axis is: " + angle);
		double angle2 = one.angle(two);
		System.out.println("The angle of the first vector from the positive x-axis is: " + angle2);
		one.rotate(theta);
		System.out.println("The first vector rotated by " + theta + " degrees is: " + one);
		two.rotate(theta);
		System.out.println("The first vector rotated by " + theta + " degrees is: " + two);
		vector sum = vector.add(one,two);
		System.out.println("The sum of the two vectors is " + sum);
		vector difference = vector.subtract(one,two);
		System.out.println("The difference between the two vectors is " + difference);
		double scalar = vector.scalar(one,two);
		System.out.println("The scalar product of the two vectors is " + scalar);

}
	}