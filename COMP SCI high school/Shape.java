import java.util.*;
public class Shape
{
	protected double perimeter,area,sides,sidelength;
	public Shape (double pm,double a)
	{
		perimeter = pm;
		area = a;
	}
	
	public Shape ()
	{
		perimeter = 0;
		area = 0;
	}
	
	public double getperimeter()
	{
		return perimeter;
	}
	
	public double getarea()
	{
		return area;
	}
	
	public boolean comparearea(Shape x, Shape y)
	{
		return(x.getarea() == y.getarea());
	}
	
	public boolean compareperimeter(Shape x, Shape y)
	{
		return(x.getperimeter() == y.getperimeter());
	}
	
	public boolean equals(Shape y)
	{
		if(comparearea(this,y) == true && compareperimeter(this,y) == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int compareTo(Object y)
	{
		if(this.getarea() < ((Shape)y).getarea())
		{
			return(-1);
		}
		
		else if(this.getarea() == ((Shape)y).getarea())
		{
			return(0);
		}
		else if(this.getarea() > ((Shape)y).getarea())
		{
			return(1);
		}
		else
		{
			return(475090598);
		}
	}
	
	public String toString()
	{
		String blah = ("The shape has perimeter of " + this.getperimeter() + " and an area of " + this.getarea() + ".");
		return blah;
	}
}

