import java.util.*;
class circle extends Shape
{
	public double r;
	public circle (double radius)
	{
	r = radius;
	area = 0;
	perimeter = 0;
	}
	
	public void findarea()
	{
		area = Math.pow(r,2) * Math.PI;
	}
	
	public void findperimeter()
	{
		perimeter = 2 * r * Math.PI;
	}
}

