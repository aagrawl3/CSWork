public class Complex
{
	private double m,n;
	public Complex (double mm, double nn)
	{
		m = mm;
		n = nn;
	}
	
	public Complex ()
	{
		m = 0;
		n = 0;
	}
	public Complex (Complex A)
	{
		m = A.getreal();
		n = A.getimag();
	}
	public double getreal()
	{
		return m;
	}
	public double getimag()
	{
		return n;
	}

	public double getMag()
	{
		return Math.sqrt(Math.pow(getreal(),2)+Math.pow(getimag(),2));
	}


	 
	 //addition
	 
	public Complex add(Complex first, Complex second) 
	{
		Complex random = new Complex(first.getreal() + second.getreal(), first.getimag() + second.getimag());
		return (random);
	}
	
	//subtraction
	public Complex subtract(Complex first, Complex second)
	{
		Complex subtract = new Complex(first.getreal() - second.getreal(), first.getimag() - second.getimag());
		return (subtract);
	}
	
	//Multiplication
	public Complex multiply(Complex first)
	{
		Complex stuff = new Complex(first.getreal()*this.getreal()-first.getimag()*this.getimag(), first.getreal()*this.getimag()+this.getreal()*first.getimag());
		return (stuff);
	}
	
	//Conjugation
	public static Complex conjugate(Complex second)
	{
		Complex blah = new Complex(second.getreal(), -1*second.getimag());
		return (blah);
	}
	
	//Division
	public static Complex divide(Complex first, Complex second)
	{
		Complex numerator = new Complex ();
		numerator = first.multiply(Complex.conjugate(second));
		Complex finish = new Complex (numerator.getreal()/(Math.pow(second.getreal(),2) + Math.pow(second.getimag(),2)) , numerator.getimag()/(Math.pow(second.getreal(),2) + Math.pow(second.getimag(),2)));
		return (finish);
	}
	
	//Angle
	public double angle() 
	{
		double angle = Math.atan2(this.getimag(),this.getreal());
		return (angle);
	}
	
	public static double angle2(Complex first, Complex second)
	{
		  double random = first.getreal()*second.getreal()+first.getimag()*second.getimag();
                  return (Math.toDegrees(Math.acos(random/first.getMag()/second.getMag())));
	}
	
	//Power
	public static Complex power(Complex A, double B)
	{
	  double theta = A.angle();
	  double X = Math.pow(A.getMag(),B)*Math.cos(B*theta);
	  double Y = Math.pow(A.getMag(),B)*Math.sin(B*theta);
	  Complex Z = new Complex(X,Y);
	  return (Z);
	}


}