import java.util.*;
public class Riemann{
public static void main(String[] args)
{
  System.out.println("This program takes the integral from a to b with N number of cross-sections");
  System.out.print("Input a: ");
  Scanner inp= new Scanner(System.in);
  double x= inp.nextDouble();
  System.out.print("Input b: ");
  double y= inp.nextDouble();
  System.out.print("Input N: ");
  int z= inp.nextInt();
  System.out.println("Area under the curve from "+x+" to "+y+": "+RiemannS(x,y,z));
}


public static double RiemannS(double x, double y, int z)
{
  double sum= 0;
  double finalz=0;
  double Bio=(y-x)/z;
  for(double i=x+Bio; i<=y-Bio; i+=Bio)
  {
  sum+= Math.pow(Math.E,-Math.pow(i,2))*2;
  }
  sum+= Math.pow(Math.E,-Math.pow(x,2))+Math.pow(Math.E,-Math.pow(y,2));
  finalz= sum*Bio/2;
  return finalz;
}

}