import java.util.*;
public class baseConvert{
public static void main(String[] args)
{
  System.out.print("Input number in base x: ");
  Scanner inp=new Scanner(System.in);
  int number= inp.nextInt();
  System.out.print("Input x: ");
  int x= inp.nextInt();
  System.out.print("Input base of output: ");
  int base= inp.nextInt();
  System.out.println("\n"+number+" in base "+x+" = "+convert(number,x,base)+" in base "+base);
}


public static String convert(int number,int x,int base)
{
  String start=Integer.toString(number);
  String end="";
  String retstr="";
  String remain="";
  String finalz="";
  int neon=0;
  int total=0;
  int track=0;
  int kumar=0;


  for(int i=start.length()-1; i>=0; i--)	//Reverse String
  {
  end+=start.substring(i,i+1);
  }


  for(int i=0; i<end.length(); i++)	//Convert to base 10
  {
  neon=Integer.parseInt(end.substring(i,i+1));
  total+=neon*Math.pow(x,i);
  }


  while(total!=0)	//String remain collects remainder
  {
  kumar=total%base;
  remain+=kumar;
  total=total/base;
  }


  for(int i=remain.length()-1; i>=0; i--)	//Reverses String remain to get final
  {
  finalz+=remain.substring(i,i+1);
  }


  return finalz;
  }

}