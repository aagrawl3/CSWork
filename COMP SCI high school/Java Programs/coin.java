public class coin{
public static void main(String[] args)
{
int heads=0;
int tails=0;
for (int i=0;i<1000;i++)
{
if (Math.random()<0.5)
{
heads++;
}
else
{
tails++;
}
}
System.out.println("Heads: "+heads+"Tails: "+tails);
}}