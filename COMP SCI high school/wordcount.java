import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class wordcount
{	
	public static void main(String[]args) throws FileNotFoundException
	{
		File file = new File("File.txt");
		Scanner wee = new Scanner(file);
		String cool = new String("");
		while(wee.hasNext())
		{
			String whatever = wee.next();
			whatever = whatever.toLowerCase();
			cool += whatever;
			cool += " ";
		}
		Scanner main = new Scanner(System.in);
		System.out.println("Input the word you want to scan File.txt for:");
		String answer = main.nextLine();
		cool = cool.replace(".","");
		cool = cool.replace(",","");
		cool = cool.replace(";","");
		cool = cool.replace("?","");
		wordcounter(cool,answer);
	}
	
	public static void wordcounter(String cool,String answer)
	{
		HashMap<String, Integer> something = new HashMap<String, Integer>();
		Scanner random = new Scanner(cool);
		while(random.hasNext())
		{
			String nextWord = random.next();
			if(something.containsKey(nextWord))
			{
				int counter = something.get(nextWord);
				counter++;
				something.put(nextWord,counter);
			}
			else
			{
				something.put(nextWord,1);
			}
		}
		
		if(something.containsKey(answer))
		{
			int number = something.get(answer);
			System.out.println("The word " + answer + " appears " + number + " times");	
		}
		else
		{
			System.out.println("The word was not found");
		}
	}
}