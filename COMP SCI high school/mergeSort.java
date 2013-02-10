import java.util.*;
public class mergeSort{
public static void main(String[] args)
{
  Scanner inp = new Scanner(System.in);
  System.out.print("Input the number of random doubles: ");
  int number1 = inp.nextInt();
  System.out.print("Input the lower bound: ");
  double a = inp.nextDouble();
  System.out.print("Input the upper bound: ");
  double b = inp.nextDouble();
  double[] x = Array(number1,a,b);
  MergeSort(x);
  for(int i=0; i<x.length-1; i++)
  {
		System.out.println(x[i]+", ");
  }
  System.out.print(x[x.length-1]);
}


public static double[] Array(int number1, double a, double b)
{
  double[] sort = new double[number1];
  for(int i = 0; i<number1; i++)
   {
		sort[i] = a+(b-a)*Math.random();
   }
  return sort;
}


public static void MergeSort(double[] sort)
{
  if(sort.length>1)
   {
	   double[] left = leftHalf(sort);
	   double[] right = rightHalf(sort);
	   MergeSort(left);
	   MergeSort(right);
	   merge(sort, left, right);		
   }
}


public static double[] leftHalf(double[] sort)
{
  int size1 = sort.length/2;
  double[] left = new double[size1];
  for(int i = 0; i<size1; i++)
   {
		left [i] = sort[i];
   }
  return left;
}


public static double[] rightHalf(double[] sort)
{
  int size1 = sort.length/2;
  int size2 = sort.length-size1;
  double[] right = new double[size2];
  for(int i =0; i<size2; i++)
   {
		right[i] = sort[i+size1];
   }
  return right;
}


public static void merge(double[] result, double[] left, double[] right)
{
  int indexL = 0;
  int indexR = 0;
  for(int i = 0; i<result.length; i++)
   {
	   if(indexR>=right.length || (indexL<left.length && left[indexL]<=right[indexR]))
		{
			result[i] = left[indexL];
			indexL++;
		}
	   else
	   {
		   result[i] = right[indexR];
		   indexR++;
	   }
  }
}
}