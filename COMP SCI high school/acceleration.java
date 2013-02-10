import java.util.Scanner;
public class practice
	{
		public static void main (String[]args)
		{
		Scanner input = new Scanner (System.in);
		System.out.println("Enter initial velocity in meters per second");
		int initial = input.nextInt();
		System.out.println("Enter time in seconds");
		int time = input.nextInt();
		System.out.println("Enter acceleration in meters per second square");
		int accel = input.nextInt();
		double distance = 1.0;
		distance = (initial*time) + (0.5 * accel * time * time);
		System.out.println("Distance traveled: " + distance + " meters");
		}
	}
	