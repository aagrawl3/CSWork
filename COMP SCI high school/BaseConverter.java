import java.util.Scanner;
public class BaseConverter
{
        public static void main(String[] args)
        {
                Scanner inp = new Scanner(System.in);
                int start = 0;
                int end = 0;
                int original = 0;
                int fn = 0;
                System.out.print("Enter starting base: ");
                start = inp.nextInt();
                System.out.print("Enter final base: ");
                end = inp.nextInt();
                System.out.print("Enter the integer you want converted: ");
                original = inp.nextInt();
                int intermediate = change(original,start);
                int finalconversion = newbase(intermediate, end);
                System.out.print("The number in base " + end + " is " + finalconversion);
        }
 
        public static int change(int a, int b) 
        {
                String original = Integer.toString(a);
                int decimal = 0;
                for(int counter = 0; counter < original.length(); counter++)
                {
                        char temp = original.charAt(counter);
                        int tempint = Character.digit(temp,10);
                        double place = tempint*Math.pow(b,(original.length()-counter-1));
                        decimal += place;
                }
                return(decimal);
        }
 
        public static int newbase(int a, int b) 
        {
                String tempstring = "";
                int temp = a;
                while(temp >= b)
                {
                        temp = a/b;
                        tempstring += a%b;
                }      
                tempstring += temp;
 
                String finalstring = "";
                for(int counter = tempstring.length()-1; counter >= 0; counter--)
                {
                        finalstring += tempstring.charAt(counter);
                }      
 
                int finalint = Integer.parseInt(finalstring);
                return(finalint);
 
        }
}

