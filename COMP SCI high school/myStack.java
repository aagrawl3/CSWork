import java.util.*;
public class myStack<T>
{
	private ArrayList<T> alif = new ArrayList<T>();
	public T pop()
	{
		T whatever = alif.get(alif.size()-1);
		int last = alif.size()-1;
		alif.remove(last);
		return whatever;
	}

	public T peek()
	{
		int last = alif.size()-1;
		return alif.get(last);
	}

	public void push(T sarker)
	{
		alif.add(sarker);
	}

	public boolean empty()
	{
		return(alif.isEmpty());
	}

	public int Search(T pizza)
	{
		int size = alif.size();
		int alex = -1;
		for(int i = 0; i < size; i++)
		{
			if((alif.get(i).toString()).equals(pizza.toString()))
			{
				alex = i;
				break;
			}	
		}
		return alex;
	}
}