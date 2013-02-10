public class Vector2D{
public double xcomp;
public double ycomp;
public double mag;
//public static int Vector2Dcount=0;
public Vector2D(double x,double y)
{
xcomp=x;
ycomp=y;
//Vector2Dcount++;
}
public double magnitude(){
return (Math.sqrt(Math.pow(xcomp,2)+Math.pow(ycomp,2)));
}
public double angle(){
return (Math.atan(ycomp/xcomp));
}
public void rotate(double theta){
double temp1=xcomp;
double temp2=ycomp;
xcomp=temp1*Math.cos(theta*(Math.PI/180))-temp2*Math.sin(theta*(Math.PI/180));
ycomp=temp1*Math.sin(theta*(Math.PI/180))+temp2*Math.cos(theta*(Math.PI/180));
System.out.println("The x component= "+xcomp+" and the y component= "+ycomp);
}
public double getxcomp()
{
return(xcomp);
}
public double getycomp()
{
return(ycomp);
}
public Vector2D addvector(Vector2D y)
{
double x=xcomp+y.getxcomp();
double y1=ycomp+y.getycomp();
Vector2D m=new Vector2D(x,y1);
return(m);
}
public double scalarproduct(Vector2D a)
{
double x2=xcomp*a.getxcomp();
double y2=ycomp*a.getycomp();
double g=x2+y2;
return(g);
}}

