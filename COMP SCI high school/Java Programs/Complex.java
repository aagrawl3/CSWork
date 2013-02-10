public class Complex{
private double re;
private double im;
public Complex(double real,double imag)
{
re=real;
im=imag;
}
public Complex(double real)
{
re=real;
im=0;
}
public Complex()
{
re=0;
im=0;
}
public double getre()
{
return(re);
}
public double getim()
{
return(im);
}
public static String imtostring(Complex a)
{
String b=Double.toString(a.getre());
String c=Double.toString(a.getim());
String d=b+"+"+c+"i";
return d;
}
public Complex getconjugate()
{
Complex z=new Complex(this.getre(),this.getim()*-1);
return z;
}
public static double getangle(Complex a)
{
double angle=Math.atan2(a.getim(),a.getre());
return(angle);
}
public Complex add(Complex a)
{
Complex p=new Complex(this.getre()+a.getre(),this.getim()+a.getim());
return p;
}
public Complex subtract(Complex a)
{
Complex p=new Complex(this.getre()-a.getre(),this.getim()-a.getim());
return p;
}
public Complex multiply(Complex a)
{
Complex p=new Complex(this.getre()*a.getre()-this.getim()*a.getim(),this.getre()*a.getim()+this.getim()*a.getre());
return p;
}
public Complex divide(Complex z)
{
double temp1=(this.getre()*z.getre()+this.getim()*z.getim())/(Math.pow(z.getre(),2)+Math.pow(z.getim(),2));
double temp2=(this.getim()*z.getre()-this.getre()*z.getim())/(Math.pow(z.getre(),2)+Math.pow(z.getim(),2));
Complex p=new Complex(temp1,temp2);
return(p);
}
public static Complex power(Complex a,double power)
{
double r=Math.sqrt(Math.pow(a.re,2)+Math.pow(a.im,2));
double temp1=Math.pow(r,power)*Math.cos(Complex.getangle(a)*power);
double temp2=Math.pow(r,power)*Math.sin(Complex.getangle(a)*power);
Complex root=new Complex(temp1,temp2);
return root;
}
}
