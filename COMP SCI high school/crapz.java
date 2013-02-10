import java.util.*;
public class crapz{
	/*public static void main(String[] args){
		int wins = 0;
		int temp = 0;
		int point = 0;
		int d1 = 0;
		int d2 = 0;
		int val = 0;
		for(int i=0; i<500000; i++){
			d1 = roll();
			d2 =  roll();
			if(d1+d2==7)
				wins++;
			else if(d1+d2==11)
				wins++;
			else if(d1+d2==4||d1+d2==5||d1+d2==6||d1+d2==8||d1+d2==9||d1+d2==10){
				point=d1+d2;
				while(temp!=point){
					temp=roll() + roll();
					if(temp==point)
						wins++;	
					if(temp==7)
						break;
				}
			}
		}
		System.out.println((double)wins/500000);
	}*/
public static void main(String[] args)
 {
  double wins = 0;
  for (int i = 0; i < 500000; i++)
  {
   if (trial()) wins++;
  }
  System.out.println(wins/500000);
 }
 public static boolean trial2()
 {
	int c = roll() + roll();
	if (c == 7 || c == 11) return true;
	else if (c >3 && c <11)
	{
		int d = 0;
		while (c != d)
		{
			d = roll() + roll();
			if (c == d) return true;
			if (d == 7) return false;
		}
		
	}
	return false;
}
 public static boolean trial() 
 {
  int c = roll() + roll();
  if (c == 7 || c == 11) 
  {
   return true;
  }
  else if (c == 2 || c == 3 || c == 12)
  {
   return false;
  }

  while (1 == 1)
  {
   int d = roll() + roll();
   if (d == 7) return false;
   else if (d == c) return true;

  }
 }
 public static int roll()
 {
  int a = (int)(Math.random() * 6);
  return a + 1;
 }
}