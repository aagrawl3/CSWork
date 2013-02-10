import java.util.*;
public class shuffleTest{
public static void main(String[] args)
{
  Scanner inp = new Scanner(System.in);
  System.out.print("Input length of array: ");
  int length = inp.nextInt();
  Integer[] test = new Integer[length];
  Integer[] results;
  
  for(int i=0; i<length; i++){
   System.out.print("Input Integer for slot "+(i+1)+": ");
   test[i] = inp.nextInt();
  }
  
  int count = 0;
  for(int i=0; i<100; i++){
  shuffle<Integer> test1 = new shuffle<Integer> (test);
  results = test1.shuffleIt();
  
  if(results[4]==5) {count++;}
  
  System.out.print(results[0]);
  for(int j=1; j<length; j++){
   System.out.print(", "+results[j]);
  }
  System.out.println();
  }
  System.out.println(count);
}}