import java.util.*;
public class myStackTest1
{
	
	public static void main(String[] args)
	{
		Scanner woo = new Scanner(System.in);
		myStack<Shape> something = new myStack<Shape>();
		Shape sample1 = new Shape(3,3);
		Shape sample2 = new Shape(6,5);
		something.push(sample1);
		something.push(sample2);
		
			int stopper = 0;
			while(stopper != 6)
			{
				System.out.println("1: Peek, 2: Push, 3:Empty, 4:Search, 5:Pop, 6:Exit");
				int choice = woo.nextInt();
				if(choice == 1)
				{
					stopper = 1;
					Shape whatever = something.peek();
					System.out.println(whatever.toString());
				}
				
				if(choice == 2)
				{
					System.out.println("Input the perimeter followed by the area of the shape you wish to add (P_A):");
					double perimeter = woo.nextDouble();
					double area = woo.nextDouble();
					Shape addon = new Shape(perimeter,area);
					something.push(addon);
					System.out.println("Shape has been added to Stack");
					stopper = 2;
				}
				
				if(choice == 3)
				{
					stopper = 3;
					System.out.println(something.empty());
				}
				
				if(choice == 4)
				{
					stopper = 4;
					System.out.println("Input the perimeter followed by the area of the shape you are looking for(P_A):");
					double perimeter = woo.nextDouble();
					double area = woo.nextDouble();
					Shape where = new Shape(perimeter, area);
					int prithvi = something.Search(where);
					if(prithvi == -1)
					{
						System.out.println("The object was not found");
					}
					else
					{
						System.out.println("The object is in the " + (prithvi+1) + "th slot");
					}
				}
				
				if(choice == 5)
				{
					stopper = 5;
					Shape copy = something.pop();
					System.out.println("The top object has been removed from the stack."); 
				}
				if(choice == 6)
				{
					System.exit(0);
				}
			}
		}
	}
