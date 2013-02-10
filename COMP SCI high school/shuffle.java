public class shuffle<T>{
  private T[] list;
  private int length;

public shuffle(T[] input)
{
  list = input;
  length = list.length;
}

public T[] shuffleIt()
{
  for(int i=0; i<length-1; i++){
   int randLength = (int)(Math.random()*(length-i))+i;
   T b = list[randLength];
   list[randLength] = list[i];
   list[i] = b;
  }
  return list;
}
}