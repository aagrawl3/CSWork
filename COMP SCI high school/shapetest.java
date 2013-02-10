import java.util.*;
import javax.swing.*;

public class shapetest
{
	public static void main(String[] args)
	{
		double totalA = 0;
		double totalP = 0;
		Scanner woot = new Scanner(System.in);
		System.out.print("Input the number of polygons you wish to create:");
		int polys = woot.nextInt();
		Shape[] compare = new Shape [polys];
		for(int i = 0; i < polys; i++)
		{
			System.out.print("Input the number of sides of the shape(0 if it is a circle): ");
			double sides = woot.nextDouble();
			if (sides == 0)
			{
				System.out.print("Input the radius of the circle: ");
				double radius = woot.nextDouble();
				Shape test = new circle(radius);
				test.findarea();
				test.findperimeter();
				totalA += test.getarea();
				totalP += test.getperimeter();
				System.out.println("The area of the circle is " + test.getarea() + " and the perimeter is " + test.getperimeter());
				System.out.println("");
				compare[i] = test;
			}
			if (sides > 2)
			{
				System.out.print("Input the length of the sides of the regular polygon: ");
				double sidelength = woot.nextDouble();
				regular test1 = new regular(sides,sidelength);
				test1.findapothem();
				test1.findperimeter();
				test1.findarea();
				totalA += test1.getarea();
				totalP += test1.getperimeter();
				System.out.println("The area of the polygon is " + test1.getarea());
				System.out.println("The perimeter of the polygon is " + test1.getperimeter());
				System.out.println("");
				compare[i] = test1;
			}
		}
		for(int w = 0; w < polys; w++)
		{
			for(int y = w + 1; y < polys; y++)
			{
				if (compare[w].equals(compare[y]) == true)
				{
					System.out.println("Polygons #" + (w+1) + " and #" + (y+1) + " are congruent");
				}
			}
		}
		System.out.println("");
		for(int w = 0; w < polys-1; w++)
		{	
				System.out.println("Comparison between polygon #" + (w+1) + " and polygon #" + (w+2) + " = " + compare[w].compareTo(compare[w+1]));
		}
		//System.out.println("The total area of all the polygons is " + totalA);
		JOptionPane.showMessageDialog(null, "The total area of all the polygons is " + totalA + "\n The total perimeter of all the polygons is " + totalP);
		//System.out.println("The total perimeter of all the polygons is " + totalP);
	}
}