public static String reverstr(String somestring)
{
int strlen=somestring.length();
String strret="";
for (int i=strlen-1;i>=0;i--)
{
strret+=somestring.substring(i,i+1);}
return(strret);
}