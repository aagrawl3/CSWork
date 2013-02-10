public class vector2D{
  private double xcomp;
  private double ycomp;
  private double mag;
  private static int vector2DCount=0;


public static int getVectorCount()
{
  return(vector2DCount);
}


public vector2D(double x, double y)  //Constructor
{
  xcomp=x;
  ycomp=y;
  mag=magnitude();
  vector2DCount++;
}


public vector2D()	//Default constructor
{
  xcomp=0.0;
  ycomp=0.0;
  mag=magnitude();
  vector2DCount++;
}


public vector2D(double x)	//Other Constructor
{
  xcomp=x;
  ycomp=0.0;
  mag=magnitude();
  vector2DCount++;
}


public vector2D(vector2D wei)	//Copy constructor in C++
{
  xcomp=wei.getXcomp();
  ycomp=wei.getYcomp();
  mag=magnitude();
}


public double getXcomp()
{return(xcomp);}


public double getMag()
{return(mag);}


public double getYcomp()
{return(ycomp);}


public double magnitude()
{return(Math.sqrt(Math.pow(xcomp,2)+Math.pow(ycomp,2)));}


public String toString()	//toString method
{
  String retString="";
  retString="("+xcomp+","+ycomp+")";
  return retString;
}


public double angle()	//This method calculates angle of vector in relation to the positive x-axis
{
  double a1=Math.toDegrees(Math.atan(ycomp/xcomp));
  if(ycomp==0 && xcomp<0)
   {return(180.0);}
  else if(ycomp>0 && xcomp<0)
   {return(a1+180);}
  else if(ycomp<0 && xcomp>=0)
   {return(a1+360);}
  else if(ycomp<0 && xcomp<0)
   {return(a1+180);}
  else if(ycomp==0 && xcomp==0)
   {return(0.0);}
  else
   {return(a1);}
}


public void rotate(double theta)	//This method rotates a vector in counterclock-wise direction
{
  double xprime= xcomp*Math.cos(Math.toRadians(theta))-ycomp*Math.sin(Math.toRadians(theta));
  double yprime= xcomp*Math.sin(Math.toRadians(theta))+ycomp*Math.cos(Math.toRadians(theta));
  xcomp=xprime;
  ycomp=yprime;
}


public vector2D addVector(vector2D donny)	//This method adds vectors
{
  double x=xcomp+donny.getXcomp();
  double y=ycomp+donny.getYcomp();
  vector2D Z= new vector2D(x,y);
  return Z;
}


public double scalarProd(vector2D kevin)	//This method returns the scalar product
{
  return(xcomp*kevin.getXcomp()+ycomp*kevin.getYcomp());
}


public double angleBetween(vector2D zach)	//This method finds the angle between 2 vectors
{
  double scalar=xcomp*zach.getXcomp()+ycomp*zach.getYcomp();
  return (Math.toDegrees(Math.acos(scalar/mag/zach.getMag())));
}


public static double angle(vector2D johnw)	//Static angle function
{
  double xx=johnw.getXcomp();
  double yy=johnw.getYcomp();
  double a1=Math.toDegrees(Math.atan(yy/xx));
  if(yy==0 && xx<0)
   {return(180.0);}
  else if(yy>0 && xx<0)
   {return(a1+180);}
  else if(yy<0 && xx>=0)
   {return(a1+360);}
  else if(yy<0 && xx<0)
   {return(a1+180);}
  else if(yy==0 && xx==0)
   {return(0.0);}
  else
   {return(a1);}
}


public static double magnitude(vector2D vishnu)	//Static magnitude function
{ return Math.sqrt(Math.pow(vishnu.getXcomp(),2)+Math.pow(vishnu.getYcomp(),2));}


public static vector2D add(vector2D hydrogen, vector2D helium)	//Static add function
{
  double lithium=hydrogen.getXcomp()+helium.getXcomp();
  double boron=hydrogen.getYcomp()+helium.getYcomp();
  vector2D jingxi= new vector2D(lithium,boron);
  return jingxi;
}


public static vector2D subtract(vector2D yum, vector2D my)	//Static subtract function
{
  double bear=yum.getXcomp()-my.getXcomp();
  double frog=yum.getYcomp()-my.getYcomp();
  vector2D michelle= new vector2D(bear,frog);
  return michelle;
}


public static double scalarProd(vector2D kevin,vector2D prithvi)	//Static scalar product function
{
  return(prithvi.getXcomp()*kevin.getXcomp()+prithvi.getYcomp()*kevin.getYcomp());
}
}