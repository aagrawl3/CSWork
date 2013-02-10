import java.io.*;
import java.util.*;
public class physicsgen 
{
	protected double launchspeed,launchangle,startingheight,flighttime,velocity,maxheight,distancetravel,endangle;
	public physicsgen (double ls,double la,double sh,double ft,double v,double mh,double dt,double ea)
	{
		launchspeed = ls;
		launchangle = la;
		startingheight = sh;
		flighttime = ft;
		velocity = v;
		maxheight = mh;
		distancetravel = dt;
		endangle = ea;
	}
	
	public physicsgen ()
	{
		launchspeed = 0;
		launchangle = 0;
		startingheight = 0;
		flighttime = 0;
		velocity = 0;
		maxheight = 0;
		distancetravel = 0;
		endangle = 0;
	}
	
	public physicsgen(physicsgen x)
	{
		launchspeed  = x.getspeed();
		launchangle = x.getangle();
		startingheight = x.getheight();
		flighttime = x.getflight();
		velocity = x.getvelocity();
		maxheight = x.getmax();
		distancetravel = x.getdistance();
		endangle = x.getend();
	}
	
	public double getspeed()
	{
		return launchspeed;
	}
	
	public double getangle()
	{
		return launchangle;
	}
	
	public double getheight()
	{
		return startingheight;
	}
	
	public double getflight()
	{
		return flighttime;
	}
	
	public double getvelocity()
	{
		return velocity;
	}
	
	public double getmax()
	{
		return maxheight;
	}
	
	public double getdistance()
	{
		return distancetravel;
	}
	
	public double getend()
	{
		return endangle;
	}
	
	public void flighttime()
	{
		double angle = Math.toRadians(launchangle);
		double speedY = launchspeed*Math.sin(angle);
		double flightT =(-1.0*speedY - Math.sqrt((speedY * speedY) - (19.6 * startingheight)))/9.8;
		if(flightT<0.0)
		{
			flightT = -1.0*(-1*speedY-Math.sqrt(Math.pow(speedY,2)+19.6*startingheight))/9.8;
		}
		flighttime = flightT;
	}

	public void findvelocity(double currenttime)
	{
		double xvelocity = Math.cos(this.getangle() * Math.PI / 180.0) * this.getspeed();
		double yinitial = Math.sin(this.getangle() * Math.PI / 180.0) * this.getspeed();
		double yvelocity = yinitial - 9.8 * currenttime;
		double blah = Math.pow(yvelocity,2) + Math.pow(xvelocity,2);
		velocity = Math.sqrt(blah);
	}
	
	public double findxvelocity()
	{
		return Math.cos(this.getangle() * Math.PI / 180.0) * this.getspeed();
	}
	
	public double findyvelocity()
	{
		return Math.sin(this.getangle() * Math.PI / 180.0) * this.getspeed() - 9.8 * flighttime;
	}
	
	public void endangle(double finaltime)
	{	
		double x = this.findxvelocity();
		double y = this.findyvelocity();
		endangle = Math.toDegrees(Math.atan((double)(y/x)));
	}
	
	public void maxheight()
	{
		double upward = Math.sin(this.getangle() * Math.PI / 180.0) * this.getspeed();
		double x = Math.pow(upward,2)/19.6;
		maxheight = this.getheight() + x;
	}
	
	public void distancetraveler(double flighttime)
	{
		double xvelocity = Math.cos(this.getangle() * (Math.PI / 180.0)) * this.getspeed();
		double xtravel = xvelocity * flighttime;
		double ytravel = this.getheight();
		double distance = Math.pow(xtravel,2) + Math.pow(ytravel,2);
		distancetravel = Math.pow(distance,.5);
	}
	
