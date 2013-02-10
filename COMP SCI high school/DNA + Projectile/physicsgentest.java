import java.util.*;
import java.io.*;
public class physicsgentest
{
	public static void main(String[] args) throws IOException
	{
		Scanner woot = new Scanner(System.in);
		System.out.println("Projectile Motion Problem Generator");
		System.out.println("Items left blank will be randomized.");
		System.out.print("Input the starting speed(m/s): ");
		double speed = woot.nextDouble();
		System.out.print("Input the launch angle (0-90): ");
		double angle = woot.nextDouble();
		System.out.print("Input the starting height(meters): ");
		double height = woot.nextDouble();
		physicsgen victory = new physicsgen(speed,angle,height,0,0,0,0,0);
		victory.flighttime();
		victory.maxheight();
		victory.distancetraveler(victory.getflight());
		victory.endangle(victory.getflight());
		System.out.println("How many questions do you want to make?");
		int b = woot.nextInt();
		System.out.println("Which type of question do you want? 1: Multiple Choice 2:Free Response");
		int a = woot.nextInt();
		for(int i = 0; i < b; i++)
		{
			if(a == 2)
			{
			victory.freeresponse();
			}
			if(a == 1)
			{
			victory.multiplechoice();	
			}
			
		}
		System.out.println("All problems have been placed in Problems.txt");
		
	}
}
	