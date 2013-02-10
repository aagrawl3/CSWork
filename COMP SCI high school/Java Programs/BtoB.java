import java.util.Scanner;
import java.lang.String;
public class BtoB{
public static void main(String[] args)
{
int num1, num2, num3;
Scanner inp=new Scanner(System.in);
System.out.println("Enter an integer then the base of that integer then the base you want this number converted to");
num1=inp.nextInt();
num2=inp.nextInt();
num3=inp.nextInt();
String converted=changebase(num1,num2,num3);
System.out.println(converted);
}
public static String changebase(int n, int base, int outbase)
{
int z=0;
int exp=0;
if (base>0 && outbase >0){
while (n>0)
{
z+=Math.pow(base,exp)*(n%10);
n=n/10;
exp++;
}}
String m="";
while (z>0)
{
int r=z%outbase;
m+=Integer.toString(r);
z=(z-r)/(outbase);
}
String converted="";
for (int i=0;i<m.length();i++)
{
converted+= m.charAt(m.length()-i-1);
}
return(converted);
}}