	public void freeresponse() throws IOException
	{
		double a = this.getflight();
		double c = this.getmax();
		double d = this.getdistance();
		double e = this.getend();
		double f = this.getheight();
		double g = this.getspeed();
		double h = this.getangle();
		System.out.println("What do you want the student to solve for? 1:Flight Time 2:Instantaneous Velocity 3:Max Height 4:Total Displacement 5:Angle upon Landing");
		Scanner inp = new Scanner(System.in);
		double type = inp.nextDouble();
		if(type == 1)
		{
			BufferedWriter out = new BufferedWriter(new FileWriter("Problems.txt",true));
			out.write("Free Response: A really cool guy throws a rock from a height of " + f + " meters at a "); 
			out.newLine();
			out.write("speed of " + g + " m/s with an angle of " + h + " degrees from the positive x-axis. How long ");
			out.newLine();
			out.write("does the rock remain in air?");
			out.newLine();
			out.write("The answer is " + ((double)((int)(1000 * a)))/1000);
			out.newLine();
			out.newLine();
			out.close();
		}
		if(type == 2)
		{
			Scanner what = new Scanner(System.in);
			System.out.print("Input a time within the flight duration: ");
			double w = what.nextDouble();
			this.findvelocity(w);
			double b = this.getvelocity();
			BufferedWriter out = new BufferedWriter(new FileWriter("Problems.txt",true));
			out.write("Free Reponse: Tony throws his tennis racket from a height of " + f + " meters at a ");
			out.newLine();
			out.write("speed of " + g + " m/s with an angle of " + h + " degrees from the positive x-axis. At " + w + " seconds, ");
			out.newLine();
			out.write("what is the velocity of the racket?");
			out.newLine();
			out.write("The answer is " + ((double)((int)(1000 * b)))/1000);
			out.newLine();
			out.newLine();
			out.close();
		}
		if(type == 3)
		{
			BufferedWriter out = new BufferedWriter(new FileWriter("Problems.txt",true));
			out.write("Free Response: Thomas throws a basketball from a height of " + f + " meters at a "); 
			out.newLine();
			out.write("speed of " + g + " m/s with an angle of " + h + " degrees from the positive x-axis. What is the ");
			out.newLine();
			out.write("greatest height attained by the ball?");
			out.newLine();
			out.write("The answer is " + ((double)((int)(1000 * c)))/1000);
			out.newLine();
			out.newLine();
			out.close();
		}
		if(type == 4)
		{
			BufferedWriter out = new BufferedWriter(new FileWriter("Problems.txt",true));
			out.write("Free Response: Alex shoots a cannon from a height of " + f + " meters, releasing a cannonball "); 
			out.newLine();
			out.write("at a speed of " + g + " m/s with an angle of " + h + " degrees from the positive x-axis. ");
			out.newLine();
			out.write("Upon touching the ground, how far is the cannonball from the launching spot?");
			out.newLine();
			out.write("The answer is " + ((double)((int)(1000 * d)))/1000);
			out.newLine();
			out.newLine();
			out.close();
		}
		if(type == 5)
		{
			BufferedWriter out = new BufferedWriter(new FileWriter("Problems.txt",true));
			out.write("Free Response: Justin lsunches an emp from a height of " + f + " meters at a "); 
			out.newLine();
			out.write("speed of " + g + " m/s with an angle of " + h + " degrees from the positive x-axis. Upon ");
			out.newLine();
			out.write("hitting the ground, what angle does it make with the surface?");
			out.newLine();
			out.write("The answer is " + -((double)((int)(1000 * e)))/1000);
			out.newLine();
			out.newLine();
			out.close();
		}
	}
	
