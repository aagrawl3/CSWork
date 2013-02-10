import java.util.*;
public class reimanntest{
public static void main(String[] args)
{
Scanner inp=new Scanner(System.in);
System.out.println("Enter the beginning x-coordinate, the ending x-coordinate, and the number of rectangles");
double start=inp.nextDouble();
double end=inp.nextDouble();
int numrect=inp.nextInt();
double area=reimann.rrectangles(start,end,numrect);
System.out.println("Reimann Sum: " +area);
System.out.println("Enter the beginning x-coordinate, the ending x-coordinate, and the number of points");
double start2=inp.nextDouble();
double end2=inp.nextDouble();
int numpts=inp.nextInt();
double montecarloarea=reimann.montecarlo(start2,end2,numpts);
System.out.println("Montecarlo area: "+montecarloarea);
}}