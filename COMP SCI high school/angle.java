	public double angleToX()
	{
		double a = Math.atan(ycomp / xcomp);
		if(ycomp > 0)
		{
			if(xcomp > 0)
				return((a) * 180/Math.PI);
			else if(xcomp == 0)
				return(90);
			else
				return(Math.toDegrees(a) + 180);
		}
		
		if(ycomp == 0)
		{
			if(xcomp >= 0)
				return(0);
			else
				return(180);
		}

		else
		{
			if(xcomp > 0)
				return(Math.toDegrees(a) + 360);
			else if (xcomp == 0)
				return(270);
			else
				return(Math.toDegrees(a) + 180);
		}
	}