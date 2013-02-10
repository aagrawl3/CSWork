import java.util.*;
public class sim{
	
public static void main(String[] args){
		
Scanner inp = new Scanner(System.in);
		
System.out.println("Enter number of trials:");
		
int t1=inp.nextInt();
		
System.out.println("Enter number of heads to test:");
		
int t2=inp.nextInt();
		
double heads=0, nheads=0, prev=0, count=0.0;
		
while((nheads-prev >0.00001) || (prev-nheads < 0.001) || nheads==0.0){
			
count++;
			
prev=nheads;
			
for(int j=0; j<t1; j++){
				
if(Math.random()<=0.5)
					
{heads++;}
			
}
			
if(heads==t2)
				
{nheads++;}
			
nheads=nheads/count;
			
heads=0;
		
}
		
System.out.println("Probability: " + nheads);
	}
}