public class vector{
	private double xcomp, ycomp;
	public vector (double x, double y)
	{
		xcomp = x;
		ycomp = y;
	}
	
	public vector ()
	{
		xcomp = 0;
		ycomp = 0;
	}

	public vector (vector anything)
	{
		xcomp = anything.getxcomp();
		ycomp = anything.getycomp();
	}
	
	public String toString()
	{
		String retStr="";
		retStr="("+xcomp+","+ycomp+")";
		return retStr;
	}
	
	public double getxcomp()
	{
		return xcomp;
	}
	
	public double getycomp()
	{
		return ycomp;
	}
	
	public double magnitude(vector random)
	{
		return (Math.sqrt(random.getxcomp()*random.getxcomp() + random.getycomp()*random.getycomp()));
	}
	
	public double angle(vector random)
	{
		 double theta = Math.toRadians(Math.atan(random.getycomp()/random.getxcomp()));
		 if(random.getycomp()==0 && random.getxcomp()<0)
			{
				return(180.0);
			}
		 else if(random.getycomp()>0 && random.getxcomp()<0)
			{
				return(theta + 180);
			}
		 else if(random.getycomp()<0 && random.getxcomp()>=0)
			{
				return(theta + 360);
			}
		 else if(random.getycomp()<0 && random.getxcomp()<0)
			{
				return(theta + 180);
			}
		 else if(random.getycomp()==0 && random.getxcomp()==0)
			{
				return(0.0);
			}
		 else
			{
				return(theta);
			}
	}
	
	public void rotate(double theta)
	{
		double temp = this.getxcomp();
		double temp2 =this.getycomp();
		theta = theta*Math.PI/180.0;
		xcomp = temp*Math.cos(theta) - temp2*Math.sin(theta);
		ycomp = temp*Math.sin(theta) + temp2*Math.cos(theta);
	}
	
	public static vector add(vector random, vector omg)
	{
		vector sum = new vector (random.getxcomp() + omg.getxcomp(), random.getycomp() + omg.getycomp());
		return sum;
	}
	
	public static vector subtract(vector whatever, vector lol)
	{
		vector difference = new vector (whatever.getxcomp() - lol.getxcomp(), whatever.getycomp() - lol.getycomp());
		return difference;
	}
	
	public static double scalar(vector blah, vector idk)
	{
		double scalar = blah.getxcomp() * idk.getxcomp()+blah.getycomp() * idk.getycomp();
		return scalar;
	}
}