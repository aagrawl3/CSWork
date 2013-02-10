import java.util.*;
public class myStackTest2
{
	
	public static void main(String[] args)
	{
		Scanner woo = new Scanner(System.in);
		myStack<Complex> something = new myStack<Complex>();
		Complex sample1 = new Complex(3,3);
		Complex sample2 = new Complex(6,5);
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
					Complex whatever = something.peek();
					System.out.println(whatever.toString());
				}
				
				if(choice == 2)
				{
					System.out.println("Input the real followed by the imaginary coordinates of the complex number you wish to add (R_I):");
					double real = woo.nextDouble();
					double imaginary = woo.nextDouble();
					Complex addon = new Complex(real,imaginary);
					something.push(addon);
					System.out.println("Complex has been added to Stack");
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
					System.out.println("Input the real followed by the imaginary coordinates you are looking for you are looking for (R_I):");
					double real = woo.nextDouble();
					double imaginary = woo.nextDouble();
					Complex where = new Complex(real, imaginary);
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
					Complex copy = something.pop();
					System.out.println("The top object has been removed from the stack."); 
				}
				if(choice == 6)
				{
					System.exit(0);
				}
			}
		}
	}

