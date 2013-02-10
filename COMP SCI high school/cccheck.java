import java.util.*;
public class cccheck{
	public static void main(String[] args){
		Scanner card = new Scanner(System.in);
		String ccno = "";
		System.out.println("What is the card number?");
		ccno = card.nextLine();
		boolean valid = false;
		if (ccno.charAt(0)!='4'||ccno.charAt(0)!='5'||ccno.charAt(0)!='6'||ccno.substring(0,2)!="37")
			valid = false;
		else if (ccno.length()!=15||ccno.length()!=16)
			valid = false;
		else if (isValid(ccno))
			valid = true;
			
			System.out.println(isValid(ccno));			
	}
	
	public static boolean isValid(String x){
		String temp = "";
		int tempp = 0;
		int tempsum = 0;
		for(int i=1; i<=x.length(); i++){
			if (i%2==0){
				tempp = Character.getNumericValue(x.charAt(x.length()-i));
				temp+=Integer.toString(tempp*2);
			}
			else
				temp+=x.charAt(x.length()-i);
		}
		for(int j=1; j<=temp.length(); j++){
			tempsum += Character.getNumericValue(temp.charAt(temp.length()-j));
		}
		return(tempsum%10==0);
	}
}