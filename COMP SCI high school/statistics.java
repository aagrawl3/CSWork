import java.util.*;
public class statistics
{
	public class shuffle(int[] whatever)
	{
		for(int i = whatever.length-1;i >=1;i--)
		{
			int temp = whatever[i];
			int j = (n-1)*(Math.random());
			whatever[i] = whatever[j];
			whatever[j] = temp;
		}
	}