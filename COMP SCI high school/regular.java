import java.util.*;
class regular extends Shape
{
	public double sides;
	public double sidelength;
	public double apothem;
	public regular(double numofsides,double length)
	{
		sides = numofsides;
		sidelength = length;
		apothem = 0;
		area = 0;
		perimeter = 0;
	}
	
	public void findapothem()
	{
		apothem = (sidelength/(2*Math.tan(Math.PI/sides)));
	}
	
	public void findperimeter()
	{
		perimeter = sides*sidelength;
	}
	
	public void findarea()
	{
		area = 0.5 * perimeter * apothem;
	}
}