	public void multiplechoice() throws IOException
	{
		String[] letters = new String[] {"A","B","C","D","E"};
		double[] Answers = new double[5];
		Scanner lol = new Scanner(System.in);
		double a = this.getflight();
		double c = this.getmax();
		double d = this.getdistance();
		double e = this.getend();
		double f = this.getheight();
		double g = this.getspeed();
		double h = this.getangle();
		System.out.println("What do you want the student to solve for? 1:Flight Time 2:Instantaneous Velocity 3:Max Height 4:Total Displacement 5:Angle upon Landing");
		double type = lol.nextDouble();
		if(type == 1)
		{
			for(int i=0; i<5; i++)
			{
				Answers[i] = ((double)((int)((a +(Math.random() * 10 + 0.5)) * 1000))) /1000;
			}
			Answers[(int)(Math.random()*5.0)] = ((double)((int)(1000 * a)))/1000;
			BufferedWriter out = new BufferedWriter(new FileWriter("Problems.txt",true));
			out.write("Multiple Choice: A really cool guy throws a rock from a height of " + f + " meters at a "); 
			out.newLine();
			out.write("speed of " + g + " m/s with an angle of " + h + " degrees from the positive x-axis. How long ");
			out.newLine();
			out.write("does the rock remain in air?");
			out.newLine();
			for(int i = 0; i < 5; i++)
			{
				out.write(letters[i] + " " + Answers[i] + " seconds");
				out.newLine();
			}
			out.write("The answer is " + ((double)((int)(1000 * a)))/1000);
			out.newLine();
			out.newLine();
			out.close();

		}
		if(type == 2)
		{
			Scanner what = new Scanner(System.in);
			System.out.print("Input a time within the flight duration: ");
			double w = what.nextDouble();
			this.findvelocity(w);
			double b = this.getvelocity();
			for(int i=0; i<5; i++)
			{
				Answers[i] = ((double)((int)((b +(Math.random() * 10 + 1.25)) * 1000))) /1000;  
			}
			Answers[(int)(Math.random()*5.0)] = ((double)((int)(1000 * b)))/1000;
			BufferedWriter out = new BufferedWriter(new FileWriter("Problems.txt",true));
			out.write("Multiple Choice: A physics student launches a grenade from a height of " + f + " meters at a "); 
			out.newLine();
			out.write("speed of " + g + " m/s with an angle of " + h + " degrees from the positive x-axis. How fast ");
			out.newLine();
			out.write("is the grenade moving after " + w + " seconds?");
			out.newLine();
			for(int i = 0; i < 5; i++)
			{
				out.write(letters[i] + " " + Answers[i] + " m/s");
				out.newLine();
			}
			out.write("The answer is " + ((double)((int)(1000 * b)))/1000);
			out.newLine();
			out.newLine();
			out.close();
		}
		if(type == 3)
		{
			for(int i=0; i<5; i++)
			{
				Answers[i] = ((double)((int)((c +(Math.random() * 10 + 2.547)) * 1000))) /1000;
			}
			Answers[(int)(Math.random()*5.0)] = ((double)((int)(1000 * c)))/1000;
			BufferedWriter out = new BufferedWriter(new FileWriter("Problems.txt",true));
			out.write("Multiple Choice: Prithvi throws a tennis ball from a height of " + f + " meters at a "); 
			out.newLine();
			out.write("speed of " + g + " m/s with an angle of " + h + " degrees from the positive x-axis. What is the ");
			out.newLine();
			out.write("maximum height achieved by the ball?");
			out.newLine();
			for(int i = 0; i < 5; i++)
			{
				out.write(letters[i] + " " + Answers[i] + " meters");
				out.newLine();
			}
			out.write("The answer is " + ((double)((int)(1000 * c)))/1000);
			out.newLine();
			out.newLine();
			out.close();
		}
		if(type == 4)
		{
		for(int i=0; i<5; i++)
			{
				Answers[i] = ((double)((int)((d +(Math.random() * 10 + 3.675)) * 1000))) /1000;
			}
			Answers[(int)(Math.random()*5.0)] = ((double)((int)(1000 * d)))/1000;
			BufferedWriter out = new BufferedWriter(new FileWriter("Problems.txt",true));
			out.write("Multiple Choice: Kevin hits a golf ball from a height of " + f + " meters at a "); 
			out.newLine();
			out.write("speed of " + g + " m/s with an angle of " + h + " degrees from the positive x-axis. When the ball ");
			out.newLine();
			out.write("hits the ground, how far is it from the tee?");
			out.newLine();
			for(int i = 0; i < 5; i++)
			{
				out.write(letters[i] + " " + Answers[i] + " meters");
				out.newLine();
			}
			out.write("The answer is " + ((double)((int)(1000 * d)))/1000);
			out.newLine();
			out.newLine();
			out.close();
		}
		if(type == 5)
		{
		for(int i=0; i<5; i++)
			{
				Answers[i] = -((double)((int)((e +(Math.random() * 10 + 1.5)) * 1000))) /1000;
			}
			Answers[(int)(Math.random()*5.0)] = -((double)((int)(1000 * e)))/1000;
			BufferedWriter out = new BufferedWriter(new FileWriter("Problems.txt",true));
			out.write("Multiple Choice: Vishnu throws a textbook from a height of " + f + " meters at a "); 
			out.newLine();
			out.write("speed of " + g + " m/s with an angle of " + h + " degrees from the positive x-axis. Upon hitting ");
			out.newLine();
			out.write("the ground, what is the angle the book makes with the ground?");
			out.newLine();
			for(int i = 0; i < 5; i++)
			{
				out.write(letters[i] + " " + Answers[i] + " degrees");
				out.newLine();
			}
			out.write("The answer is " + -((double)((int)(1000 * e)))/1000);
			out.newLine();
			out.newLine();
			out.close();
		}
		
		
	}
		
}